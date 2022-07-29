// programa 22
// David emanuel flores Beltran 
// area de un circulo
import java.util.*;
class Programa22 {
    public static void main(String[] args) {
        Scanner ce= new Scanner(System.in);
        double T,r;
        System.out.println("Escriba un valor del radio: ");
        r=ce.nextDouble();
        T=(3.1416)*(r*r);
        System.out.println("Area es igual a:"+T);
    }
}