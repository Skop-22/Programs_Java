//tabla de multiplicar del 9
//david emanuel flores beltran
//programa 35
import java.io.*;
public class pro35{	
	int i;
	public pro35(){
	System.out.println("Tabla de multiplicar del 9");
	}
	public void mul(){
		for(i=1;i<=10;i++){
			System.out.println("9*"+i+":"+(9*i));
	}}
	public static void main(String[] args){
		pro35 objop=new pro35();
		objop.mul();
	}
}