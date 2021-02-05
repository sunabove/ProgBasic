package lec.net_01_simple;

import java.io.*;
import java.net.*;

public class MyClient {
	public static void main(String[] args) throws Exception {
		var sout = System.out; 
		
		sout.println( "Connecting to the server...." );
		
		// 서버를 접속한다.
		var socket = new Socket( "localhost", 6666 );
		sout.println( "Connected to the server." );
		
		var out = new DataOutputStream( socket.getOutputStream() );
		
		var msg = "[Hello....]" ;
		
		out.write( 1 );
		
		out.writeUTF( msg );
		
		sout.println( "Message sent = " + msg );
		
		out.flush();
		out.close();
		
		socket.close();
		
		sout.println( "Good bye!" );
	}
}