package JavaApplet;

import java.applet.Applet;
import java.awt.Graphics;

public class test1 extends Applet{
	String sms;
	
	@Override
	public void init() {
		sms = "hello it'm";
	}

	@Override
	public void paint(Graphics g) {
		g.drawString(sms, 100, 200);
	}
}
