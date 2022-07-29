/**
 * @(#)portada.java
 * @la creacion de un JcheckBox
 * @author David Emanuel Flores Beltran
 * @version 1.00 2020/11/27
 */

import javax.swing.*;
import javax.swing.event.*;
public class portada extends JFrame{
JCheckBox check1,check2,check3;
    public portada() {
    	setLayout(null);
    	check1=new JCheckBox("siempre");
    	check1.setBounds(10,10,150,30);
    	add(check1);
    	check1=new JCheckBox("regular");
    	check1.setBounds(10,50,150,30);
    	add(check1);
    	check1=new JCheckBox("nunca");
    	check1.setBounds(10,90,150,30);
    	add(check1);
    }
    public static void main(String[] arg){
    	portada hola=new portada();
    	hola.setBounds(0,0,300,200);
    	hola.setVisible(true);
    } 
}