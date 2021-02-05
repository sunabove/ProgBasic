package lec.net_04_multi;

import java.net.*;
import java.util.ArrayList;
import java.io.*;

class MyServerMulti {
	
	static ArrayList<SendThread> sendThreadList = new ArrayList<>();
	
	static ArrayList<String> msgList = new ArrayList<>();
	static int msgCount = 0 ; 
	
	static synchronized void sendToAllClient( SendThread currThread ) {
		while( msgList.size() > 0 ) {
			var msg = msgList.get(0);
			msgList.remove( 0 );
			
			// 모든 클라이언트에 메시지 전송 
			for( var sendThread : sendThreadList ) {
				if( sendThread != currThread ) { 
					try {
						sendThread.out.writeUTF( msg );
					} catch (IOException e) {
						// 에러가 발생하면 접속이 종료된 간주함.
						sendThread.stop = true;
						//  쓰레드 목록에서 제외한다.
						sendThreadList.remove( sendThread );
					}
				}
			}
		}
	}
	
	static class SendThread extends Thread {
		Socket socket ; 
		DataInputStream in ; 
		DataOutputStream out ; 
		
		boolean stop = false ; 
		
		public SendThread( Socket socket ) throws Exception {
			this.socket = socket ; 
			this.in = new DataInputStream( socket.getInputStream());
			this.out = new DataOutputStream( socket.getOutputStream());
		}
		
		public void run() {
			try {
				sendThreadList.add( this );
				
				this.runImpl();
			} catch (Exception e) { 
				e.printStackTrace();
			}
		}
		
		public void runImpl() {
			var in = this.in ;  
			var clientMsg = "" ;
			var sout = System.out ; 
			
			
			try {
				while( ! stop && ( clientMsg = in.readUTF() ) != null ) {
					msgCount ++ ; 
					sout.println( String.format( "[%03d] Message received = %s", msgCount, clientMsg ) );
					if( clientMsg.contains("stop") ) {
						stop = true; 
					} else { 
						msgList.add( clientMsg ); 
						
						sendToAllClient( this );
					}
				};
			} catch (IOException e) {
				stop = true ;
			}
			
			// 클라이언트와 접속이 종료되면 쓰레드 목록에서 제외한다.
			if( sendThreadList.contains( this) ) {
				sendThreadList.remove( this );
			}
		}
	}
	
	public static void main(String args[]) throws Exception {
		var sout = System.out; 
		
		var serverSocket = new ServerSocket(3333);
		
		sout.println( "Waiting a client ..." );	
		Socket socket ;
		while( ( socket = serverSocket.accept() ) != null ) {
			sout.println( "A client has been accepted." ); 
			
			var sendThread = new SendThread( socket ); 
			sendThread.start();
		} 
		
		serverSocket.close();
		
		sout.println( "Good bye!" );
	}
}