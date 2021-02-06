package lec.net_05_room;

import java.net.*;
import java.io.*;

public class MyClientRoom {
	
	public MyClientRoom() { 
	}
	
	public void startClient() throws Exception {
		var sout = System.out;
		
		sout.println( "Connecting to the server...." );
		var socket = new Socket("localhost", 3333);
		sout.println( "Connected to the server.\n" );
		
		var out = new DataOutputStream(socket.getOutputStream());
		var console = new BufferedReader(new InputStreamReader(System.in));
		
		// Enter name from console 
		var userName = "" ;
		while( userName.trim().length() < 1 ) {
			sout.print( "Enter your name : " );
			userName = console.readLine().trim();
			if( userName.trim().length() < 1 ) {
				sout.println( "WARN : Name is invalid!" );
			}
		}
		// -- Enter name from console.		
		
		var readThread = new ReadThread( socket );
		readThread.start();

		sout.println( "\nWELCOME TO MyCHAT System." );
		sout.println( "Enter \\stop to terminate!\n" );
		
		var stop = false ; 
		var consoleInMsg = "" ;
		
		while ( ! stop ) {
			sout.print( String.format("[%s] Enter message : ", userName ) );
			consoleInMsg = console.readLine(); 
			
			if( consoleInMsg.trim().equals( "\\stop" ) ) {
				stop = true ;	
				
				consoleInMsg = String.format( "User %s exited.", userName );
				out.writeUTF( String.format( "[%s] %s", userName, consoleInMsg ) );				
			} else if( consoleInMsg.startsWith( "\\n" ) ) {
				// 이름 변경하는 기능
				var name = consoleInMsg.replace( "\\n", "" ).trim();
				
				if( name.length() < 1 ) {
					sout.println( "Invalid name." );
				} else {
					sout.println( String.format( "Your name has changed to %s.", name ) ); 
					consoleInMsg = String.format( "%s's name has been changed to %s.", userName, name );
					out.writeUTF( String.format( "[%s] %s", userName, consoleInMsg ) );
					userName = name;
				}
				// -- 이름 변경하는 기능
			} else { 
				out.writeUTF( String.format( "[%s] %s", userName, consoleInMsg ) );
			}
			
			out.flush(); 
		}
		
		readThread.stopThread();

		out.close(); 
		socket.close();
		
		sout.println( "Good bye!" );
	}
	
	class ReadThread extends Thread {
		private DataInputStream in ;
		private boolean stop = false ; 
		
		public ReadThread(Socket socket ) throws Exception {
			this.in = new DataInputStream(socket.getInputStream()); 
		}
		
		public void stopThread() {
			this.stop = true ;
			this.interrupt();
		}
		
		public void run() {
			try {
				this.runImpl();
			} catch (Exception e) { 
				e.printStackTrace();
			}
		}
		
		public void runImpl() throws Exception {
			var in = this.in ; 
			var console = System.out;
			
			var svrMsg = "" ;
			while( ! stop && ( svrMsg = in.readUTF() ) != null ) {
				if( svrMsg.contains("\stop") ) {
					stop = true; 
				}
				console.println( svrMsg );
			};
		}
	} 
	
	public static void main(String args[]) throws Exception {
		var client = new MyClientRoom();
		
		client.startClient();
	}
}