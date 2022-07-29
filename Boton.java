/**
 * @(#)Boton.java
 * @grupo de botones con JRadioButton
 * @author David Emanuel Flores Beltran
 * @version 1.00 2020/11/24
 */

import java.awt.*;
import javax.swing.*;

public class Boton extends JFrame{

JRadioButton b1,b2,b3;
ButtonGroup grupo;
    public Boton() {
    setLayout(null);
    b1=new JRadioButton("Muy Bien");
   	b1.setBounds(10,50,150,50);
   	add(b1);
    b2=new JRadioButton("Bien");
   	b2.setBounds(10,80,150,50);
   	add(b2);
    b3=new JRadioButton("Regular");
   	b3.setBounds(10,110,150,50);
   	add(b3);
   	grupo=new ButtonGroup();
   	grupo.add(b1);
   	grupo.add(b2);
   	grupo.add(b3);
    }
    
    public static void main (String[] arg){
   	Boton ra=new Boton();
   	ra.setVisible(true);
   	ra.setSize(500,500);
   	ra.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
   } 
}