package Examen1718Socket;

import java.io.*;
import java.net.*;

public class Client {

	public static void main(String[] args) {
		try {
			InetAddress adresseClient = InetAddress.getLocalHost();
			while(true) {
				Socket socket = null;
				try {
					socket = new Socket(adresseClient,1077);
					DataInputStream info = new DataInputStream(socket.getInputStream());
					DataOutputStream out = new DataOutputStream(socket.getOutputStream());
					String mot = new BufferedReader(new InputStreamReader(System.in)).readLine();
					out.writeUTF(mot);
					
					String reponse = info.readUTF();
					System.out.println("La réponse du serveur : "+reponse);
					
					out.close();
					info.close();
				} catch (IOException e) {
					e.printStackTrace();
				} finally {
					if(socket!=null) {
						try {
							socket.close();
						}catch(IOException e) {
							socket = null;
							e.printStackTrace();
						}
					}
				}
			}
		}catch (UnknownHostException e) {
			e.printStackTrace();
		}

	}

}
