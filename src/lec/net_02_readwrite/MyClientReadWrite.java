package lec.net_02_readwrite;

import java.net.*;
import java.io.*;

class MyClientReadWrite {
	public static void main(String args[]) throws Exception {
		var out = System.out;
		
		out.println( "Connecting to the server...." );
		Socket s = new Socket("localhost", 3333);
		out.println( "Connected to the server." );
		
		DataInputStream din = new DataInputStream(s.getInputStream());
		DataOutputStream dout = new DataOutputStream(s.getOutputStream());
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		String str = "", str2 = "";
		while (!str.equals("stop")) {
			str = br.readLine();
			dout.writeUTF(str);
			dout.flush();
			str2 = din.readUTF();
			System.out.println("Server says: " + str2);
		}

		dout.close();
		s.close();
		
		out.println( "Good bye!" );
	}
}