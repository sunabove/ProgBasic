package lec.net_01_simple;

import java.io.*;
import java.net.*;

public class MyServer {
	public static void main(String[] args) throws Exception {
		var sout = System.out; 
		
		var serverSocket = new ServerSocket( 6666 );
		
		sout.println( "Waiting a client ..." );
		// 클라이언트 접속을 기다려서, 접속하면 소켓을 생성한다.
		var socket = serverSocket.accept();
		
		sout.println( "A client has been accepted." );
		
		var in = new DataInputStream( socket.getInputStream() );
		
		int i = in.read();
		
		sout.println( "i = " + i );
		
		var str = (String) in.readUTF();
		
		sout.println("Message received on server = " + str);
		
		serverSocket.close();
		
		sout.println( "Good bye!" );
	}
}