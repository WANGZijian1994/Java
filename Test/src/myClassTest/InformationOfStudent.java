package myClassTest;

public class InformationOfStudent {
     private String name;
     private char sex;
     protected String birthday;
     private int compScore, engScore;
     public InformationOfStudent(String name, char sex, String birthday) {
    	 this.name=name;
    	 this.sex=sex;
    	 this.birthday=birthday;
     }
     
     public String StudentInfo() {
    	 String information = "name : "+name+" sex: "+sex+" birthday : "+birthday;
    	 return information;
     }
     
     public String getName() {
    	 return name;
     }
     
     public void setName() {
    	 this.name=name;
     }
     
     public char getSex() {
    	 return sex;
     }
     
     public void setSex() {
    	 this.sex=sex;
     }
     
     public String getBirthday() {
    	 return birthday;
     }
     
     public void setBirthday() {
    	 this.birthday=birthday;
     }
     
     public void setCompScore(int data1) {
    	 compScore=data1;
     }
     
     public int getCompScore() {
    	 return compScore;
     }
     
     public void setEngScore(int data2) {
    	 engScore=data2;
     }
     
     public int getEngScore() {
    	 return engScore;
     }
     
     public double getAverage() {
    	 double average = (getCompScore()+getEngScore())/2;
    	 return average;
     }
     
     public int getMax() {
    	 int max=0;
    	 if(compScore >= engScore) {
    		 max = compScore;
    	 }
    	 else {max = engScore;}
    	 return max;
     }
     
     
}
