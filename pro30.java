//Realizar u programa que imprima todos 
//los numeros de 100 a 0 de 7 en 7
//David Emanuel Flores Beltran
//Programa 30
import java.io.*;
public class pro30{
int i;
public void bucle(){
	for(i=100;i>=0;i-=7){
		System.out.println(i);}
	}

public static void main(String[] args){
	pro30 objop=new pro30();
	objop.bucle();
	}
}