package TrainArrangement;

import java.util.*;

public class Train {
	protected String nomDeLigne;
	protected String destination;
	protected int heureEntreeEnGare;
	protected int tempsDeTrajet;
	protected Voyageur v;
	protected Gare g;
	
	public Train(){}
	
	public Train(String s1, String s2,int i, int j) {
		heureEntreeEnGare = i;
		tempsDeTrajet = j;
		nomDeLigne = s1;
		destination = s2;
	}
	
	public Train(String s1, String s2,int i, int j, Voyageur v) {
		heureEntreeEnGare = i;
		tempsDeTrajet = j;
		nomDeLigne = s1;
		destination = s2;
		this.v = v;
	}
	
	public synchronized void arriverEnGare() {
		if(g.time<=24) {
		System.out.println("A "+g.time+" heures : "+"Le train " + this.nomDeLigne + " à destination de " + this.destination + " est prêt pour l'embarquement.");
		if(v.tempsDArriveeALaGare<heureEntreeEnGare) {
				v.prendreTrain();
			}
		}
	}
	
	public synchronized void arriverADestination() {
		if(g.time<=24) {
		System.out.println("A "+g.time+" heures : "+"Le train "+this.nomDeLigne+ " est arrivé à la destination "+this.destination);
		v.arriverADestination();
		}
	}
}
