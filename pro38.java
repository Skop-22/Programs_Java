//programa 38
//david Emanuel Flores Beltran
//la suma de 34 + 24 eso por 25 y eso entre 28
import java.io.*;
public class pro38{
	int a=34;
	int b=24;
	int c=25;
	int d=28;
	double t3;
	int t,t2;
	public pro38(){
	System.out.println("los numeros son : 34, 24, 25 y 28");
	}
	public void total(){
		t=a+b;
		t2=t*c;
		t3=t2/d;
		System.out.println("la suma de 34+24="+t);
		System.out.println("la multipliacion del resultado de la suma es de= "+t2);
		System.out.println("la divicion del resultado de la multipliacion es de= "+t3);
	}
public static void main(String[] args){
		pro38 objop=new pro38();
		objop.total();}}