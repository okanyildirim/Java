
package firsthomework;
import java.util.Scanner;
public class Firsthomework {
    
    public static void main(String[] args) {
       
   int num1;
   int num2;
   int toplam=0, carpim;
		Scanner number = new Scanner(System.in);
		
                System.out.print("Please enter first number:");
                num1 = number.nextInt();
                
                System.out.print("Please enter second number:");
                num2 = number.nextInt();
                
                while(num1<=num2){
                    
                       
                  toplam = num1 + (num2-num1);
                  carpim = num1*(num2-num1);
                 System.out.println(num1 + "+" + (num2 - num1)+ "=" + toplam +"    "+num1 + "*" + (num2 - num1)+ "="+ carpim );  
                 num1++;
                 
                    
                }
    }
    
}