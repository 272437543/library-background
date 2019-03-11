package com.drake.pylistener;

import java.io.BufferedReader;
import java.io.DataInputStream;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.ServerSocket;
import java.net.Socket;

public class PyListener {
	public static void main(String[] args) {
		new PyListener().buildService(9090);
	}
	String ret = "";
	public void buildService(int port)
	{
		System.out.println("listened on " + port);
		try {
			ServerSocket ss = new ServerSocket(port);
			while (true)
			{
				Socket socket = ss.accept();
				System.out.println("get connected");
				InputStream is = new DataInputStream(socket.getInputStream());
				byte[] b = new byte[is.available()];
				is.read(b);
				
				String input = new String(b);
				System.out.println("receive: " + input);
				ret = input;
				
				
				is.close();
				
			}
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	public String getDataFromPython()
	{
		return ret;
	}
}
