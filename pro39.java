//PROGRAMA39
//DAVID EMANUEL FLORES BELTRAN
//convercion de octal a decimal
import java.util.Scanner;
import java.lang.Math;
public class pro39{
	double i,tamano,zeu;
	double a=0;
	double t=0;
	double t2=0;
	public pro39(){
		Scanner Sc=new Scanner(System.in);
		System.out.println("Introduce el El tamaño del numero octal:");
		tamano=Sc.nextDouble();
		for(i=0;i<tamano;i++){
			a=Math.pow(8,i);
			System.out.println("Introduce lo valores de 0 al 7: ");
			zeu=Sc.nextDouble();
			t=zeu*a;
			t2=t2+t;}}
	public void total(){
		System.out.println("El numero en decimal es de: "+t2);}
public static void main(String[] args){
	pro39 ob=new pro39();
	ob.total();
	}
}