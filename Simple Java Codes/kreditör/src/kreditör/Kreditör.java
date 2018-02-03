
package kreditör;
import javax.swing.JOptionPane;

public class Kreditör {

    
    public static void main(String[] args) {
        char h='H', i='I', l='L', a='A';
	String H="HHHHHHHHHHHH", yy= "                  ",L="LLLLLLLLLLL",A="AAAAAAAAAA" ,b="            ", bb="     ",o="          ", t="              ";
                
        
        String hilal1= "\n\n\t" + h + b + h + "   " + i + "   " + l + yy + " "+a + a  + "          " + l + "\n" + 
	"\t"+ h + b + h + "   " + i + "   "+l + yy +a + "  "+ a + "         " + l + "\n" +
	"\t"+ h + b+ h + "   " + i + "   "+l + t+"   " + a + "    "+ a + "        "+ l + "\n" +
	"\t"+ h + b+ h + "   " + i + "   "+l + t+"  " + a + "      "+ a + "       " + l + "\n"+
	"\t"+ h + b+ h + "   " + i + "   " +l + t+" " + a + "        "+ a+ "      " + l + "\n" +
	"\t"+ h + b+ h + "   " + i + "   "+l + t + a + o+ a+ bb + l + "\n"+
	"\t"+ h + b+ h + "   " + i + "   "+l + t + a + o+ a+ bb + l + "\n" +
	"\t"+ h + H + h + "   " + i + "   "+l + t + a + A + a + bb + l + "\n" +
	"\t"+ h + b+ h + "   " + i + "   "+l + t + a + o+ a + bb + l + "\n" +
	"\t"+ h + b+ h + "   " + i + "   "+l + t + a + o+ a + bb + l + "\n" +
	"\t"+ h + b+ h + "   " + i + "   "+l + t + a + o+ a+ bb + l + "\n" +
	"\t"+ h + b+ h + "   "+ i + "   "+l + t + a + o+ a+ bb + l + "\n" +
	"\t"+ h + b+ h + "   " + i + "   "+l + t + a + o+ a+ bb +l + "\n" +
	"\t"+ h + b+ h + "   " + i + "   "+l + t + a + o+ a+ bb +l + "\n"+
	"\t"+ h + b+ h + "   " + i + "   "+l + L + "   " + a + o + a+ bb + l +L+ "\n"+ "\n";
        
        JOptionPane.showMessageDialog(null,hilal1,"GICIK",JOptionPane.YES_NO_CANCEL_OPTION);
        System.out.print(hilal1);
    }
    
}
