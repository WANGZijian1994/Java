public class PersonalInformation {
		private String name;
		private String sex;
		private String birthday;
		private int age;
		
		public PersonalInformation(String name,String sex,String birthday,int age) {
			this.name = name;
			this.sex = sex;
			this.birthday=birthday;
			this.age = age;
		}
		
		public void information() {
			System.out.println("My name is : "+name);
			System.out.println("I'm "+sex);
			System.out.println("I was born in "+birthday);
			System.out.println("I'm "+age+" years old");
		}
		

	public static void main(String[] args) {
		PersonalInformation p = new PersonalInformation("Zijian WANG","Man","18-04-1994",24);
	    p.information();
	}

}
