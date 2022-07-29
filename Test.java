/**
 * @(#)Test.java
 * @preguntas
 * @author David Emanuel Flores Beltran
 * @version 1.00 2020/11/29
 */

import javax.swing.*;
import javax.swing.event.*;
public class Test extends JFrame{
	JLabel pre1;//pre2,pre3,pre3,pre4,pre5,pre6,pre7,pre8,pre9,pre10;
	JRadioButton a1,a2,a3,a4,a5,a6,a7,a8,a9,a10;
	JRadioButton b1,b2,n3,b4,b5,b6,b7,b8,b9,b10;
	JRadioButton c1,c2,c3,c4,c5,c6,c7,c8,c9,c10;
	ButtonGroup grupo,grupo2,grupo3,grupo4,grupo5,grupo6,grupo7,grupo8,grupo9,grupo10;
    public Test() {
    	setLayout(null);
    	//pregunta numero 1
    	pre1=new JLabel("Pregunta 1");
    	pre1.setBounds(0,0,300,30);
    	add(pre1);
    	a1=new JRadioButton("Muy Bien");
   		a1.setBounds(0,20,150,25);
 	  	add(a1);
 	    b1=new JRadioButton("Bien");
 	  	b1.setBounds(0,40,150,25);
 	  	add(b1);
 	 	c1=new JRadioButton("Regular");
 	  	c1.setBounds(0,60,150,25);
	   	add(c1);
 	  	grupo=new ButtonGroup();
  	 	grupo.add(a1);
   		grupo.add(b1);
   		grupo.add(c1);
    }
    public static void main(String[] arg){
    	Test tod=new Test();
  		tod.setTitle("                      Cuestionario");
    	tod.setBounds(60,0,1300,770);
    	tod.setVisible(true);
    	tod.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    } 
}