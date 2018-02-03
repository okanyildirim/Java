package Array;

import hellocivilworld.People;

import java.util.Scanner;

public class JavaList {

	public static void main(String[] args) {
		
		 List n1=new List(5);
		 Scanner sc=new Scanner(System.in);
		 Scanner sc2=new Scanner(System.in);
		 Scanner sc3=new Scanner(System.in);
		 Scanner sc4=new Scanner(System.in);
		 Scanner sc5=new Scanner(System.in);
		 Scanner sc6=new Scanner(System.in);
		 Scanner sc7=new Scanner(System.in);
		 /*n1.AddtoLast("Okan");
		 n1.AddtoLast("Ýlknur");
		 n1.AddtoLast("Volkan");
		 n1.AddtoLast("Tuncay");
		 n1.AddtoLast("Serkan");
		 System.out.println("Listeye eklenenler:");
		 n1.Display();
	     n1.AddtoLast("Sevinç");
		 n1.DeletefromLast();
		 System.out.println("Sondan silidim:");
		 n1.Display();
		 
		 n1.DeletefromLast();
		 n1.DeletefromLast();
		 n1.DeletefromLast();
		 n1.DeletefromLast();
		 System.out.println("Hepsini sildim:");
		 n1.Display();
		 System.out.println("---------------------------------");
		 n1.DeletefromLast();
		 */
		 String person;
		 int choose,order;
		 boolean loop=true;
		
		 while(loop){
			 System.out.println("\n \n  Please select your choice \n\n 1_Add to Last \n 2_Add to Head \n 3_Insert\n 4_Delete from Head \n 5_Delete From Last\n 6_Delete \n 7_Search\n 8_Display\n 9_Exit \n ");
		    choose=sc.nextInt();
	     switch(choose){
		 
		 case 1: if(n1.isFull()){
			            System.err.println("List is full!! You can't add.");
		             }
			 
		         else{
			            System.out.println("Please enter next person:");
		                person=sc2.nextLine();
	 		            n1.AddtoLast(person);
	 		            System.out.println(person+" is added to last of the list.");  
		             }
		 		 break;
		 case 2: 	 if(n1.isFull()){
	            		System.err.println("List is full!! You can't add.");
          }
	 
          			else{
          				System.out.println("Please enter next person:");
          				person=sc4.nextLine();
          				n1.AddtoHead(person);
          				System.out.println(person+" is added to head of the list.");  
          }
		         break;
		 case 3:  if(n1.isFull()){
			 		System.err.println("List is full!! You can't add.");
       }
	 
                 else{
                	 System.out.println("What is number order that you want to insert:");
                	 order=sc6.nextInt();
                	 System.out.println("Please enter next person:");
                	 person=sc5.nextLine();
                	 n1.Insert(person,order);
                	 System.out.println(person+" is added into the list.");  
       }
		         break;
		 case 4:n1.DeletefromHead();
		         break;
		         
		 case 5: n1.DeletefromLast();
			     break;
		 case 6: if(n1.isEmpty()){
			     System.err.println("List is empty!! You can't delete.");
		        }
		         else {
			      System.out.println("What is number order that you want to delete:");
			      order=sc3.nextInt();
		          n1.Delete(order);
		              }
		          
			 	 break;
		 case 7: System.out.println("Enter the name you want to search:");
		 			person=sc7.nextLine();
		 				n1.Search(person);
			     break;
		 case 8:n1.Display();
			     break;
		 case 9: loop=false;
                 break;
		 default: System.out.println("You enter number incorrectly.Please enter again!!");
		 }
		 }
	}
     }
