/**
 * @(#)RadioBoton.java
 * @crear un boton con JRadioButton
 * @author David Emanuel Flores Beltran
 * @version 1.00 2020/11/24
 */

import javax.swing.*;
public class RadioBoton extends JFrame{
	JRadioButton radio1;
    public RadioBoton() {
    setLayout(null);
    radio1=new JRadioButton("mi primer boton de radio");
   	radio1.setBounds(10,20,200,30);
   	add(radio1);
    }
   public static void main (String[] arg){
   	RadioBoton a=new RadioBoton();
   	a.setBounds(0,0,350,230);
   	a.setVisible(true);
   } 
}