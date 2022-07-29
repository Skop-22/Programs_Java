//programa24
//crear un programa que solicite dos números y al resultado lo multiplique por 80, ese resultado se le resta 15, se le suma 29 a ese resultado le va sumar 200 ese resultado lo va multiplicar por 3 ese resultado le va restar 97 le va multiplicar por 4 le va sumar 500 lo va multiplicar por 70 y le va restar 100
import java.util.Scanner;
public class pro24{
public static void main(String[] args)
{
	Scanner Sc = new Scanner(System.in);
	int NumA,NumB;//bariables
	int su,Mul,Rest,Sum,Sum2,Mul2,Rest2,mul3,sum3,mul4,res3;//operaciones
	System.out.println("introduce el primer numero");
	NumA=Sc.nextInt();
	System.out.println("introduce el segundo numero");
	NumB=Sc.nextInt();
	su=NumA+NumB;
	System.out.println("---------------------------------");
	System.out.println("Suma de los dos numeros: "+su);
	System.out.println("---------------------------------");
	System.out.println("_________________________");
	Mul=su*80;
	System.out.println(su+"*80: "+Mul+"                |");
	Rest=Mul-15;
	System.out.println(Mul+"-15: "+Rest+"              |");
	Sum=Rest+29;
	System.out.println(Rest+"+29: "+Sum+"              |");
	Sum2=Sum+200;
	System.out.println(Sum+"+200: "+Sum2+"             |");
	Mul2=Sum2*3;
	System.out.println(Sum2+"*3: "+Mul2+"              |");
	Rest2=Mul2-97;
	System.out.println(Mul2+"-97: "+Rest2+"            |");
	mul3=Rest2*4;
	System.out.println(Rest2+"*4: "+mul3+"             |");
	sum3=mul3+500;
	System.out.println(mul3+"*3: "+sum3+"             |");
	mul4=sum3*70;
	System.out.println(sum3+"*70: "+mul4+"          |");
	res3=mul4-100;
	System.out.println(mul4+"-100: "+res3+"       |");
	System.out.println("_________________________");
}
}