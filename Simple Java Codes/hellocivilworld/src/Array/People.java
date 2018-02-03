package Array;

public class People {
     
	protected String name;
	protected int age;
	
	public People(){
		setName("noname");
		setAge(0);
	}
	
	public People(String ad, int yas){
		
		setName(ad);
		setAge(yas);
	}
     
	public void Hello(People sb){
		System.out.println("Hello," + sb.getName() + " My name is "+ name + " I'am "+age+" years old.");
	}
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}
}
