//Realizar un programa que lea la longitud de los catetos de un 
//triangulo rectangulo y calcule la longitud de la hipotenusa
//David Emanuel Flores Beltran 
//programa 27
import java.lang.Math;
import java.util.Scanner;
import java.io.*;
public class pro27{
double ca,co,h,r2,r;
public pro27(){
	Scanner Sc=new Scanner(System.in);
	System.out.println("Introduce El Cateto Opuesto: ");
	co=Sc.nextDouble();
	System.out.println("Introduce El Cateto Adyacente:");
	ca=Sc.nextDouble();}
public void hipo(){
	r2=(Math.pow(ca,2))+(Math.pow(co,2));
	r=Math.pow(r2,0.5);
	System.out.println("La Hipotenusa es de: "+r);}

public static void main(String[] args){
	pro27 objop=new pro27();
	objop.hipo();
	}
}