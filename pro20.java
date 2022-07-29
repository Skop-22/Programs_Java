//Realiza un programa que lea el promedio y si es mayor o 
//igual a 8.5 Beca al 100% si es mayor o igual a 7.5 beca al 50%
//en caso contrario asicnar Beca Al 25%
//programa 20
//David Emanuel Flores Beltran
import java.util.Scanner;
public class pro20{
    public static void main(String[] args){
	Scanner sc = new Scanner(System.in);
	double cali;
	System.out.println("Introduce tu calificacion: ");
	cali=sc.nextDouble();
	if(cali>=8.5){
		System.out.println("Resiviras beca completa");}
	if((cali<8.5)&&(cali>=7.5)){
		System.out.println("Resiviras beca del 50%");}
	if(cali<7.5){
		System.out.println("Resiciras beca del 25%");}
	}
}