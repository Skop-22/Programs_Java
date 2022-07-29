import java.util.Scanner;//libreria de tickets
public class productos{//clase productos
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);//crea una nueva Scanner instancia que apunta al flujo de entrada
        int i,pago;//variable de tipo entero 
        float iva,Total;//variable de tipo flotante
        int contadorP=0;//contador para el producto
        int condicion=1;//contador 
        int ct=0;//segundo contador
        int[] almacen = new int[20];//arreglo de tipo entero
        String sab = "1.-Sabritas         -----   15";//arreglo definido de tipo string
        String che = "2.-Chetos           -----   10";//ya esta espesifiado
        String dor = "3.-Doritos          -----   14";//ya esta espesificado
        String ruf = "4.-Rufles           -----   15";//ya esta espesificado
        while(condicion==1){//while con la condicion
            System.out.println("Productos           -----  precio");//imprime en consola
            System.out.println(sab);//imprime el arreglo
            System.out.println(che);//ya esta espesificado
            System.out.println(dor);//ya esta espesificado
            System.out.println(ruf);//ya esta espesificado
            System.out.print("Escriba el numero del producto: ");//ya esta espesificado
            almacen[ct]=sc.nextInt();//guarda en el arreglo el numero que digite el usuario
            if(almacen[ct]==1||(almacen[ct]==4)){contadorP=contadorP+15;}//si almacen en la posision del contador vale 1 o 4 contadorP = contadorP+15
            else if(almacen[ct]==2){contadorP=contadorP+10;}//de lo contrario si almacen es en la posicion del contador es igual a 2 contadorP bale contadorP+10
            else if(almacen[ct]==3){contadorP=contadorP+14;}//de lo contrario si almacen es en la posicion del contador es igual a 3 contadorp bale contadorP+14
            else{System.out.println("-------------------Error ese producto no existe ------------");ct=ct-1;}//delocontrario la opcion no existe y manda un error y elimina el valor escrito por el usuario
            System.out.println("Desea seguir comprando: 1=si 2=no");//imprie en consola
            condicion=sc.nextInt();//se guarda el la opcion 
            ct=ct+1;//se suma el contador
        }
        System.out.println("-----------------------------------------------\n\n");//imprime en consola
        for(i=0;i<=ct;i++){//sico for para imprimir el tiqued de compra del usuario
            if(almacen[i]==1){System.out.println(sab);}//si almacen en la posicion de la variable i vale 1 imprime la variable sab
            if(almacen[i]==2){System.out.println(che);}//si almacen en la posicion de la variable i vale 2 imprime la variable che
            if(almacen[i]==3){System.out.println(dor);}//si almacen en la posicion de la variable i vale 3 imprime la variable dor
            if(almacen[i]==4){System.out.println(ruf);}//si almacen en la posicion de la variable i vale 4 imprime la variable ruf
        }
        iva=(contadorP*16)/100;//iva es igual a conadaor por 16 entre 100
        Total=(contadorP+iva);//total es igual a contadorp mas iva
        System.out.println("-----------------------------------------------");//imprime en consola
        System.out.println("El precio a pagar es de:    "+contadorP+"   Mas el Iva es de: "+Total);//imprime el total de la compra mas a parte el total a pagar incluido el iva
        System.out.print("Recivir pago: ");//imprime en consola
        pago=sc.nextInt();//guarda en la variable pago
        if(pago>=Total){System.out.println("Su cambio es de: "+(pago-Total));}//si pago es mayor o igual a total imprime en consola su cambio
        if(pago<Total){System.out.println("Debe un monto de: "+(Total-pago));}//si pago es menor a total debe un monto de total-pago
    }//fin de main
}//fin de la clase