package lec.net_01_copy;

import java.io.*;
import java.net.*;

public class MyServerCopy {
	public static void main(String[] args) throws Exception {
		var sout = System.out; 
		
		ServerSocket serverSocket = new ServerSocket( 8080 );
		
		sout.println( "Waiting a client ..." );
		// 클라이언트 접속을 기다려서, 접속하면 소켓을 생성한다.
		Socket socket = serverSocket.accept();
		
		sout.println( "A client has been accepted." );
		
		DataInputStream in = new DataInputStream( socket.getInputStream() );		
		var fileCopy = new FileOutputStream("C:\\Temp\\my_image_copy.png");
		
		sout.println( "Receiving an image file from a client ..." );
		
		int i;		
		while( ( i = in.read() ) > -1 ) {
			// 소켓에서 한 바이트 씩 읽어서, 복사 파일에 한 바이트 씩 쓴다.
			fileCopy.write( i );
		}
		
		// 버퍼에서 물리적 파일로 보낸다.
		fileCopy.flush();		
		// 다 사용한 자원들을 닫는다.
		fileCopy.close();
		
		in.close();
		socket.close();
		
		serverSocket.close();
		
		sout.println( "The image file has been copied." );		
		sout.println( "Good bye!" );
	}
}