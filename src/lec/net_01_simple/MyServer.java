package lec.net_01_simple;

import java.io.*;
import java.net.*;

public class MyServer {
	public static void main(String[] args) throws Exception {
		var out = System.out; 
		
		ServerSocket ss = new ServerSocket(6666);
		
		out.println( "Waiting a client." );		
		Socket s = ss.accept();// establishes connection
		
		out.println( "A client has been accepted." );
		
		DataInputStream dis = new DataInputStream(s.getInputStream());
		String str = (String) dis.readUTF();
		out.println("Message received on server = " + str);
		
		ss.close();
		
		out.println( "Good bye!" );
	}
}