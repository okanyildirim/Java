
package dividebyzerotest;
import java.awt.*;
import java.awt.event.*;
import java.text.DecimalFormat;
import javax.swing.*;

public class DivideByZeroTest extends JFrame 

    implements ActionListener {
    private static Object application;
		
		 private JTextField inputField1, inputField2, outputField;
		 private int number1, number2;
		 private double result;
		
		 // set up GUI
		 public DivideByZeroTest()
		 {
		 super( "Demonstrating Exceptions" );
		
		 // get content pane and set its layout
		 Container container = getContentPane();
		 container.setLayout( new GridLayout( 3, 2 ) );
		
		 // set up label and inputField1
		 container.add(
		 new JLabel( "Enter numerator ", SwingConstants.RIGHT ) );
		 inputField1 = new JTextField( 10 );
		 container.add( inputField1 );
		 container.add(
				  new JLabel( "Enter denominator and press Enter ",
				  SwingConstants.RIGHT ) );
				  inputField2 = new JTextField( 10 );
				  container.add( inputField2 );
				  inputField2.addActionListener( this );
				 
				 
				  container.add(
				  new JLabel( "RESULT ", SwingConstants.RIGHT ) );
				  outputField = new JTextField();
				  container.add( outputField );
				 
				  setSize( 425, 100 );
				  setVisible( true );
				  }
	
	public void actionPerformed( ActionEvent event )
	 {
	 DecimalFormat precision3 = new DecimalFormat( "0.000" );
	
	 outputField.setText( "" ); // clear outputField
	

	 try {
	 number1 = Integer.parseInt( inputField1.getText() );
	 number2 = Integer.parseInt( inputField2.getText() );
	
	 result = quotient(number1, number2);
	 outputField.setText( precision3.format( result ) );
	}
	 
	 catch ( NumberFormatException numberFormatException ) {
		  JOptionPane.showMessageDialog( this,
		  "You must enter two integers",
		  "Invalid Number Format",
		  JOptionPane.ERROR_MESSAGE );
		  }
		 
		 
		  catch ( ArithmeticException arithmeticException ) {
		  JOptionPane.showMessageDialog( this,
		  arithmeticException.toString(),
		  "Arithmetic Exception",
		  JOptionPane.ERROR_MESSAGE );
		  throw new UnsupportedOperationException("Not supported yet.");
		  }
	 		
		  }
		 
		
		  public double quotient( int numerator, int denominator ) throws DivideByZeroException{
		  if ( denominator == 0 )
		  throw new DivideByZeroException();
		 
		  return ( double ) numerator / denominator;
		  }
    public static void main(String[] args) {
        
		  
		   application.setDefaultCloseOperation(
		   JFrame.EXIT_ON_CLOSE );
		   }
		  
    
}
