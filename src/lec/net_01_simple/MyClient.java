package lec.net_01_simple;

import java.io.*;
import java.net.*;

public class MyClient {
	public static void main(String[] args) throws Exception {
		var sout = System.out; 
		
		sout.println( "Connecting to the server...." );
		Socket s = new Socket("localhost", 6666);
		sout.println( "Connected to the server." );
		
		DataOutputStream dout = new DataOutputStream(s.getOutputStream());
		var msg = "Hello...." ;
		
		dout.writeUTF( msg );
		
		sout.println( "Message sent = " + msg );
		
		dout.flush();
		dout.close();
		
		s.close();
		
		sout.println( "Good bye!" );
	}
}