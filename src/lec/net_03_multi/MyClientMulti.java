package lec.net_03_multi;

import java.net.*;
import java.io.*;

class MyClientMulti {
	
	static class ReadThread extends Thread {
		DataInputStream in ; 
		
		boolean stop = false ; 
		
		public ReadThread(DataInputStream in ) {
			this.in = in ; 
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
				if( svrMsg.contains("stop") ) {
					stop = true; 
				}
				//console.println();
				console.println( svrMsg );
			};
		}
	}
	
	public static void main(String args[]) throws Exception {
		var sout = System.out;
		
		sout.println( "Connecting to the server...." );
		Socket socket = new Socket("localhost", 3333);
		sout.println( "Connected to the server.\n" );
		
		DataInputStream in = new DataInputStream(socket.getInputStream());
		DataOutputStream out = new DataOutputStream(socket.getOutputStream());
		BufferedReader console = new BufferedReader(new InputStreamReader(System.in));
		
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
		
		var thread = new ReadThread( in );
		thread.start();

		sout.println( "\nWELCOME TO CHAT System." );
		sout.println( "Enter stop to terminate!\n" );
		
		var clientInputMsg = "" ;
		
		while ( !clientInputMsg.equals("stop")) {
			sout.print( String.format("[%s] Enter message : ", userName ) );
			clientInputMsg = console.readLine();
			clientInputMsg = clientInputMsg.trim();
			out.writeUTF( String.format( "[%s] %s", userName, clientInputMsg ) );
			out.flush(); 
		}
		
		thread.stop = true;

		out.close();
		socket.close();
		
		sout.println( "Good bye!" );
	}
}