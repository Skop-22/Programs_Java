/**
 * @(#)carreras.java
 * @Etiqueta carreras de la UAEM
 * @author David Emanuel Flores Beltran
 * @version 1.00 2020/11/15
 */

import javax.swing.*;
import java.awt.*;
public class carreras extends JFrame{
	JLabel Label1;
	JLabel Label2;
	JLabel Label3;
	JLabel Label4;
	JLabel Label5;
	JLabel Label6;
    public carreras() {
    	setLayout(null);
    	Label1=new JLabel("Licenciatura en Ingenieia En Computacion");
    	Label1.setBounds(10,1,300,30);
    	add(Label1);
    	setLayout(null);
    	Label2=new JLabel("Licenciatura en Informatica");
    	Label2.setBounds(10,21,300,30);
    	add(Label2);
    	setLayout(null);
    	Label3=new JLabel("Licenciatura en Contaduria");
    	Label3.setBounds(10,41,300,30);
    	add(Label3);
    	setLayout(null);
    	Label4=new JLabel("Licenciatura en Derecho");
    	Label4.setBounds(10,61,300,30);
    	add(Label4);
    	setLayout(null);
    	Label5=new JLabel("Licenciatura en Turismo");
    	Label5.setBounds(10,81,300,30);
    	add(Label5);
    	setLayout(null);
    	Label6=new JLabel("Licenciatura en Psicologia");
    	Label6.setBounds(10,101,300,30);
    	add(Label6);
    }
    
    public static void main(String[] args){
  		carreras ejemplo1=new carreras();
  		ejemplo1.setTitle("CARRERAS DE LA UAEM");
  		ejemplo1.setSize(400,200);
  		ejemplo1.setVisible(true);
  	}
}