package myClassTest;

public class Desk {
    private String color;
    private int length;
    private int width;
    private int height;
    public Desk() {
    	super();
    }
    public Desk(String color,int length,int width,int height) {
    	this.color=color;
    	this.length=length;
    	this.width=width;
    	this.height=height;
    }
    public String color() {
    	return color;
    }
    public int length() {
    	return length;
    }
    public int width() {
    	return width;
    }
    public int height() {
    	return height;
    }
    public double volume() {
    	double volume=length*width*height;
    	return volume;
    }
    public double surface() {
    	double surface = length()*width();
    	return surface;
    }
    public String getColor() {
    	return color;
    }
    public String changeColor(String newColor) {
    	this.color=newColor;
    	return color;
    }
    public void getInformationOfDesk() {
    	System.out.println("color : "+ getColor()+" Surface : "+surface()+" Volume : "+volume());
    	
    }
	public static void main(String[] args) {
		Desk d1=new Desk("Red",13,15,10);
		d1.getInformationOfDesk();
		d1.getColor();
		d1.changeColor("Blue");
		d1.getColor();
		d1.getInformationOfDesk();
	}

}
