package ListMethods;
import java.util.ArrayList;
import java.util.List;
import java.util.Arrays;
import java.util.Collections;
public class ToutesLesMethodesPourArrayList {

	public static void main(String[] args) {
		List<String>names = new ArrayList<>();
		//1.List中添加，获取，删除元素。
		names.add("WANG Zijian");
		names.add("Shuai");
		names.add("Cheng");
		names.add("Choi");
		System.out.println(names);
		String[] noms = {"WANG Zijian","Shuai","Cheng","Choi"};
		List<String>names1=Arrays.asList(noms);
		System.out.println(names1);
		for(int i=0;i<names.size();i++) {//List的长度用size()而不是length()
			System.out.println(names.get(i));
		}
		names.remove(2);//注意只有ArrayList库里面才有add,remove这些功能(可以改变size)，Arrays里面没有(不能改变size)
		//names1.remove(2);
		System.out.println(names1);
		System.out.println(names);
		names.add(2, "Cheng");
		System.out.println(names);
		//2.List中查看元素是否存在.contains(String)
		boolean flag=names.contains("Cheng");//Python xx in xx
		System.out.println(flag);
		//3.设置元素中list的索引 .set(int,String) 可以用于Arrays,也可以用于ArrayList
		names1.set(0, "Students:");//将指定位置的元素直接改掉。
		System.out.println(names1);
		names.set(0, "Students:");
		System.out.println(names);
		names.add(1,"WANG Zijian");
		System.out.println(names);
		//4.查看某元素的位置（类似Python中的find）.indexOf() .lastIndexOf()
		System.out.println(names.indexOf("WANG Zijian"));
		System.out.println(names.lastIndexOf("WANG Zijian"));
		//5.利用list中索引位置重新生成一个新的list（截取集合）.subList(int,int)前闭后开。
		// 注意这种方法，如果修改subList的信息（比如添加元素到subList)那么原来的List也会改变
		List<String>subnames=new ArrayList<>();
		subnames = names.subList(1,names.size());
		System.out.println(subnames);
		List<String>subnamesChinois=new ArrayList<>();
		subnamesChinois = names.subList(1,names.size()-1);
		subnamesChinois.add(0,"Chinese Students:");//用到add和remove时候，所有的指针都会改变
		System.out.println("subList : "+subnamesChinois);
		System.out.println("Names : "+names);
		//6.判断list是否为空
		boolean flag1=names.isEmpty();
		boolean flag2=names1.isEmpty();
		System.out.println(flag1);
		System.out.println(flag2);
		//7.Hashcode()
		names.remove(1);
		List<String>copy = new ArrayList<>();
		copy=names;
		System.out.println("Copy of Names : "+copy);
		copy.hashCode();//copy不会变化
		System.out.println(copy);
		System.out.println(copy.hashCode());
		//8.判断两个List是否相等 。equal（）
		System.out.println(names1);
		System.out.println(names);
		boolean flag3 = names1.equals(names);
		System.out.println(flag3);
		  //names1.add(1,"WANG Zijian");
		flag3 = copy.equals(names);
		System.out.println(flag3);
		//9.将集合转换为字符串
		String listOfNames=copy.toString();
		System.out.println("copy : "+copy.subList(0, copy.size()));//copy自己不改变，
		System.out.println("ListOfName : "+listOfNames);
		//10.将集合转换为Arrays
		System.out.println(copy.toArray());
		//11.去重复： Collections.frequency(Listname,String)
		names.add("WANG Zijian");
		names.add("Shuai");
		names.add("WANG Zijian");
		System.out.println(names);
		List<String>nouvelle = new ArrayList<>();
		for(String name:names) {
			if(Collections.frequency(nouvelle, name)<1) {//记住这个方法
				nouvelle.add(name);
			}
		}
		System.out.println(nouvelle);
		//12.改变List的顺序，Collections.sort()
		nouvelle.remove(0);
		Collections.sort(nouvelle);
		System.out.println(nouvelle);
		System.out.println(names);
		
		
		
		
		

	}

}
