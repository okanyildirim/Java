
public class Gemi extends Arac {
    float rota;
	  
	  public  Gemi(){	 
		  rota=0;
		 
	  }
	  
	  public void sancak(){
		  if(rota==360)
			  rota=0;
		  rota+=5;
	  }
	  public void iskele(){
		  if(rota==360)
		  rota=0;
		  rota-=5;
	  }
          public void rapor(){
	
	System.out.print(renk+"  " + marka+"\nHızı:"+hız+" knot"+"\nKilometere:"+kilometre+" mil\n"+"Rota"+rota);
}
}

