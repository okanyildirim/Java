
import java.awt.Color;
import java.awt.ComponentOrientation;
import java.awt.Container;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextField;

public class HesapMakinesi extends JFrame {

    private JPanel ustpanel = new JPanel();//üst panelimiz, burada yapılan işlemler ve sonuçler görüntülenecek.
    private JPanel altpanel = new JPanel();//alt panelimiz, burada rakamlarımız yer alacak.

    private static JTextField textfield = new JTextField(10);

    private static JButton button0 = new JButton("0");
    private static JButton button1 = new JButton("1");
    private static JButton button2 = new JButton("2");
    private static JButton button3 = new JButton("3");
    private static JButton button4 = new JButton("4");
    private static JButton button5 = new JButton("5");
    private static JButton button6 = new JButton("6");
    private static JButton button7 = new JButton("7");
    private static JButton button8 = new JButton("8");
    private static JButton button9 = new JButton("9");

    private static JButton topla = new JButton("+");
    private static JButton cikart = new JButton("-");
    private static JButton carp = new JButton("x");
    private static JButton bol = new JButton("/");

    private static JButton esittir = new JButton("=");
    private static JButton clear = new JButton("C");
    private static JButton nokta = new JButton(".");

    private static String sayi;
    private static float Floatt, sonuc;
    private static boolean islemyapildimi;
    private static char islemturu;
    private static boolean islembittimi;
    private static boolean bolunur=true;

    Container container = getContentPane();

