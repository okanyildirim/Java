
class DivideByZeroException extends Exception {

   public DivideByZeroException()
	 {
	super( "Attempted to divide by zero" );
	 }
	
	 public DivideByZeroException( String message )
	 {
	 super( message );
	 }
	
    
}
