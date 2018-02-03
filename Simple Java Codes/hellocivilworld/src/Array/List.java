package Array;

public class List {

	int limit;
	String[] array;
	int counter; 
	//People person;
	
	public List(int size){
		array = new String[size];
		limit=size;
	    counter=0;
	}
	
	public boolean isEmpty(){
		if(counter<=0) {
			return true;
		}
		
		else {
			return false;
		}
	}
	public boolean isFull(){
		if(counter>=limit) {
			return true;
		}
		
		else {
			return false;
		}
	}
	
	public void AddtoLast(String person){
		if(counter<limit){
			array[counter]=person;
				counter++;
		}
		
		else {
			System.err.println("List is full!! You can't add.");
		}
	}
	
	public void DeletefromLast(){
		if(counter>0){
			counter--;
			System.out.println(array[counter]+ " is deleted.");
			array[counter]="";
		}
		else{
			System.out.println("List is empty!! You can't delete."); 
			
		}
		
	}
	
	public void AddtoHead(String element){
		if(isFull()){
			System.err.println("List is full!! You can't add.");
		}
		else{
			for(int i=counter;0<i;i--){
				array[i]=array[i-1];
			}
			array[0]=element;
			counter++;
		}
	}
	// w a s d f 
	// 0 1 2 3 4 
	public void Insert(String person,int order){
		if(order>counter+1){
			System.err.println("There are "+ counter+" people in the list.You can't insert "+order+"th order.");
			System.err.println("Last person was added to last of the list.");
			AddtoLast(person);
		
		}
		
		else if(order>limit){
			System.err.println("Your order that enter is incorrect!! There aren't people more than this order in list.");
		}
		else{
			
			for(int i=counter-1;(order-1)<=i;i--){ // (order-1)=index
				array[i+1]=array[i];
			}
			array[order-1]=person;
			counter++;
		}
	}
	public void DeletefromHead(){
		if(isEmpty()){
			System.err.println("List is empty!! You can't delete.");
		}
		
		else{
			System.out.println(array[0]+ " is deleted.");
			for(int i=0;i<(counter-1);i++){
			
			array[i]=array[(i+1)];
			  }
			counter--;
			array[counter]="";
		}
		   }
		
	public void Delete(int order){
		 if(isEmpty()){
			System.err.println("List is empty!! You can't delete.");
		   }
		
		 else if(order>counter){
			
			System.err.println("Your order that enter is incorrect!! There aren't people more than this order in list.");
		}
		 
		else {
			System.out.println(array[order-1]+ " is deleted.");
			for(;order<(counter);order++){
				
				array[order-1]=array[(order)];
				  }
			counter--; 
			array[counter]="";
		}
		
	}
	
	public void Search(String person){
		boolean isFound=false;
		int i =0;
		for(;i<counter;i++){
			if(array[i].equalsIgnoreCase(person)){
				isFound=true;
				break;
			}
		}
		if(isFound){
			System.out.println(person+ " is found on the "+(i+1)+"th order.");// i is index but i+1 is order
		}
		else{
			System.err.println(person+" is not found.");
		}
	}
	public void Display(){
		if(counter==0){
			System.out.println("List is empty");
		}
		for(int i=0;i<counter;i++){
			
			System.out.println(array[i]);
		} 
		
	}
}
