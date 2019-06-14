package CSV;

import org.apache.commons.csv.*;
import java.io.*;
import java.util.*;

public class Example {
//空指针异常发生在对象为空，但是引用这个对象的方法。例如： String s = null; //对象s为空(null) int length = s.length();//发生空指针异常  
	public static void main(String[] args) {
		Map<String,String>Stats = new HashMap<String,String>();
		Map<String,String>Stats1 = new HashMap<String,String>();
		int counter = 0;
		try {
			BufferedReader reader = new BufferedReader(new FileReader("/Users/zijian/ZijianJava/exports/exportdata.csv"));
			String line = reader.readLine();
			
			//System.out.println(line);
			while((line=reader.readLine())!=null) {
				int i = line.indexOf(",");
				String country = line.substring(0,i);
				int k = line.indexOf("$");
				String Value_in_dollars = line.substring(line.indexOf("$")+1,line.length()-1);
				String exports = line.substring(++i,k);
				if((exports.contains("sugar"))) {
					counter++;
					System.out.println(country);
				}
				String information = exports.concat(" ").concat(Value_in_dollars);
				Stats.put(country,information);
				int m = "999,999,999,999".length();
				int n = Value_in_dollars.length();
				if(n>m) {
					Stats1.put(country, Value_in_dollars);
				}
			
			}
			reader.close();
		}
		catch(Exception e) 
		{e.printStackTrace();
		}
		
		//System.out.println(Stats.get("Nauru"));
		System.out.println(Stats1);
		System.out.println(counter);
		//System.out.println("999,999,999,999".length());
	}
}
