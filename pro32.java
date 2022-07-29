//Realiza un programa que pida 5 calificaciones,imprima la cantidad de 
//aprobados siendo mayor a 5 o igual si es menor a 4 o igual es suspendido
//Programa 32
//David Emanuel Flores Beltran 
import java.util.Scanner;
public class pro32{
double cal;
int i;
public pro32(){
	Scanner Sc=new Scanner(System.in);
	for(i=1;i<=5;i++){
		System.out.println("Introduce Calificacion "+i+": ");
		cal=Sc.nextDouble();
		if(cal>=5){System.out.println(cal+" Aprobaste");}
		if(cal<5){System.out.println(cal+" Suspendido");}
		System.out.println("-------------------------------");
		}
	}
public void RA(){
	System.out.println(" ");}
public static void main(String[] args){
	pro32 objop=new pro32();
	objop.RA();
	}
}