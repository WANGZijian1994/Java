package ListMethods;
import java.util.Arrays;
import java.util.Collections;
import java.util.ArrayList;
import java.util.List;
public class ExerciceDeExamenBlanc {
String[] tabCC= {"Pilatte","Belmellat","Gouret","Feler","Tanguy","Casalis","Bourquin","Sauvagnat"};
List<String>names=Arrays.asList(tabCC);

public void Inverser(String[] tab) {
	List<String>liste=Arrays.asList(tab);
	List<String>liste1=new ArrayList<>();
	for(int i=liste.size()-1;i>=0;i--) {
		liste1.add(liste.get(i));
	}
	System.out.println(liste1);
}

public boolean Chercher(String[] tab, String x) {
	boolean flag = false;
	for(String s:tab) {
		if (x==s) {
			flag=true;
		}
	}
	return flag;
}

public boolean Tri(String[] tab,String[] copy) {
	boolean flag = true;
	List<String>liste=Arrays.asList(tab);
	Collections.sort(liste);//这一步将和liste对应的指针的变量全部改变顺序，包括产生List的数组。
    for(int i=0;i<tab.length;i++) {
    	System.out.println(liste.get(i));
    	if(liste.get(i)!=copy[i]) {
    		flag=false;
    	}
    }
	return flag;
}

	public static void main(String[] args) {
		ExerciceDeExamenBlanc e=new ExerciceDeExamenBlanc();
		e.Inverser(e.tabCC);//[Sauvagnat, Bourquin, Casalis, Tanguy, Feler, Gouret, Belmellat, Pilatte]				
        System.out.println(e.Chercher(e.tabCC, "x"));//false
        System.out.println(e.Chercher(e.tabCC, "Gouret"));//true
        String[] PSV= {"Pilatte","Belmellat","Gouret","Feler","Tanguy","Casalis","Bourquin","Sauvagnat"};
        System.out.println(e.Tri(e.tabCC,PSV));
      
	}

}
