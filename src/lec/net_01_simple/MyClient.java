package lec.net_01_simple;

import java.io.*;
import java.net.*;

public class MyClient {
	public static void main(String[] args) throws Exception {
		var sout = System.out; 
		
		sout.println( "Connecting to the server...." );
		Socket s = new Socket("localhost", 6666);
		sout.println( "Connected to the server." );
		
		DataOutputStream out = new DataOutputStream(s.getOutputStream());
		var msg = "Hello...." ;
		
		out.writeUTF( msg );
		
		sout.println( "Message sent = " + msg );
		
		out.flush();
		out.close();
		
		s.close();
		
		sout.println( "Good bye!" );
	}
}