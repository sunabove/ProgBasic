package lec.net_03_readwrite;

import java.net.*;
import java.io.*;

public class MyServerReadWrite {
	public static void main(String args[]) throws Exception {
		var sout = System.out; 
		
		var serverSocket = new ServerSocket(3333);
		
		sout.println( "Waiting a client ..." );	
		var socket = serverSocket.accept();
		sout.println( "A client has been accepted." ); 
		
		var in = new DataInputStream(socket.getInputStream());
		var out = new DataOutputStream(socket.getOutputStream());
		var console = new BufferedReader(new InputStreamReader(System.in));

		var strClient = "";
		var strConsole = "";
		
		while (! strClient.equals("stop")) {
			strClient = in.readUTF();
			sout.println("client says: " + strClient);
			strConsole = console.readLine();
			out.writeUTF(strConsole);
			out.flush();
		}
		
		in.close();
		socket.close();
		serverSocket.close();
		
		sout.println( "Good bye!" );
	}
}