package lec.net_03_multi;

import java.net.*;
import java.util.ArrayList;
import java.io.*;

class MyServerMulti {
	
	static ArrayList<SendThread> sendThreadList = new ArrayList<>();
	
	static ArrayList<String> msgList = new ArrayList<>();
	
	static synchronized void sendToAllClient( SendThread currThread ) throws Exception {
		while( msgList.size() > 0 ) {
			var msg = msgList.get(0);
			msgList.remove( 0 );
			
			// 모든 클라이언트에 메시지 전송 
			for( var sendThread : sendThreadList ) {
				if( sendThread != currThread ) { 
					sendThread.out.writeUTF( msg );
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
		
		public void runImpl() throws Exception {
			var in = this.in ;  
			var clientMsg = "" ;
			while( ! stop && ( clientMsg = in.readUTF() ) != null ) {
				if( clientMsg.contains("stop") ) {
					stop = true; 
				} else { 
					msgList.add( clientMsg ); 
					
					sendToAllClient( this );
				}
			};
		}
	}
	
	public static void main(String args[]) throws Exception {
		var sout = System.out; 
		
		ServerSocket serverSocket = new ServerSocket(3333);
		
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