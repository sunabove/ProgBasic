package lec.net_02_readwrite;

import java.net.*;
import java.io.*;

class MyServerReadWrite {
	public static void main(String args[]) throws Exception {
		var sout = System.out; 
		
		ServerSocket serverSocket = new ServerSocket(3333);
		
		sout.println( "Waiting a client ..." );	
		Socket socket = serverSocket.accept();
		sout.println( "A client has been accepted." ); 
		
		DataInputStream in = new DataInputStream(socket.getInputStream());
		DataOutputStream out = new DataOutputStream(socket.getOutputStream());
		BufferedReader console = new BufferedReader(new InputStreamReader(System.in));

		var strClient = "";
		var strConsole = "";
		
		while (! strClient.equals("stop")) {
			strClient = in.readUTF();
			System.out.println("client says: " + strClient);
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