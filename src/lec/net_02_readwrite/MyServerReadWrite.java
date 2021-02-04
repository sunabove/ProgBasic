package lec.net_02_readwrite;

import java.net.*;
import java.io.*;

class MyServerReadWrite {
	public static void main(String args[]) throws Exception {
		var sout = System.out; 
		
		ServerSocket ss = new ServerSocket(3333);
		
		sout.println( "Waiting a client." );	
		Socket s = ss.accept();
		sout.println( "A client has been accepted." ); 
		
		DataInputStream in = new DataInputStream(s.getInputStream());
		DataOutputStream out = new DataOutputStream(s.getOutputStream());
		BufferedReader console = new BufferedReader(new InputStreamReader(System.in));

		String str = "", str2 = "";
		while (!str.equals("stop")) {
			str = in.readUTF();
			System.out.println("client says: " + str);
			str2 = console.readLine();
			out.writeUTF(str2);
			out.flush();
		}
		
		in.close();
		s.close();
		ss.close();
		
		sout.println( "Good bye!" );
	}
}