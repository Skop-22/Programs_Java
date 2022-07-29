/**
 * @(#)formula.java
 * crear un formulario 
 * @author David Emanuel Flores Beltran
 * @version 1.00 2020/11/23
 */
import java.awt.*;
import javax.swing.*;
public class formula extends JFrame{
	JTextField c1;JTextField c2;JTextField c3;JTextField c4;
	JLabel nom;JLabel ape;JLabel correo;JLabel nacion;
	JLabel icono;
    public formula() {
    	//imagen
    	icono=new JLabel();
    	icono.setIcon(new ImageIcon("persona.jpg"));
    	icono.setBounds(10,10,100,100);
    	add(icono);
    	//formulaio
    	setLayout(null);
    	nom=new JLabel("FORMULARIO");
    	nom.setBounds(300,80,300,20);
    	add(nom);
    	//nombre
    	setLayout(null);
    	nom=new JLabel("NOMBRE: ");
    	nom.setBounds(10,150,300,30);
    	add(nom);
    	//texto a introducir
    	setLayout(null);
    	c1=new JTextField();
    	c1.setBounds(200,150,300,30);
    	add(c1);
    	//apellidos
    	setLayout(null);
    	ape=new JLabel("APELLIDOS: ");
    	ape.setBounds(10,180,300,30);
    	add(ape);
    	//TEXTO A INTRODUCIR
    	setLayout(null);
    	c2=new JTextField();
    	c2.setBounds(200,180,300,30);
    	add(c2);
    	//apellidos
    	setLayout(null);
    	correo=new JLabel("CORREO ELECTRONICO: ");
    	correo.setBounds(10,210,300,30);
    	add(correo);
    	//TEXTO A INTRODUCIR
    	setLayout(null);
    	c3=new JTextField();
    	c3.setBounds(200,210,300,30);
    	add(c3);
    	//Nacionalidad 
    	setLayout(null);
    	nacion=new JLabel("NACIONALIDAD: ");
    	nacion.setBounds(10,240,300,30);
    	add(nacion);
    	//TEXTO A INTRODUCIR
    	setLayout(null);
    	c4=new JTextField();
    	c4.setBounds(200,240,300,30);
    	add(c4);
    }
    
    public static void main(String[] args){
  		formula go=new formula();
  		go.setVisible(true);
  		go.setSize(900,500);
  	}
}