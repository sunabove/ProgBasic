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
				console.println();
				console.println( svrMsg );
			};
		}
	}
	
	public static void main(String args[]) throws Exception {
		var sout = System.out;
		
		sout.println( "Connecting to the server...." );
		Socket socket = new Socket("localhost", 3333);
		sout.println( "Connected to the server." );
		
		DataInputStream in = new DataInputStream(socket.getInputStream());
		DataOutputStream out = new DataOutputStream(socket.getOutputStream());
		BufferedReader console = new BufferedReader(new InputStreamReader(System.in));
		
		var thread = new ReadThread( in );
		thread.run();

		var str = "" ;
		var userName = "John" ; 
		
		while ( !str.equals("stop")) {
			str = console.readLine();
			out.writeUTF( userName + " " + str);
			out.flush(); 
		}
		
		thread.stop = true;

		out.close();
		socket.close();
		
		sout.println( "Good bye!" );
	}
}