//programa15
import java.lang.*;
import java.util.Scanner;
public class pro15{
public static void main(String[] args)
{
	Scanner Sc=new Scanner(System.in);
	double N1,N2,su,re,mu,di;
	System.out.println("introduce un numero:");
	N1=Sc.nextDouble();
	System.out.println("introduce un segundo numero:");
	N2=Sc.nextDouble();
	su=N1+N2;
	re=N1-N2;
	mu=N1*N2;
	di=N1/N2;
	System.out.println("Suma:            "+su);
	System.out.println("Resta:           "+re);
	System.out.println("Multiplicacion:  "+mu);
	System.out.println("Divicion:        "+di);
}
}