
package sınıfödevi;


class Arac {
    private String marka,renk;
	double kilometre;
	float hız,maxhız;;
	
	
	public Arac(){
		
		kilometre=0.0;
		hız=0;
		maxhız=150;
	}
	
	public void hızarttır(){
		
		if(hız>=maxhız){
		System.out.println("Çok hızlısın, radara yakalanacaksın!!Daha hızlı gidemezsin..");
		hız=maxhız;
		}
		else
		hız += 5;
		
	}
	
	public void hızıazalt(){
		if(hız<=0){
		System.out.println("Araba durdu!!");
		hız=0;
		}
		else
		hız-=5;
	}


   public void kilometre(){
	   kilometre+=10;  
   }
   
   public void getmarka(String model){
	   marka=model;
   }

   public void getrenk(String colour){
	   renk=colour;
   }
   
   public void göster(){
	   
	   System.out.print("\n\n"+renk+"  " + marka+"\nHızı:"+hız+" km\\h"+"\nKilometere:"+kilometre+" km\n");
   }
}
