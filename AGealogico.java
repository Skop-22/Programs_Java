/**
 * @(#)AGealogico.java
 * @ Arbol genealogico de la familia con imagenes
 * @ author David Emanul Flores Beltran
 * @ version 1.00 2020/11/20
 */
import javax.swing.*;
import java.awt.*;
public class AGealogico extends JFrame{
	//ABUELITOS
JLabel abuelo;JLabel icono;JLabel abuela;JLabel icono2;
JLabel abuelo2;JLabel icono3;JLabel abuela2;JLabel icono4;
	//TIOS Y PADRES
JLabel tio;JLabel icono5;JLabel tio2;JLabel icono6;JLabel tio3;JLabel icono7;JLabel tio4;JLabel icono8;JLabel tio5;JLabel icono9;
JLabel tio6;JLabel icono10;JLabel tio7;JLabel icono11;JLabel tio8;JLabel icono12;JLabel tio9;JLabel icono13; JLabel tio10;JLabel icono14;
	//PRIMOS Y YO
JLabel primo;JLabel ico;JLabel primo2;JLabel ico2;JLabel primo3;JLabel ico3;JLabel primo4;JLabel ico4;JLabel primo5;JLabel ico5;
JLabel primo6;JLabel ico6;JLabel primo7;JLabel ico7;JLabel primo8;JLabel ico8;JLabel primo9;JLabel ico9;JLabel primo10;JLabel ico10;
    public AGealogico() {
    	//abuelos
    	setLayout(null);
    	abuelo=new JLabel("ABUELO- FELIPE");
    	abuelo.setForeground(Color.blue);
    	abuelo.setBounds(30,2,300,30);
    	add(abuelo);
    	icono=new JLabel();
    	icono.setIcon(new ImageIcon("abuelo.png"));
    	icono.setBounds(60,30,24,24);
    	add(icono);
    	setLayout(null);
    	abuela=new JLabel("ABUELITA- MARIA");
    	abuela.setForeground(Color.blue);
    	abuela.setBounds(230,2,300,30);
    	add(abuela);
    	icono2=new JLabel();
    	icono2.setIcon(new ImageIcon("abuela.png"));
    	icono2.setBounds(260,30,24,24);
    	add(icono2);
    	//abuelos
    	setLayout(null);
    	abuelo2=new JLabel("ABUELO- JESUS");
    	abuelo2.setForeground(Color.blue);
    	abuelo2.setBounds(700,2,300,30);
    	add(abuelo2);
    	icono3=new JLabel();
    	icono3.setIcon(new ImageIcon("abuelo.png"));
    	icono3.setBounds(730,30,24,24);
    	add(icono3);
    	setLayout(null);
    	abuela2=new JLabel("ABUELITA- GABRIELA");
    	abuela2.setForeground(Color.blue);
    	abuela2.setBounds(900,2,300,30);
    	add(abuela2);
    	icono4=new JLabel();
    	icono4.setIcon(new ImageIcon("abuela.png"));
    	icono4.setBounds(940,30,24,24);
    	add(icono4);
    	//---------------------------------------------------------tios------------------------------------------------
    	//----------------------------------------------------FAMILIA DE MAMA------------------------------------------
    	setLayout(null);
    	tio=new JLabel("TIO- JUAN");
    	tio.setForeground(Color.blue);
    	tio.setBounds(2,170,300,30);
    	add(tio);
    	icono5=new JLabel();
    	icono5.setIcon(new ImageIcon("papa.png"));
    	icono5.setBounds(20,200,24,24);
    	add(icono5);
    	//tia ramiro
    	setLayout(null);
    	tio2=new JLabel("TIA- GLORIA");
    	tio2.setForeground(Color.blue);
    	tio2.setBounds(80,170,300,30);
    	add(tio2);
    	icono6=new JLabel();
    	icono6.setIcon(new ImageIcon("mama.png"));
    	icono6.setBounds(100,200,24,24);
    	add(icono6);
    	//tio pablo
    	setLayout(null);
    	tio2=new JLabel("TIO- PABLO");
    	tio2.setForeground(Color.blue);
    	tio2.setBounds(160,170,300,30);
    	add(tio2);
    	icono7=new JLabel();
    	icono7.setIcon(new ImageIcon("papa.png"));
    	icono7.setBounds(180,200,24,24);
    	add(icono7);
    	//tia natalia
    	tio3=new JLabel("TIA- NATALIA");
    	tio3.setForeground(Color.blue);
    	tio3.setBounds(240,170,300,30);
    	add(tio3);
    	icono8=new JLabel();
    	icono8.setIcon(new ImageIcon("mama.png"));
    	icono8.setBounds(260,200,24,24);
    	add(icono8);
    	//tia gloria
    	tio4=new JLabel("MAMA- MATILDE");
    	tio4.setForeground(Color.blue);
    	tio4.setBounds(340,170,300,30);
    	add(tio4);
    	icono9=new JLabel();
    	icono9.setIcon(new ImageIcon("mama.png"));
    	icono9.setBounds(370,200,24,24);
    	add(icono9);
    	//------------------------------------------------------------------------------FAMILIA DE PAPA---------------------------------------------
    	//PAPA LUIS
    	tio5=new JLabel("PAPA- LUIS");
    	tio5.setForeground(Color.blue);
    	tio5.setBounds(610,170,300,30);
    	add(tio5);
    	icono10=new JLabel();
    	icono10.setIcon(new ImageIcon("papa.png"));
    	icono10.setBounds(630,200,24,24);
    	add(icono10);
    	//TIO LALO
    	tio6=new JLabel("TIO- LALO");
    	tio6.setForeground(Color.blue);
    	tio6.setBounds(710,170,300,30);
    	add(tio6);
    	icono11=new JLabel();
    	icono11.setIcon(new ImageIcon("papa.png"));
    	icono11.setBounds(730,200,24,24);
    	add(icono11);
    	//TIO NACHO
    	tio7=new JLabel("TIO- NACHO");
    	tio7.setForeground(Color.blue);
    	tio7.setBounds(810,170,300,30);
    	add(tio7);
    	icono12=new JLabel();
    	icono12.setIcon(new ImageIcon("papa.png"));
    	icono12.setBounds(830,200,24,24);
    	add(icono12);
    	//TIA LUCINA
    	tio8=new JLabel("TIO- LUCINA");
    	tio8.setForeground(Color.blue);
    	tio8.setBounds(910,170,300,30);
    	add(tio8);
    	icono13=new JLabel();
    	icono13.setIcon(new ImageIcon("mama.png"));
    	icono13.setBounds(930,200,24,24);
    	add(icono13);
    	//TIA ALEJANDRA
    	tio9=new JLabel("TIO- ALEJANDRA");
    	tio9.setForeground(Color.blue);
    	tio9.setBounds(1010,170,300,30);
    	add(tio9);
    	icono14=new JLabel();
    	icono14.setIcon(new ImageIcon("mama.png"));
    	icono14.setBounds(1050,200,24,24);
    	add(icono14);
    	//TIA BLANCA
    	tio10=new JLabel("TIA- LUCINA");
    	tio10.setForeground(Color.blue);
    	tio10.setBounds(1160,170,300,30);
    	add(tio10);
    	icono14=new JLabel();
    	icono14.setIcon(new ImageIcon("mama.png"));
    	icono14.setBounds(1180,200,24,24);
    	add(icono14);
    	//-------------------------------------------------------------------------PRIMOS--------------------------------------------------------
    	//PRIMA LAURA
    	primo=new JLabel("PRIMA- LAURA");
    	primo.setForeground(Color.blue);
    	primo.setBounds(2,400,300,30);
    	add(primo);
    	ico=new JLabel();
    	ico.setIcon(new ImageIcon("prima.jpg"));
    	ico.setBounds(20,430,24,24);
    	add(ico);
    	//PRIMA LOLA
    	setLayout(null);
    	primo2=new JLabel("PRIMA- LOLA");
    	primo2.setForeground(Color.blue);
    	primo2.setBounds(100,400,300,30);
    	add(primo2);
    	ico2=new JLabel();
    	ico2.setIcon(new ImageIcon("prima.jpg"));
    	ico2.setBounds(120,430,24,24);
    	add(ico2);
    	//primo beto
    	setLayout(null);
    	primo3=new JLabel("PRIMO BETO");
    	primo3.setForeground(Color.blue);
    	primo3.setBounds(190,400,300,30);
    	add(primo3);
    	ico3=new JLabel();
    	ico3.setIcon(new ImageIcon("yo.png"));
    	ico3.setBounds(210,430,24,24);
    	add(ico3);
    	//prima laura
    	primo4=new JLabel("PRIMA- LURA");
    	primo4.setForeground(Color.blue);
    	primo4.setBounds(300,400,300,30);
    	add(primo4);
    	ico4=new JLabel();
    	ico4.setIcon(new ImageIcon("prima.jpg"));
    	ico4.setBounds(320,430,24,24);
    	add(ico4);
    	//YO
    	primo5=new JLabel("DAVID");
    	primo5.setForeground(Color.blue);
    	primo5.setBounds(500,400,300,30);
    	add(primo5);
    	ico5=new JLabel();
    	ico5.setIcon(new ImageIcon("yo.png"));
    	ico5.setBounds(505,430,24,24);
    	add(ico5);
    	//------------------------------------------------------------------------------FAMILIA DE PAPA---------------------------------------------
    	//PRIMO- EMMANUEL
    	primo6=new JLabel("PRIMO- EMMANUEL");
    	primo6.setForeground(Color.blue);
    	primo6.setBounds(650,400,300,30);
    	add(primo6);
    	ico6=new JLabel();
    	ico6.setIcon(new ImageIcon("papa.png"));
    	ico6.setBounds(680,430,24,24);
    	add(ico6);
    	//PRIMO- NACHO
    	primo7=new JLabel("PRIMO- NACHO");
    	primo7.setForeground(Color.blue);
    	primo7.setBounds(810,400,300,30);
    	add(primo7);
    	ico7=new JLabel();
    	ico7.setIcon(new ImageIcon("yo.png"));
    	ico7.setBounds(830,430,24,24);
    	add(ico7);
    	//PRIMA LUZ
    	primo8=new JLabel("PRIMA- LUZ");
    	primo8.setForeground(Color.blue);
    	primo8.setBounds(910,400,300,30);
    	add(primo8);
    	ico8=new JLabel();
    	ico8.setIcon(new ImageIcon("prima.jpg"));
    	ico8.setBounds(930,430,24,24);
    	add(ico8);
    	//TIA ALEJANDRA
    	primo9=new JLabel("PRIMA- ALEJANDRA");
    	primo9.setForeground(Color.blue);
    	primo9.setBounds(1010,400,300,30);
    	add(primo9);
    	ico9=new JLabel();
    	ico9.setIcon(new ImageIcon("prima.jpg"));
    	ico9.setBounds(1050,430,24,24);
    	add(ico9);
    	//PRIMO JESUS
    	primo10=new JLabel("PRIMO JESUS");
    	primo10.setForeground(Color.blue);
    	primo10.setBounds(1160,400,300,30);
    	add(primo10);
    	ico10=new JLabel();
    	ico10.setIcon(new ImageIcon("yo.png"));
    	ico10.setBounds(1180,430,24,24);
    	add(ico10);
    }
   public static void main(String[] args){
  		AGealogico ejemplo1=new AGealogico();
  		ejemplo1.setTitle("ARBOL GENEALOGICO");
  		ejemplo1.setSize(1300,1000);
  		ejemplo1.setVisible(true);
  	} 
}