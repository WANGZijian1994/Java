package ListMethods;
import java.util.ArrayList;
import java.util.List;
import java.util.Arrays;
import java.util.Collections;
public class ToutesLesMethodesPourArrayList {

	public static void main(String[] args) {
		List<String>names = new ArrayList<>();
		//1.List����ӣ���ȡ��ɾ��Ԫ�ء�
		names.add("WANG Zijian");
		names.add("Shuai");
		names.add("Cheng");
		names.add("Choi");
		System.out.println(names);
		String[] noms = {"WANG Zijian","Shuai","Cheng","Choi"};
		List<String>names1=Arrays.asList(noms);
		System.out.println(names1);
		for(int i=0;i<names.size();i++) {//List�ĳ�����size()������length()
			System.out.println(names.get(i));
		}
		names.remove(2);//ע��ֻ��ArrayList���������add,remove��Щ����(���Ըı�size)��Arrays����û��(���ܸı�size)
		//names1.remove(2);
		System.out.println(names1);
		System.out.println(names);
		names.add(2, "Cheng");
		System.out.println(names);
		//2.List�в鿴Ԫ���Ƿ����.contains(String)
		boolean flag=names.contains("Cheng");//Python xx in xx
		System.out.println(flag);
		//3.����Ԫ����list������ .set(int,String) ��������Arrays,Ҳ��������ArrayList
		names1.set(0, "Students:");//��ָ��λ�õ�Ԫ��ֱ�Ӹĵ���
		System.out.println(names1);
		names.set(0, "Students:");
		System.out.println(names);
		names.add(1,"WANG Zijian");
		System.out.println(names);
		//4.�鿴ĳԪ�ص�λ�ã�����Python�е�find��.indexOf() .lastIndexOf()
		System.out.println(names.indexOf("WANG Zijian"));
		System.out.println(names.lastIndexOf("WANG Zijian"));
		//5.����list������λ����������һ���µ�list����ȡ���ϣ�.subList(int,int)ǰ�պ󿪡�
		// ע�����ַ���������޸�subList����Ϣ���������Ԫ�ص�subList)��ôԭ����ListҲ��ı�
		List<String>subnames=new ArrayList<>();
		subnames = names.subList(1,names.size());
		System.out.println(subnames);
		List<String>subnamesChinois=new ArrayList<>();
		subnamesChinois = names.subList(1,names.size()-1);
		subnamesChinois.add(0,"Chinese Students:");//�õ�add��removeʱ�����е�ָ�붼��ı�
		System.out.println("subList : "+subnamesChinois);
		System.out.println("Names : "+names);
		//6.�ж�list�Ƿ�Ϊ��
		boolean flag1=names.isEmpty();
		boolean flag2=names1.isEmpty();
		System.out.println(flag1);
		System.out.println(flag2);
		//7.Hashcode()
		names.remove(1);
		List<String>copy = new ArrayList<>();
		copy=names;
		System.out.println("Copy of Names : "+copy);
		copy.hashCode();//copy����仯
		System.out.println(copy);
		System.out.println(copy.hashCode());
		//8.�ж�����List�Ƿ���� ��equal����
		System.out.println(names1);
		System.out.println(names);
		boolean flag3 = names1.equals(names);
		System.out.println(flag3);
		  //names1.add(1,"WANG Zijian");
		flag3 = copy.equals(names);
		System.out.println(flag3);
		//9.������ת��Ϊ�ַ���
		String listOfNames=copy.toString();
		System.out.println("copy : "+copy.subList(0, copy.size()));//copy�Լ����ı䣬
		System.out.println("ListOfName : "+listOfNames);
		//10.������ת��ΪArrays
		System.out.println(copy.toArray());
		//11.ȥ�ظ��� Collections.frequency(Listname,String)
		names.add("WANG Zijian");
		names.add("Shuai");
		names.add("WANG Zijian");
		System.out.println(names);
		List<String>nouvelle = new ArrayList<>();
		for(String name:names) {
			if(Collections.frequency(nouvelle, name)<1) {//��ס�������
				nouvelle.add(name);
			}
		}
		System.out.println(nouvelle);
		//12.�ı�List��˳��Collections.sort()
		nouvelle.remove(0);
		Collections.sort(nouvelle);
		System.out.println(nouvelle);
		System.out.println(names);
		
		
		
		
		

	}

}
