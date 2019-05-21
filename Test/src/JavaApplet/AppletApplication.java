package JavaApplet;

import java.applet.*;
import java.awt.*;
import java.io.IOException;
import javax.swing.*;
import java.net.*;

public class AppletApplication extends Applet{
	String adresse;
	
	@Override 
	public void init() {
		InetAddress adresseClient;
		try {
			adresseClient = InetAddress.getLocalHost();
			adresse = adresseClient.toString();}
		catch (UnknownHostException e) {
			e.printStackTrace();
		};
	}
	
	public void paint(Graphics g) {
		g.drawString(adresse, 50, 50);

	}	
}
