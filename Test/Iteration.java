package tp4;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Map;
/**
 * @author wang zijian
 *
 */
public class Iteration {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		String [] prenoms = {"Christian","Karen","Victoria","Agatha","Philippe","Damj��"};
        for(int i=0;i<prenoms.length;i++){
        	if (prenoms[i]==getfirstletter()){int imin=i;System.out.println(imin);}}
        
        }
	
	public static String getfirstletter() {
			String [] prenoms = {"Christian","Karen","Victoria","Agatha","Philippe","Damj��"};
	        String [] names=prenoms;
	        List<String>list1=Arrays.asList(names);
			Collections.sort(list1);//��һ����ָ��ȫ���ı��ˡ�
			String firstletter=list1.get(0);
            return firstletter;
		}

}
