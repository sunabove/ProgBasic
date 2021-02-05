package lec.net_01_copy;

import java.io.*;
import java.net.*;

public class MyClientCopy {
	public static void main(String[] args) throws Exception {
		var sout = System.out; 
		
		sout.println( "Connecting to the server...." );
		// 받을 사람 ip 주소 
		//String host = "localhost" ; // "192.168.0.39";
		//String host = "sunabove.iptime.org";
		String host = "192.168.75.135";
		
		// 서버를 접속한다.
		Socket socket = new Socket( host, 8080 );
		sout.println( "Connected to the server." );
		
		DataOutputStream out = new DataOutputStream( socket.getOutputStream() );
		
		sout.println( "Coping an image file ..... " );
		
		var fileOrg = new FileInputStream("C:\\Temp\\my_image.png");
		
		int i ;
		while( ( i = fileOrg.read() ) > -1  ) {
			// 전송할 파일에서 한 바이트 씩 읽어서, 소켓에 한 바이트 씩 쓴다.
			out.write( i );
		}
		
		// 다 사용한 자원들을 닫는다.
		fileOrg.close();	
		
		out.flush();
		out.close();		
		socket.close();
		
		sout.println( "A image file has been transfered to the server." );		
		sout.println( "Good bye!" );
	}
}