package hellocivilworld;

import java.util.Scanner;

public class FirstProgram {

	public static void main(String args[]){
		
		System.out.println("Hello Civil World!!");
		System.out.print("Lütfen adýnýzý giriniz:");
		
		Scanner scan=new Scanner(System.in);
		String ad;
		int yas;
		ad=scan.nextLine();
		System.out.print("Lütfen yasýnýzý giriniz:");
		yas=scan.nextInt();
		
		People man1=new People();
		People woman=new People("Hilal",21);
		People man2 = new People();
	    man2.setName(ad);
		man2.setAge(yas);
		
		//man1.Hello();
		man2.Hello(woman);
		//woman.Hello(man2);
		/*System.out.println("First man's name is "+ man1.getName() +" and age is " + man1.getAge());
		System.out.println("Woman name is "+ woman.getName() +" and age is " + woman.getAge());
		System.out.println("Second man's name is "+ man2.getName() +" and age is " + man2.getAge());*/
		//System.out.println(kare(yas));
		System.out.println("Hello, Okan nice to meet you. Let's ride a bike!!");
	
		Bicycle bike=new Bicycle();
		bike.getoff();
		bike.geton(woman);
		bike.geton(man2);
		bike.getoff();
		bike.geton(man2);
		
		Student st1=new Student();
		st1.setName("volkan");
		st1.setAge(19);
		st1.Hello(st1);
		
	}
	
	public static int kare(int x){
		return x*x;
		
	}
}
