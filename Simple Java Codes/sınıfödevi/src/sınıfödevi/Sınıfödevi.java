
package sınıfödevi;

import java.util.Scanner;
public class Sınıfödevi {    
    public static void main(String[] args) {
        
        Arac oto= new Arac();
        Gemi tekne= new Gemi();
        
                 String model,colour;
		 int choice,ch;
		Scanner scan= new Scanner(System.in);
                System.out.println("Aracınızı seçiniz:\n1_Otomobil\n2_Gemi");
                choice=scan.nextInt();
		switch(choice){
		
		case 1: 
                    
                         System.out.print(" Araba modelini giriniz:");
		         model=scan.next();
		         oto.getmarka(model);
		         
		         System.out.print(" Araba rengini giriniz:");
		         colour=scan.next();
		         oto.getrenk(colour);
		         
		         while(true){
		         System.out.print("\n\nAraba için işlemi seçiniz:\n\n"
                                 + "1_Gaza bas\n2_Fren Yap\n3_Kilometreyi artır\n4_Son durumu göster\n5_Çık\n");
		         ch=scan.nextInt();
		         switch(ch){
		         
		         case 1: oto.hızarttır();
                     break;
		         case 2: oto.hızıazalt();
		        	 break;
		         case 3: oto.kilometre();
		        	 break;
		         case 4: oto.göster();
		        	 break;
		         case 5: System.exit(0);
                                 
		        	 break;
		        default:System.out.println("Yanlış seçim yaptınız.Lütfen tekrar deneyiniz.");
		        	break;
		         
		         }
                         }
		         
	
		case 2:
                         System.out.print(" Gemi modelini giriniz:");
		         model=scan.next();
		         tekne.getmarka(model);
		         
		         System.out.print(" Gemi rengini giriniz:");
		         colour=scan.next();
		         tekne.getrenk(colour);
			 while(true){
		         System.out.print("\n\nGemi için işlemi seçiniz:\n\n1_Makineler ileri\n2_Makineler tornistan\n3_Mili artır\n4_Sancak 5\n5_İskele 5\n6_Son durumu göster\n7_Çık\n");
		         ch=scan.nextInt();
		         switch(ch){
		         
		         case 1: tekne.hızarttır();
                     break;
		         case 2: tekne.hızıazalt();
		        	 break;
		         case 3: tekne.kilometre();
		        	 break;
		         case 4: tekne.sancak();
		        	 break;
		         case 5: tekne.iskele();
		        	 break;
		         case 6: tekne.rapor();
	        	 break;
		         case 7: System.exit(0);
	        	 break;
		        default:System.out.println("Yanlış seçim yaptınız.Lütfen tekrar deneyiniz.");
		        	break;
		         
		         }
		         }
		
		default :System.out.println("Yanlış seçim yaptınız.Lütfen tekrar deneyiniz.");
		break;	
		}
		
		
	}
}
                
