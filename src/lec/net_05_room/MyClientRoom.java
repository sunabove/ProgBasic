package lec.net_05_room;

import java.net.*;
import java.io.*;

public class MyClientRoom {
	
	public static final String ANSI_RESET = "\u001B[0m";
	public static final String ANSI_BLACK = "\u001B[30m";
	public static final String ANSI_RED = "\u001B[31m";
	public static final String ANSI_GREEN = "\u001B[32m";
	public static final String ANSI_YELLOW = "\u001B[33m";
	public static final String ANSI_BLUE = "\u001B[34m";
	public static final String ANSI_PURPLE = "\u001B[35m";
	public static final String ANSI_CYAN = "\u001B[36m";
	public static final String ANSI_WHITE = "\u001B[37m"; 
	
	public MyClientRoom() { 
	}
	
	public String red( String text ) {
		return this.color( text, ANSI_RED);
	}
	
	public String green( String text ) {
		return this.color( text, ANSI_GREEN );
	}
	
	public String blue( String text ) {
		return this.color( text, ANSI_BLUE);
	}
	
	public String color(String text, String ansiColor ) {
		return ansiColor + text + ANSI_RESET; 
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

		sout.println( String.format( "\nWELCOME TO %s System.", green("MyChat") ) );
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
					sout.println( String.format( "Your name has changed to %s.", green( name ) ) ); 
					consoleInMsg = String.format( "%s's name has been changed to %s.", green( userName ) , red( name ) );
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
		
		public void runImpl() {
			var in = this.in ; 
			var console = System.out;
			
			var svrMsg = "" ;
			while( ! stop ) {
				try { 
					svrMsg = in.readUTF();
				} catch ( Exception e ) {
					svrMsg = null ;
					stop = true ; 
				}
						
				if( null == svrMsg ) {					
				} else if( svrMsg.contains("\stop") ) {
					stop = true; 
				}
				
				if( null != svrMsg ) { 
					console.println( svrMsg );
				}
			};
		}
	} 
	
	public static void main(String args[]) {
		var sout = System.out ; 
		
		var client = new MyClientRoom();
		
		try {
			client.startClient();
		} catch (Exception e) {
			sout.println( "Good bye!" );
		}
	}
}