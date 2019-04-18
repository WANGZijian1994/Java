package TrainArrangement;

public class Voyageur {
	protected String nom;
	protected String destination;
	protected int tempsDArriveeALaGare;
	protected Gare g;
	
	public Voyageur() {
		nom=" ";
		destination = " ";
		tempsDArriveeALaGare = 0;
	}
	
	public Voyageur(String name, String destination,int tempsDArriveeALaGare) {
		nom = name;
		this.destination = destination;
		this.tempsDArriveeALaGare = tempsDArriveeALaGare;
	}
	
	public synchronized void attendreTrain() {
		System.out.println("A "+g.time+" heures : "+this.nom + " est arrivé à la gare et attendre son train.");
	}
	
	public synchronized void prendreTrain() {
		System.out.println("A "+g.time+" heures : "+this.nom + " a pris son train vers la destination.");
	}
	
	public synchronized void arriverADestination() {
		System.out.println("A "+g.time+" heures : "+this.nom + " est arrivée à la destination.");
	}
	
	public String toString() {
		return nom;
	}
	
	public String getDestination() {return destination;}
}
