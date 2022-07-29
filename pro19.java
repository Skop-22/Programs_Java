//Realiza un programa que pida las edades de 
//10 alumnos determine la edad promedio
//programa 19
//David Emanuel Flores Beltran
import java.util.Scanner;
public class pro19{
	public static void main (String[] args){
	Scanner  Sc=new Scanner(System.in);
	int a=0,edad,i,prom;
	for(i=1;i<=10;i++){
		System.out.println("--------------------------------------");
		System.out.println("introduce la edad del alumno"+i+":");
		edad=Sc.nextInt();
		a=edad+a;
		System.out.println(a);
	}
	prom=a/10;
	System.out.println("El promedio de las edades de los 10 alumnos es de: "+prom);
	}
}