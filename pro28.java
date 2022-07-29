//Solicita el nombre y sueldo de un empleado y determinar si el sueldo es mayor a 
//3000 el programa deberá imprimir impuesto caso contrario no paga impuesto.
//programa 28
//David Emanuel Flores Beltran
import java.util.Scanner;
public class pro28{
	String nombre;
	double sueldo,impuesto;
public pro28(){
	Scanner Sc = new Scanner(System.in);
	System.out.println("Introduce Tu Nombre: ");
	nombre=Sc.nextLine();
	System.out.println("Introduce Tu sueldo: ");
	sueldo=Sc.nextDouble();}
public void si(){
	System.out.println("-------------------------------------------");
	if(sueldo<3000){
		System.out.println(nombre+" Nosete cobrara impuesto ");}
	if(sueldo>=3000){
		impuesto=sueldo*0.16;
		System.out.println(nombre+" Sete cobrara un impuesto ");
		System.out.println("Tu sueldo es de: "+impuesto);}
	System.out.println("-------------------------------------------");}
public static void main(String[] args){
	pro28 objop=new pro28();
	objop.si();
	}
}