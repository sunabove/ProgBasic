package lec.net_02_readwrite;

import java.net.*;
import java.io.*;

class MyClientReadWrite {
	public static void main(String args[]) throws Exception {
		var out = System.out;
		
		out.println( "Connecting to the server...." );
		Socket s = new Socket("localhost", 3333);
		out.println( "Connected to the server." );
		
		DataInputStream in = new DataInputStream(s.getInputStream());
		DataOutputStream output = new DataOutputStream(s.getOutputStream());
		BufferedReader console = new BufferedReader(new InputStreamReader(System.in));

		String str = "", str2 = "";
		while (!str.equals("stop")) {
			str = console.readLine();
			output.writeUTF(str);
			output.flush();
			str2 = in.readUTF();
			System.out.println("Server says: " + str2);
		}

		output.close();
		s.close();
		
		out.println( "Good bye!" );
	}
}