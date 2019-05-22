package ChatBox;

import java.io.*;
import java.net.*;
import java.util.*;

public class Client {

	public static void main(String[] args) throws Exception{
		InetAddress adresseLocale = InetAddress.getLocalHost();
		while(true) {
			Socket socket = null;
			try {
				socket = new Socket(adresseLocale,2050);
				
				//lire des données du serveur
				DataInputStream input = new DataInputStream(socket.getInputStream());
				//envoyer des données au serveur
				DataOutputStream out = new DataOutputStream(socket.getOutputStream());
				String str = new BufferedReader(new InputStreamReader(System.in)).readLine();
				out.writeUTF(str);
				
				String ret = input.readUTF();
				System.out.println("Réponse du serveur : "+ret);
				if(ret=="OK") {
					System.out.println("Le serveur va se fermer : ");
					Thread.sleep(500);
					break;
				}
				
				out.close();
				input.close();			
			}catch(Exception e) {
				e.printStackTrace();
			}finally {
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
		

	}

}
