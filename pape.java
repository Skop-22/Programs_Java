/**
 * @(#)pape.java
 * @crear una papeleria 
 * @author David Emanuel Flores Beltran 
 * @version 1.00 2020/11/17
 */

import javax.swing.*;
import java.awt.*;

public class pape extends JFrame{
JLabel Label1;
JLabel imag;
JLabel Label2;
JLabel imag2;
JLabel Label3;
JLabel imag3;
JLabel Label4;
JLabel imag4;
JLabel Label5;
JLabel imag5;
JLabel Label6;
JLabel imag6;
JLabel Label7;
JLabel imag7;
JLabel Label8;
JLabel imag8;
JLabel Label9;
JLabel imag9;
JLabel Label10;
JLabel imag10;
JLabel Label11;
JLabel imag11;
    public pape() {
    	//NEGOCIO Y SU IMAGEN
    	setLayout(null);
    	Label1=new JLabel("PAPELERIA DEFB");
    	Label1.setForeground(Color.blue);
    	Label1.setBounds(170,0,300,30);
    	add(Label1);
    	imag=new JLabel();
    	imag.setIcon(new ImageIcon("negocio.png"));
    	imag.setBounds(200,30,24,24);
    	add(imag);
    	//LAPIZ Y SU IMAGEN 1
    	setLayout(null);
    	Label2=new JLabel("LAPIZ");
    	Label2.setForeground(Color.blue);
    	Label2.setBounds(0,40,300,30);
    	add(Label2);
    	imag2=new JLabel();
    	imag2.setIcon(new ImageIcon("lapizero.png"));
    	imag2.setBounds(90,45,24,24);
    	add(imag2);
    	//PLUMIN Y SU IMAGEN   2
    	setLayout(null);
    	Label3=new JLabel("PLUMIN");
    	Label3.setForeground(Color.blue);
    	Label3.setBounds(300,40,300,30);
    	add(Label3);
    	imag3=new JLabel();
    	imag3.setIcon(new ImageIcon("plumin.png"));
    	imag3.setBounds(390,45,24,24);
    	add(imag3);
    	//REGLA Y SU IMAGEN    3
    	setLayout(null);
    	Label4=new JLabel("REGLA");
    	Label4.setForeground(Color.blue);
    	Label4.setBounds(0,60,300,30);
    	add(Label4);
    	imag4=new JLabel();
    	imag4.setIcon(new ImageIcon("regla.png"));
    	imag4.setBounds(90,65,24,24);
    	add(imag4);
    	//CALCULADORA Y SU IMAGEN 4
    	setLayout(null);
    	Label5=new JLabel("CALCULADORA");
    	Label5.setForeground(Color.blue);
    	Label5.setBounds(300,60,300,30);
    	add(Label5);
    	imag5=new JLabel();
    	imag5.setIcon(new ImageIcon("calcu.png"));
    	imag5.setBounds(390,66,24,24);
    	add(imag5);
    	//CLIPS Y SU IMAGEN 5
    	setLayout(null);
    	Label6=new JLabel("CLIPS");
    	Label6.setForeground(Color.blue);
    	Label6.setBounds(0,80,300,30);
    	add(Label6);
    	imag6=new JLabel();
    	imag6.setIcon(new ImageIcon("clips.png"));
    	imag6.setBounds(90,85,24,24);
    	add(imag6);
    	//FOLDER Y SU IMAGEN  6
    	setLayout(null);
    	Label7=new JLabel("FOLDER");
    	Label7.setForeground(Color.blue);
    	Label7.setBounds(300,80,300,30);
    	add(Label7);
    	imag7=new JLabel();
    	imag7.setIcon(new ImageIcon("folder.png"));
    	imag7.setBounds(390,85,24,24);
    	add(imag7);
    	//LIBRETA Y SU IMAGEN  7
    	setLayout(null);
    	Label8=new JLabel("LIBRETA");
    	Label8.setForeground(Color.blue);
    	Label8.setBounds(0,100,300,30);
    	add(Label8);
    	imag8=new JLabel();
    	imag8.setIcon(new ImageIcon("libreta.png"));
    	imag8.setBounds(90,105,24,24);
    	add(imag8);
    	//HOJA Y SU IMAGEN   8
    	setLayout(null);
    	Label9=new JLabel("HOJA BLANCA");
    	Label9.setForeground(Color.blue);
    	Label9.setBounds(300,100,300,30);
    	add(Label9);
    	imag9=new JLabel();
    	imag9.setIcon(new ImageIcon("hoja.png"));
    	imag9.setBounds(390,105,24,24);
    	add(imag9);
    	//LIBROS Y SU IMAGEN
    	setLayout(null);
    	Label10=new JLabel("LIBROS");
    	Label10.setForeground(Color.blue);
    	Label10.setBounds(0,120,300,30);
    	add(Label10);
    	imag10=new JLabel();
    	imag10.setIcon(new ImageIcon("libros.png"));
    	imag10.setBounds(90,125,24,24);
    	add(imag10);
    	//MAPA Y SU IMAGEN
    	setLayout(null);
    	Label11=new JLabel("MAPA");
    	Label11.setForeground(Color.blue);
    	Label11.setBounds(300,120,300,30);
    	add(Label11);
    	imag11=new JLabel();
    	imag11.setIcon(new ImageIcon("mapa.png"));
    	imag11.setBounds(390,125,24,24);
    	add(imag11);
    }
   	public static void main(String[] args){
  		pape ejemplo1=new pape();
  		ejemplo1.setTitle("                             NEGOCIO");
  		ejemplo1.setSize(500,250);
  		ejemplo1.setVisible(true);
  	}
}