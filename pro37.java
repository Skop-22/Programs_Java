//programa 37
//David Emanuel Flores Beltran
//convercion de binario a decimal
import java.util.Scanner;
import java.lang.Math;
public class pro37{
	double i,tamano,zeu;
	double a=0;
	double t=0;
	double t2=0;
	public pro37(){
		Scanner Sc=new Scanner(System.in);
		System.out.println("Introduce el El tamaño del numero binario:");
		tamano=Sc.nextDouble();
		for(i=0;i<tamano;i++){
			a=Math.pow(2,i);
			System.out.println("Introduce lo valores de 0 y 1: ");
			zeu=Sc.nextDouble();
			t=zeu*a;
			t2=t2+t;}}
	public void total(){
		System.out.println("El numero den decimal es de: "+t2);}
public static void main(String[] args){
	pro37 ob=new pro37();
	ob.total();
	}
}