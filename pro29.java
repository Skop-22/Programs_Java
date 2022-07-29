//Realiza un programa que realice que haga la concede de monedas de 
//peso a dólar de peso a yen, de peso a euros, de peso a sol
//Programa 29
//David Emanuel Flores Beltran
import java.util.Scanner;
public class pro29{
double pesos;
public pro29(){
	Scanner Sc = new Scanner(System.in);
	System.out.println("Introdusca los pesos:");
	pesos=Sc.nextDouble();}
public void dinero(){
	System.out.println("--------------------------");
	System.out.println("DOLAR:  "+pesos*0.047);
 	System.out.println("YEN:    "+pesos*4.99);
	System.out.println("EUROS:  "+pesos*0.040);
	System.out.println("SOL:    "+pesos*0.17);
	System.out.println("--------------------------");}
public static void main(String[] args)
{
	pro29 objop=new pro29();
	objop.dinero();
	}
}