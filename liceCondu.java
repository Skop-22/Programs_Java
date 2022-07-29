/**
 * @(#)liceCondu.java
 * Licencia de conduccion 
 * @author David Emanuel Flores Beltran 
 * @version 1.00 2020/11/28
 */

import javax.swing.*;
import javax.swing.event.*;
import java.awt.*;
public class liceCondu extends JFrame{
	JComboBox cmb1,cmb2;
	JRadioButton b1,b2,b3,b4,b5,b6,b7,b8,b9,b10,b11,b12,b13,b14;
	ButtonGroup grupo,grupo2,grupo3,grupo4,grupo5,grupo6;
	JTextField c1,fed,fem,fea,daN,edadE,fed2,fem2,fea2,daN2,cad,did,ted;
	JLabel Tema,nume,fecha,nom,edad,an,sexo,id,fen,dia,me,an2,lo,av,ac,ov,nom2,dap,ca,di,te,reco,oxe;
    public liceCondu() {
    	//tema principal del programa
    	setLayout(null);
    	Tema=new JLabel("Examen de la vista para obtener la licencia de conducir ");//Tema
    	Tema.setForeground(Color.blue);
    	Tema.setBounds(60,-20,400,100);
    	add(Tema);
    	//numero
    	nume=new JLabel("Numero:");
    	nume.setForeground(Color.red);
    	nume.setBounds(0,70,300,30);
    	add(nume);
    	//numero a introducir
    	c1=new JTextField();
    	c1.setBounds(55,70,100,25);
    	add(c1);
    	//fecha
    	fecha=new JLabel("Fecha:");
    	fecha.setForeground(Color.red);
    	fecha.setBounds(200,70,300,30);
    	add(fecha);
    	//feha a introducir
    	fed=new JTextField();
    	fed.setBounds(255,70,50,25);
    	add(fed);
    	fem=new JTextField();
    	fem.setBounds(305,70,50,25);
    	add(fem);
    	fea=new JTextField();
    	fea.setBounds(355,70,50,25);
    	add(fea);
    	//Datos Personales
    	nume=new JLabel("Datos Personales");
    	nume.setForeground(Color.blue);
    	nume.setBounds(0,110,300,30);
    	add(nume);
    	//Nombre
    	nom=new JLabel("Nombre:");
    	nom.setForeground(Color.blue);
    	nom.setBounds(50,150,300,30);
    	add(nom);
    	daN=new JTextField();
    	daN.setBounds(106,154,300,25);
    	add(daN);
    	//Edad
    	edad=new JLabel("Edad:");
    	edad.setForeground(Color.blue);
    	edad.setBounds(10,190,300,30);
    	add(edad);
    	edadE=new JTextField();
    	edadE.setBounds(55,190,40,25);
    	add(edadE);
    	an=new JLabel("Años.");
    	an.setForeground(Color.blue);
    	an.setBounds(105,190,300,25);
    	add(an);
    	//SEXO
    	an=new JLabel("SEXO");
    	an.setForeground(Color.blue);
    	an.setBounds(205,190,300,25);
    	add(an);
    	b1=new JRadioButton("Hombre");
   		b1.setBounds(245,192,70,20);
   		add(b1);
    	b2=new JRadioButton("Mujer");
   		b2.setBounds(325,192,70,20);
   		add(b2);
   		grupo=new ButtonGroup();
   		grupo.add(b1);
   		grupo.add(b2);
   		//Tipo de identificacion
    	id=new JLabel("Tipo de Identificacion:");
    	id.setForeground(Color.blue);
    	id.setBounds(0,230,300,25);
    	add(id);
    	cmb1=new JComboBox();
		cmb1.setBounds(150,232,200,20);
		add(cmb1);
		cmb1.addItem("------------Elija Una Obcion---------");
		cmb1.addItem("              Credencial del INE.");
		cmb1.addItem("      Cédula profesional vigente.");
		cmb1.addItem("              Pasaporte vigente.");
		//Fecha de nacimiento
    	fen=new JLabel("Fecha de nacimiento:");
    	fen.setForeground(Color.blue);
    	fen.setBounds(0,260,300,25);
    	add(fen);
    	an2=new JLabel("Año:");
    	an2.setForeground(Color.blue);
    	an2.setBounds(150,260,300,25);
    	add(an2);
    	fed2=new JTextField();
    	fed2.setBounds(180,260,50,25);
    	add(fed2);
    	me=new JLabel("Mes:");
    	me.setForeground(Color.blue);
    	me.setBounds(230,260,300,25);
    	add(me);
    	fem2=new JTextField();
    	fem2.setBounds(260,260,50,25);
    	add(fem2);
    	dia=new JLabel("Dia:");
    	dia.setForeground(Color.blue);
    	dia.setBounds(310,260,300,25);
    	add(dia);
    	fea2=new JTextField();
    	fea2.setBounds(340,260,50,25);
    	add(fea2);
    	//Lugar de origen
    	lo=new JLabel("Lugar de Origen:");
    	lo.setForeground(Color.blue);
    	lo.setBounds(0,290,300,25);
    	add(lo);
    	cmb2=new JComboBox();
		cmb2.setBounds(150,290,200,20);
		add(cmb2);
		cmb2.addItem("------------Elija Una Obcion---------");
		cmb2.addItem("                       Otumba");
		cmb2.addItem("                     Axapusco.");
		cmb2.addItem("                      San Juan");
		//Aptitud visual
    	av=new JLabel("Aptitud visual:");
    	av.setForeground(Color.red);
    	av.setBounds(0,320,300,25);
    	add(av);
    	b3=new JRadioButton("SC");
   		b3.setBounds(150,324,70,17);
   		add(b3);
    	b4=new JRadioButton("CC");
   		b4.setBounds(220,324,70,17);
   		add(b4);
   		grupo2=new ButtonGroup();
   		grupo2.add(b3);
   		grupo2.add(b4);
   		//Vision de colores
   		ac=new JLabel("Vision de colores:");
    	ac.setForeground(Color.red);
    	ac.setBounds(0,350,300,25);
    	add(ac);
    	b5=new JRadioButton("Normal");
   		b5.setBounds(150,354,70,17);
   		add(b5);
    	b6=new JRadioButton("Anormal");
   		b6.setBounds(230,354,110,17);
   		add(b6);
   		grupo3=new ButtonGroup();
   		grupo3.add(b5);
   		grupo3.add(b6);
   		//Osteoporosis Visual
   		ov=new JLabel("Osteoporosis Visual:");
    	ov.setForeground(Color.red);
    	ov.setBounds(0,380,300,25);
    	add(ov);
    	b7=new JRadioButton("Normal");
   		b7.setBounds(150,384,70,17);
   		add(b7);
    	b8=new JRadioButton("Subnormal");
   		b8.setBounds(230,384,110,17);
   		add(b8);
   		b9=new JRadioButton("Anormal");
   		b9.setBounds(340,384,110,17);
   		add(b9);
   		grupo3=new ButtonGroup();
   		grupo3.add(b7);
   		grupo3.add(b8);
   		grupo3.add(b9);
   		//Nombre
   		dap=new JLabel("Datos personales");
    	dap.setForeground(Color.red);
    	dap.setBounds(2,410,300,30);
    	add(dap);
    	//nombre
    	nom2=new JLabel("Nombre:");
    	nom2.setForeground(Color.black);
    	nom2.setBounds(0,440,300,30);
    	add(nom2);
    	daN2=new JTextField();
    	daN2.setBounds(100,444,300,25);
    	add(daN2);
    	//Correo Activo
    	ca=new JLabel("Correo Activo:");
    	ca.setForeground(Color.black);
    	ca.setBounds(0,470,300,30);
    	add(ca);
    	cad=new JTextField();
    	cad.setBounds(100,474,300,25);
    	add(cad);
    	//Direccion
    	di=new JLabel("Direccion:");
    	di.setForeground(Color.black);
    	di.setBounds(0,500,300,30);
    	add(di);
    	did=new JTextField();
    	did.setBounds(100,504,300,25);
    	add(did);
    	//direccion
    	te=new JLabel("Telefono:");
    	te.setForeground(Color.black);
    	te.setBounds(0,530,300,30);
    	add(te);
    	ted=new JTextField();
    	ted.setBounds(100,534,300,25);
    	add(ted);
    	//redomendadiones
    	reco=new JLabel("Recomendaciones:");
    	reco.setForeground(Color.red);
    	reco.setBounds(50,560,300,30);
    	add(reco);
    	//normal subnormal
    	b10=new JRadioButton("Normal");
   		b10.setBounds(0,594,70,17);
   		add(b10);
    	b11=new JRadioButton("Subnormal");
   		b11.setBounds(100,594,110,17);
   		add(b11);
   		grupo5=new ButtonGroup();
   		grupo5.add(b10);
   		grupo5.add(b11);
   		//Opcion del examen
    	oxe=new JLabel("Opinion del examen:");
    	oxe.setForeground(Color.red);
    	oxe.setBounds(50,610,300,30);
    	add(oxe);
    	b12=new JRadioButton("Bueno");
   		b12.setBounds(0,644,70,17);
   		add(b12);
    	b13=new JRadioButton("Regular");
   		b13.setBounds(100,644,110,17);
   		add(b13);
   		b14=new JRadioButton("Malo");
   		b14.setBounds(220,644,110,17);
   		add(b14);
   		grupo3=new ButtonGroup();
   		grupo3.add(b12);
   		grupo3.add(b13);
   		grupo3.add(b14);
    }
    public static void main (String[] args) {
		liceCondu mia= new liceCondu();
		mia.setBounds(500,0,450,710);
		mia.setVisible(true);
		mia.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		}
}