    public HesapMakinesi(String str) {

        super(str);
        setSize(330, 430);
        container.setLayout(null);
        textfield.setEditable(true);
        
        textfield.setComponentOrientation(ComponentOrientation.RIGHT_TO_LEFT);
        JScrollPane scroll = new JScrollPane(textfield);
        scroll.setComponentOrientation(ComponentOrientation.RIGHT_TO_LEFT);
        
        sayi = "0";
        Floatt = 0;
        sonuc = 0;
        islemyapildimi = false;
        islembittimi = false;
        islemturu = '\n';
        //////////////////////////////////////////////
        //ustpanelin özellikleri
        ustpanel.setBounds(10, 10, 310, 60);
        ustpanel.setLayout(null);
        container.add(ustpanel);
        //////////////////////////////////////////////
        //altpanelin özellikleri
        altpanel.setBounds(10, 80, 310, 430);
        altpanel.setLayout(null);
        container.add(altpanel);
        //////////////////////////////////////////////
        //butonları ekleyip konumlarını ayarlıyoruz.

        //rakam butonlarımız
        ustpanel.add(textfield);
        textfield.setBounds(10, 10, 275, 40);

        altpanel.add(button7);
        button7.setBounds(10, 10, 50, 50);

        altpanel.add(button8);
        button8.setBounds(70, 10, 50, 50);

        altpanel.add(button9);
        button9.setBounds(130, 10, 50, 50);

        altpanel.add(button4);
        button4.setBounds(10, 70, 50, 50);

        altpanel.add(button5);
        button5.setBounds(70, 70, 50, 50);

        altpanel.add(button6);
        button6.setBounds(130, 70, 50, 50);

        altpanel.add(button1);
        button1.setBounds(10, 130, 50, 50);

        altpanel.add(button2);
        button2.setBounds(70, 130, 50, 50);

        altpanel.add(button3);
        button3.setBounds(130, 130, 50, 50);

        altpanel.add(button0);
        button0.setBounds(10, 190, 170, 50);

        // işlem butonlarımız
        altpanel.add(topla);
        topla.setBounds(190, 10, 95, 50);

        altpanel.add(cikart);
        cikart.setBounds(190, 70, 95, 50);

        altpanel.add(carp);
        carp.setBounds(190, 130, 95, 50);

        altpanel.add(bol);
        bol.setBounds(190, 190, 95, 50);

        altpanel.add(esittir);
        esittir.setBounds(190, 250, 95, 50);

        altpanel.add(clear);
        clear.setBounds(10, 250, 95, 50);
        
        altpanel.add(nokta);
        nokta.setBounds(115, 250, 65, 50);
        //////////////////////////////////////////////

        //Listener ve Handler lar
        TextFieldHandler handler = new TextFieldHandler();

        textfield.addActionListener(handler);

        button0.addActionListener(
                new ActionListener() {

                    public void actionPerformed(ActionEvent ae) {

                        if (islemyapildimi == true) {
                            textfield.setText("");
                            islemyapildimi=false;
                        }
                        if (!"0".equals(textfield.getText())) {
                            textfield.setText(textfield.getText() + "0");
                            sayi += "0";
                        }
                    }
                }
        );
        button1.addActionListener(
                new ActionListener() {

                    public void actionPerformed(ActionEvent ae) {

                        if (islembittimi == true) {
                            textfield.setText("");
                        }

                        if (islemyapildimi == true) {
                            textfield.setText("");
                            islemyapildimi=false;
                        }

                        if ("0".equals(textfield.getText())) {
                            textfield.setText("1");
                            sayi = "1";
                        } else {
                            textfield.setText(textfield.getText() + "1");
                            sayi += 1;
                        }
                    }
                }
        );
        button2.addActionListener(
                new ActionListener() {

                    public void actionPerformed(ActionEvent ae) {
                        if (islembittimi == true) {
                            textfield.setText("");
                        }

                        if (islemyapildimi == true) {
                            textfield.setText("");
                            islemyapildimi=false;
                        }

                        if ("0".equals(textfield.getText())) {
                            textfield.setText("2");
                            sayi = "2";
                        } else {
                            textfield.setText(textfield.getText() + "2");
                            sayi += 2;
                        }
                        
                    }
                }
        );
        button3.addActionListener(
                new ActionListener() {

                    public void actionPerformed(ActionEvent ae) {
                        if (islembittimi == true) {
                            textfield.setText("");
                        }

                        if (islemyapildimi == true) {
                            textfield.setText("");
                            islemyapildimi=false;
                        }

                        if ("0".equals(textfield.getText())) {
                            textfield.setText("3");
                            sayi = "3";
                        } else {
                            textfield.setText(textfield.getText() + "3");
                            sayi += 3;
                        }
                        
                    }
                }
        );
        button4.addActionListener(
                new ActionListener() {

                    public void actionPerformed(ActionEvent ae) {

                        if (islembittimi == true) {
                            textfield.setText("");
                        }

                        if (islemyapildimi == true) {
                            textfield.setText("");
                            islemyapildimi=false;
                        }

                        if ("0".equals(textfield.getText())) {
                            textfield.setText("4");
                            sayi = "4";
                        } else {
                            textfield.setText(textfield.getText() + "4");
                            sayi += 4;
                        }
                    }
                }
        );
        button5.addActionListener(
                new ActionListener() {

                    public void actionPerformed(ActionEvent ae) {

                        if (islembittimi == true) {
                            textfield.setText("");
                        }

                        if (islemyapildimi == true) {
                            textfield.setText("");
                            islemyapildimi=false;
                        }

                        if ("0".equals(textfield.getText())) {
                            textfield.setText("5");
                            sayi = "5";
                        } else {
                            textfield.setText(textfield.getText() + "5");
                            sayi += 5;
                        }
                    }
                }
        );
        button6.addActionListener(
                new ActionListener() {

                    public void actionPerformed(ActionEvent ae) {

                        if (islembittimi == true) {
                            textfield.setText("");
                        }
                        if (islemyapildimi == true) {
                            textfield.setText("");
                            islemyapildimi=false;
                        }

                        if ("0".equals(textfield.getText())) {
                            textfield.setText("6");
                            sayi = "6";
                        } else {
                            textfield.setText(textfield.getText() + "6");
                            sayi += 6;
                        }
                        Floatt = Integer.parseInt(sayi);
                    }
                }
        );
        button7.addActionListener(
                new ActionListener() {

                    public void actionPerformed(ActionEvent ae) {

                        if (islembittimi == true) {
                            textfield.setText("");
                        }

                        if (islemyapildimi == true) {
                            textfield.setText("");
                            islemyapildimi=false;
                        }

                        if ("0".equals(textfield.getText())) {
                            textfield.setText("7");
                            sayi = "7";
                        } else {
                            textfield.setText(textfield.getText() + "7");
                            sayi += 7;
                        }
                    }
                }
        );
        button8.addActionListener(
                new ActionListener() {

                    public void actionPerformed(ActionEvent ae) {

                        if (islembittimi == true) {
                            textfield.setText("");
                        }

                        if (islemyapildimi == true) {
                            textfield.setText("");
                            islemyapildimi=false;
                        }

                        if ("0".equals(textfield.getText())) {
                            textfield.setText("8");
                            sayi = "8";
                        } else {
                            textfield.setText(textfield.getText() + "8");
                            sayi += 8;
                        }
                    }
                }
        );
        button9.addActionListener(
                new ActionListener() {

                    public void actionPerformed(ActionEvent ae) {

                        if (islembittimi == true) {
                            textfield.setText("");
                        }

                        if (islemyapildimi == true) {
                            textfield.setText("");
                            islemyapildimi=false;
                        }

                        if ("0".equals(textfield.getText())) {
                            textfield.setText("9");
                            sayi = "9";
                        } else {
                            textfield.setText(textfield.getText() + "9");
                            sayi += 9;
                        }
                    }
                }
        );
        topla.addActionListener(
                new ActionListener() {

                    public void actionPerformed(ActionEvent ae) {
                        Floatt = Float.parseFloat(sayi);

                        islemyapildimi = true;
                        islemturu = 't';
                        sonuc += Floatt;

                        sayi = "0";
                    }
                }
        );
        cikart.addActionListener(
                new ActionListener() {

                    public void actionPerformed(ActionEvent ae) {
                        Floatt = Float.parseFloat(sayi);

                        islemyapildimi = true;
                        islemturu = 'f';
                        sonuc = Floatt - sonuc;

                        sayi = "0";

                    }
                }
        );
        carp.addActionListener(
                new ActionListener() {

                    public void actionPerformed(ActionEvent ae) {
                        Floatt = Float.parseFloat(sayi);
                        sonuc = 1;
                        islemyapildimi=true;
                        islemturu='c';
                        sonuc *= Floatt;
                        
                        sayi = "0";

                    }
                }
        );
        bol.addActionListener(
                new ActionListener() {

                    public void actionPerformed(ActionEvent ae) {
                        Floatt = Float.parseFloat(sayi);
                        islemyapildimi=true;
                        islemturu='b';
                        sonuc = Floatt;
                        
                        sayi = "0";


                    }
                }
        );
        esittir.addActionListener(
                new ActionListener() {

                    public void actionPerformed(ActionEvent ae) {
                        
                        Floatt = Float.parseFloat(sayi);
                        
                        if (islemturu == 't') {
                            sonuc += Floatt;
                            islemturu='\n';
                        }else if (islemturu == 'f') {
                            sonuc -=Floatt ;
                            islemturu='\n';
                        }else if(islemturu == 'c'){
                            sonuc *= Floatt;
                            islemturu = '\n';
                        }else if(islemturu == 'b'){
                            if(Floatt == 0.00){
                                bolunur=false;
                            }else{
                            sonuc /= Floatt;
                            islemturu = '\n';
                            }
                        }else{
                            sonuc = Float.parseFloat(textfield.getText());
                        }
                        if(bolunur)
                        textfield.setText("" + sonuc);
                        else
                            textfield.setText("Sıfıra bölünemez");
                        bolunur=true;
                        sayi = "" + sonuc;
                        islemyapildimi = false;
                        islembittimi = true;
                        Floatt = 0;
                        sonuc = 0;                    }
                }
        );
        clear.addActionListener(
                new ActionListener() {

                    public void actionPerformed(ActionEvent ae) {
                        textfield.setText("");
                        sayi = "0";
                        sonuc = 0;
                        Floatt=0;
                        islemyapildimi=false;
                        islembittimi=false;
                    }
                }
        );
        nokta.addActionListener(
                new ActionListener() {

                    @Override
                    public void actionPerformed(ActionEvent ae) {

                        if("".equals(textfield.getText())){
                            textfield.setText("0.");
                            sayi = "0.";
                        }else{
                            textfield.setText(textfield.getText() + ".");
                            sayi += ".";
                        }

                    }
                }
        );

        //////////////////////////////////////////////
        setVisible(true);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
    }

    private static class TextFieldHandler implements ActionListener {

        @Override
        public void actionPerformed(ActionEvent ae) {
            sayi=textfield.getText();

        }
    }

}
