//operacionDos
//operacionTres 
//x+y n+m x+n el doble de cada variable
//x-y n-m y/m la suma de todas las variables
//x*y n*m  el producto de todas las variables
//david emanuel flores beltran
//programa 34
import java.io.*;

public class pro34{
	double x=1.0;
	double y=2.0;
	double m=3.2;
	double n=4.7;
	double a,b,c,d;
	public pro34(){
		System.out.println("X:"+x);
		System.out.println("Y:"+y);
		System.out.println("M:"+m);
		System.out.println("N:"+n);
		}
	public void ope1(){
		System.out.println("la suma de "+x+"+"+y+": " + (x+y));
		System.out.println("la suma de "+n+"+"+m+": " + (n+m));
		System.out.println("la suma de "+x+"+"+n+": " + (x+n));
		System.out.println("la suma de "+x+"+"+y+": " + (x+y));
		a=x*x;
		b=m*m;
		c=y*y;
		d=n*n;
		System.out.println("Doble X="+a+" Y="+c+" M="+b+" N="+d);
		}
	public void ope2(){
		System.out.println("La resta de "+x+"-"+y+": "+(x-y));
		System.out.println("La retsa de "+n+"-"+m+": "+(n-m));
		System.out.println("La divicion de "+y+"/"+m+": "+(y/m));
		System.out.println("La suma de todas las varibles es: "+(x+y+m+n));
		}
	public void ope3(){
		System.out.println("La multiplicacion es de "+x+"*"+y+": "+(x*y));
		System.out.println("La multiplicacion es de "+n+"*"+m+": "+(n*m));
		System.out.println("La suma de todas las varibles es: "+(x*y*m*n));
		}
	public static void main(String []args){
		pro34 objop = new pro34();
		objop.ope1();
		objop.ope2();
		objop.ope3();
		}
}