
import java.util.Scanner;
class fonksiyon{
    
    public int factoriel(int n){
        if(n==0){
            return 1;
        }
        else{
            return factoriel(n-1)*n;
        }
    }
}
public class recursion {
    
    public static void main (String[] arg){
        fonksiyon first= new fonksiyon();
         int number, choice;
             Scanner selection = new Scanner(System.in);
        System.out.print("\n\n\tPlease select your fonction:\n\n\t 1-Factoriel \n\n\t2-Power \n");
  
        choice=selection.nextInt();
       
        switch(choice){
            
            case 1: System.out.print("Enter a number for factoriel:");
              number=selection.nextInt();
                System.out.println(first.factoriel(number));
                break;
        }
        
             case 2: System.out.print("Enter a number");
        
    }
    
}
