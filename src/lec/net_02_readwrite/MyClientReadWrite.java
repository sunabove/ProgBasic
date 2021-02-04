package lec.net_02_readwrite;

import java.net.*;
import java.io.*;

class MyClientReadWrite {
	public static void main(String args[]) throws Exception {
		var sout = System.out;
		
		sout.println( "Connecting to the server...." );
		Socket s = new Socket("localhost", 3333);
		sout.println( "Connected to the server." );
		
		DataInputStream in = new DataInputStream(s.getInputStream());
		DataOutputStream out = new DataOutputStream(s.getOutputStream());
		BufferedReader console = new BufferedReader(new InputStreamReader(System.in));

		String str = "", str2 = "";
		while (!str.equals("stop")) {
			str = console.readLine();
			out.writeUTF(str);
			out.flush();
			str2 = in.readUTF();
			System.out.println("Server says: " + str2);
		}

		out.close();
		s.close();
		
		sout.println( "Good bye!" );
	}
}