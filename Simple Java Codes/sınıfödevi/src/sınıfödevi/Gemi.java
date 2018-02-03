
package sınıfödevi;


class Gemi extends Arac {
    private float rota;
	  
	  public  Gemi(){	 
		super(); 
              rota=0;
		 
	  }
	  
	  public void sancak(){
		  if(rota==360)
			  rota=0;
              
		  rota+=365;
                  rota%=360;
	  }
	  public void iskele(){
		  if(rota==360)
		  rota=0;
                       
		  
                  rota-=5;
                  rota+=360;
                  rota%=360;
	  }
          public void rapor(){
	
	System.out.print("\n\n"+renk+"  " + marka+"\nHızı:"+hız+" knot"+"\nKilometere:"+kilometre+" mil\n"+"Rota:"+rota);
}
}
