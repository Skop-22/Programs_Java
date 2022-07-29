//realizar un programa que solicite el nombre del usurio que 
//solisite tres numero enteros y al menor de ellos elevarlo ala quinta potencia
//Programa18
//David Emanuel Flores Beltran
import java.lang.Math;
import java.util.Scanner;
public class pro18{
	public static void main(String[] args) {
	Scanner Sc =new Scanner(System.in);
	String nombre;
	double n1,n2,n3;
	System.out.println("Introduce tu Nombre: ");
	nombre=Sc.nextLine();
	System.out.println("Introduce Numero 1: ");
	n1=Sc.nextDouble();
	System.out.println("Introduce Numero 2: ");
	n2=Sc.nextDouble();
	System.out.println("Introduce Numero 3: ");
	n3=Sc.nextDouble();
	System.out.println("------------------------------------------------------------------");
	if((n1<n2)&&(n1<n3)){
		System.out.println(nombre);
		System.out.println("El Numero menor es: "+n1);
		System.out.println("La elevacion ala quinta potencia es de: "+Math.pow(n1,5));}
	if((n2<n1)&&(n2<n3)){
		System.out.println(nombre);
		System.out.println("El Numero menor es: "+n2);
		System.out.println("La elevacion ala quinta potencia es de: "+Math.pow(n2,5));}
	if((n3<n1)&&(n3<n2)){
		System.out.println(nombre);
		System.out.println("El Numero menor es: "+n3);
		System.out.println("La elevacion ala quinta potencia es de: "+Math.pow(n3,5));}
	System.out.println("------------------------------------------------------------------");
	}
}