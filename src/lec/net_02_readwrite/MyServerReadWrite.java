package lec.net_02_readwrite;

import java.net.*;
import java.io.*;

class MyServerReadWrite {
	public static void main(String args[]) throws Exception {
		var out = System.out; 
		
		ServerSocket ss = new ServerSocket(3333);
		
		out.println( "Waiting a client." );	
		Socket s = ss.accept();
		out.println( "A client has been accepted." );
		
		DataInputStream din = new DataInputStream(s.getInputStream());
		DataOutputStream dout = new DataOutputStream(s.getOutputStream());
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		String str = "", str2 = "";
		while (!str.equals("stop")) {
			str = din.readUTF();
			System.out.println("client says: " + str);
			str2 = br.readLine();
			dout.writeUTF(str2);
			dout.flush();
		}
		
		din.close();
		s.close();
		ss.close();
		
		out.println( "Good bye!" );
	}
}