package Examen1718Socket;

import java.util.*;
import java.io.*;
import java.net.*;
public class Server {

	public static void main(String[] args) {
		System.out.println("Le serveur a commencé à travailler : ");
		Server central = new Server();
		central.init();
	}
	
	public void init() {
		try {
			ServerSocket serversocket = new ServerSocket(1077);
			while(true) {
				Socket client = serversocket.accept();
				new HandlerThread(client);
			}
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	
	private class HandlerThread implements Runnable{
		private Socket socket;
		public HandlerThread(Socket s) {
			socket = s;
			new Thread(this).start();
		}
		
		public String dictionnary(String mot) {
			Map<String,String> vocabulaire = new HashMap<String,String>();
			vocabulaire.put("dog","chien");
			vocabulaire.put("bitter","âpre");
			vocabulaire.put("cat","chat");
			vocabulaire.put("fuck", "merde");
			String value = vocabulaire.get(mot);
			return value;
		}
		
		public void run() {
			try {
				DataInputStream motDeClient = new DataInputStream(socket.getInputStream());
				String mot = motDeClient.readUTF();
				System.out.println("Le serveur a reçu le mot, c'est "+mot.toLowerCase());
				String definition = dictionnary(mot);
				DataOutputStream reponseAuClient = new DataOutputStream(socket.getOutputStream());
				reponseAuClient.writeUTF(definition);
				
				reponseAuClient.close();
				motDeClient.close();
				
			} catch (IOException e) {
				e.printStackTrace();
			} finally {
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
