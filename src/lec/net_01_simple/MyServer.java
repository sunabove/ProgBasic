package lec.net_01_simple;

import java.io.*;
import java.net.*;

public class MyServer {
	public static void main(String[] args) throws Exception {
		var sout = System.out; 
		
		ServerSocket ss = new ServerSocket(6666);
		
		sout.println( "Waiting a client." );		
		Socket s = ss.accept();// establishes connection
		
		sout.println( "A client has been accepted." );
		
		DataInputStream dis = new DataInputStream(s.getInputStream());
		String str = (String) dis.readUTF();
		sout.println("Message received on server = " + str);
		
		ss.close();
		
		sout.println( "Good bye!" );
	}
}