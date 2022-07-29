//programa 26
//david Emanuel Flores Beltran
//programa operaciones basicas con constructor
import java.util.Scanner;				//Iportas la clase Scanner 
import java.io.*;					//importar la clase io
							//open basic operaciones basicas 
public class OpeBasic{					//inicio de la funcion 
double a,b;						//nombre de las variables
public OpeBasic(){					//funcion open vasic operaciones basicas
Scanner Sc=new Scanner (System.in);			//crear un objeto Scanner
System.out.println("Introduce el primer valor:");	//imprimir en pantalla "Introducir el primer valor"
a=Sc.nextDouble();					//guardar en la variable "a"
							//imprimir en pantalla "Introducir el segundo valor"
System.out.println("Introduce el segundo valor:");
b=Sc.nextDouble();					//gurdar en la variable "b"
}							//fin de la funcion 

public void suma(){					//inicio de la funcion suma
System.out.println("La suma es:"+ (a+b));		//imprime en panatalla "la suma es:"(a+b)
}							//fin de la funcion suma
							
public void resta(){					//inicio de la funcion resta
System.out.println("La resta es:"+(a-b));}		//imprime en pantalla la lellenda de La resta es de: (a-b)
							
public void multiplicacion(){				//inicio de la funcion de multiplicacion 
System.out.println("La multiplicacion es:"+(a*b));}	//imprime en pantalla la lellenda de la multiplicacion es de: (a*b)
							//fin de la funcion
public void division(){					//inicio de la funcion divicion 
System.out.println("La division es:"+ (a/b));		//imprime en pantalla la lellenda de la divicion es de: (a/b)
}							//fin de la funcion 
							
public static void main(String[] args){			//inicio de la funcion main
OpeBasic objop=new OpeBasic();				//manda a llamar la clase opebasic(operaciones basicas)
objop.suma();						//objeto suma
objop.resta();						//objeto resta
objop.multiplicacion();					//objeto multiplicacion 
objop.division();					//objeto divicion
}							//fin del programa
}