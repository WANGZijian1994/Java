package TrainArrangement;

import java.util.*;

public class Gare implements Runnable{
	protected Voyageur v;
	protected Train t;
	static int time = 6;//Il est 6 heures maintenant.
	
	public Gare(Voyageur v, Train t) {
		this.v = v;
		this.t = t;
	}
	
	public void run(){//Avant midi
		if(v.destination==t.destination) {
			
			while(time<24) {
				if(v.tempsDArriveeALaGare>t.heureEntreeEnGare) {System.out.println(v.nom + " is too late for train.");break;}
				else {
					if(time>=v.tempsDArriveeALaGare&&time<t.heureEntreeEnGare) {
						v.attendreTrain();
					}
					else {
							if(time==t.heureEntreeEnGare) {
								t.arriverEnGare();}
							if(time==t.tempsDeTrajet+t.heureEntreeEnGare) {
								t.arriverADestination();
								Thread.interrupted();
							}	
					}
				}
				time++;
		}
		}
		else {
			System.out.println(v.nom+ " a mal choisi le train.");
		}
	}

	public static void main(String[] args) {
		Voyageur Jean = new Voyageur("Jean","Toulouse",8);
		Voyageur Fang = new Voyageur("Fang","Toulouse",9);
		Voyageur Marie = new Voyageur("Marie","Toulouse",11);
		Voyageur Zijian = new Voyageur("Zijian","Nancy",7);
		Voyageur k = new Voyageur("K","Nanterre",10);
		Train A = new Train("A","Nancy",9,2,Zijian);
		Train B = new Train("B","Toulouse",10,5,Fang);
		Train C = new Train("C","Toulouse",12,5,Jean);
		Thread t1 = new Thread(new Gare(Zijian,A));
		Thread t4 = new Thread(new Gare(Marie,B));
		Thread t3 = new Thread(new Gare(Jean,C));
		Thread t2 = new Thread(new Gare(Fang,B));
		Thread t5 = new Thread(new Gare(k,B));
		//Du 6 heures à 18 heures.
		t1.setPriority(10);
		t1.start();
		t2.start();
		t3.start();
		t4.start();
		t5.start();		
	}
}