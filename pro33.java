//Realizar un programa que dado un numero enterose encuetre 
//dentro de un intervalo cerrado entre 50 100
//Programa 33
//David Emanuel Flores Beltran
import java.util.Scanner;
public class pro33{
int inter;
public pro33(){
	Scanner Sc=new Scanner(System.in);
	System.out.println("Introduce un numero: ");
	inter=Sc.nextInt();
	}
public void intervalo(){
	if((inter>=50)&&(inter<=100)){
	System.out.println("El numero esta dentro del intervalo");}
	else {System.out.println("EL numero esta fuera del intervalo");}
	}
public static void main(String[] args){
	pro33 objop=new pro33();
	objop.intervalo();
	}
}