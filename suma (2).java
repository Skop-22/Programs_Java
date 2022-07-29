import java.util.Scanner;

import java.io.*;

public class suma{

public static void main (String[] args){//el padre nustro

Scanner Sc=new Scanner (System.in);//sc 

int num1,num2, resultado;

System.out.println("ingrese un numero:");

num1=Sc.nextInt();

System.out.println("ingrese otro numero:");

num2=Sc.nextInt();

resultado=num1 + num2;

System.out.println("La suma es:"+ resultado +" Este es el total");

}

}