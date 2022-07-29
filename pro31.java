//realizar un programa que pida los sueldos mustra la 
//suma y menciona cuantos sueldos son mayores 1000 y sumalos
//David Emanuel Flores Beltran 
//programa 31
import java.util.Scanner;
public class pro31{
int sueldo=0,i,s,sueldo2=0,sueldo3=0;
public pro31(){
	Scanner Sc=new Scanner(System.in);
	for(i=1;i<=10;i++){
		System.out.println("Introduce El sueldo "+i+": ");
		s=Sc.nextInt();
		sueldo=sueldo+s;
		if(s>1000){
			sueldo3++;
			sueldo2=s+sueldo2;}
		}
	}
public void hipo(){
	System.out.println("-------------------------------------------------------------");
	System.out.println("La suma total es de: "+sueldo);
	System.out.println("Sueldos que exeden los 1000 pesos: "+sueldo3);
	System.out.println("La suma de los sueldos que exeden los 1000 pesos: "+sueldo2);
	System.out.println("-------------------------------------------------------------");}
public static void main(String[] args){
	pro31 objop=new pro31();
	objop.hipo();
	}
}