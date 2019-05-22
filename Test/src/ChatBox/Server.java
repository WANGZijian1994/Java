package ChatBox;

import java.io.*;
import java.net.*;
import java.util.*;

public class Server {

	public static void main(String[] args){
		Server central = new Server();
		central.init();
	}
	
	public void init() {
		try {
			ServerSocket serverSocket = new ServerSocket(2050);
			while (true) {
				Socket client = serverSocket.accept();
				new HandlerThread(client);
			}
		}catch(Exception e) {
			e.printStackTrace();
		}
	}
	
	private class HandlerThread implements Runnable {
		private Socket socket;
		public HandlerThread(Socket client) {
			socket = client;
			new Thread(this).start();
		}
		
		public void run() {
			try {
				//lire des informations des clients
				DataInputStream input = new DataInputStream(socket.getInputStream());
				String clientInputStr = input.readUTF();
				//traiter des informations des clients
				System.out.println("Les informations des clients : "+clientInputStr);
				//Répondre aux clients
				DataOutputStream out = new DataOutputStream(socket.getOutputStream());
				String s = new BufferedReader(new InputStreamReader(System.in)).readLine();
				out.writeUTF(s);
				
				out.close();
				input.close();
			}
			catch(Exception e) {
				e.printStackTrace();
			}
			finally {
				if(socket!=null) {
					try {socket.close();}
					catch(Exception e) {
						socket = null;
						e.printStackTrace();
					}
				}
			}
		}
	}
}
