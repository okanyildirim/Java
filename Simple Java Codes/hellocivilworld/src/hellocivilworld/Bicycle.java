package hellocivilworld;

public class Bicycle {
	
	People person;
	
	public Bicycle(){
		person=null; 
	}
	
	public Bicycle(People per){
		person=per;
	}
	public void geton(People per){
		
		if(person==null){
			
			person=per;
			System.out.println(person.getName()+" get on the bicycle.");
		}
		
		else System.out.println("Bicycle is already full. "+ person.getName()+" is riding this bike.");
	}

	public void getoff(){
		String isim;
		if(person==null){
			System.out.println("Bicycle is already empty.No one riding this bike");
			
		}
		
		else {
			isim=person.getName();
			person=null;
			System.out.println(isim+ " get off the bicycle.");
			
		}
		
	}
}
