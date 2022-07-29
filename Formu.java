/**
 * @(#)Formu.java
 * @botones que pongan nombre al tema de la etiqueta 
 * @author David Emanuel Flores Beltran
 * @version 1.00 2020/11/30
 */
import javax.swing.*;
import java.awt.event.*;

public class Formu extends JFrame implements ActionListener{
	private JButton boton1,boton2,boton3;
	public Formu() {
		setLayout(null);
		boton1=new JButton("1");
		boton1.setBounds(10,100,90,30);
		add(boton1);
		boton1.addActionListener(this);
		boton2=new JButton("2");
		boton2.setBounds(110,100,90,30);
		add(boton2);
		boton2.addActionListener(this);
		boton3=new JButton("3");
		boton3.setBounds(210,100,90,30);
		add(boton3);
		boton3.addActionListener(this);
	}
    
	public void actionPerformed(ActionEvent e) {
		if (e.getSource()==boton1){
			setTitle("BOTON 1");}
		if (e.getSource()==boton2){
			setTitle("BOTON 2");}
		if (e.getSource()==boton3){
			setTitle("BOTON 3");}
	}
	public static void main(String[] args){
		Formu form=new Formu();
		form.setBounds(700,0,350,200);
		form.setVisible(true);
	}
}