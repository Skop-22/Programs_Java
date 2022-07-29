/*plantear un análisis de casos de una empresa de venta y compra de productos*/
import java.util.Scanner;//librería para la entrada de datos
public class Empresa {//clase empresa
    public static void main(String[] args){//main
        Scanner sca = new Scanner(System.in);//crea una nueva Scanner instancia que apunta al flujo de entrada
        int i;//varible int
        int condicion=1;//variable de la condición para while condicion principal
        int condicionVC=0;//variable de la condición para while condición vendedor o vendedor
        int conta=0;//contador
        int conta2=0;//contador dos
        String[] Prov={"Estado de Mexico ","Ciudad de Mexico ","Jalisco          ","Yucatan          "};//arreglo para el estado de la provincia
        //arreglos para el vendedor
        String[] NomPro =new String[40];//arreglo de tipo String
        String[] NomVend =new String[40];//arreglo de tipo String
        int[] Precio= new int[20];//arreglo de tipo entero precio
        int[] EstadoV =new int[20];//arreglo de tipo entero Estado del vendedor
        //arreglos para la compra
        String[] NomCom=new String[30];//arreglo de tipo String 
        int[] Envio=new int[20];//arreglo de tipo entero Envio
        int[] Compra=new int[20];//arreglo de tipo entero Compra
        int[] Cantida=new int[20];//arreglo de tipo entero cantida
        int[] total=new int[20];//arreglo de tipo entero
        int[] pagoT=new int[20];//arreglo de tipo
        while(condicion==1){//
            System.out.print("\033[H\033[2J");//para que no quede nada en la pantalla de la consola.
            System.out.flush();//limpiar los bytes
            System.out.println("------------------------------------------");//imprime en consola
            System.out.println("         Compra y venta de procto");//imprime en consola
            System.out.println("------------------------------------------");//imprime en consola
            System.out.println("Menu de inicio");//imprime en consola
            System.out.println("1.-Vender");//imprime en consola
            System.out.println("2.-Cliente");//imprime en consola
            System.out.println("3.-historial de compras");//imprime en consola
            System.out.println("4.-Salir");//imprime en consola
            System.out.println("Escriba el numero de lo que desea hacer");//imprime en consola
            condicionVC = sca.nextInt();//guarda en el arreglo los caracteres que escriba el Cliente
            if(condicionVC==4){condicion=0;}
            if((NomPro[0]==null)&&(condicionVC==2)&&(condicionVC==3)){System.out.println("Error");condicionVC=2;}
            if((condicionVC!=1)&&(condicionVC!=2)&&(condicionVC!=3)&&(condicionVC!=4)){System.out.println("Error no existe esa opcion");condicionVC=0;}
            //--------------------------------------------------vendedor---------------------------------------------
            while(condicionVC==1){//se repite mientras condición se cumpla
                System.out.print("\033[H\033[2J");//para que no quede nada en la pantalla de la consola.
                System.out.flush();//limpiar los bytes
                System.out.println("-----------------------------Vendedor---------------------------------");//imprime en consola
                for(i=0;i<=3;i++){System.out.println(i+".-"+Prov[i]);}
                //while(conta2<=3){System.out.println((conta2)+" .-"+Prov[conta2]);conta2=conta2+1;}
                //conta2=0;//Contador dos bale 0 <-------------------------------------puede generar error
                System.out.print("Introduce el numero del estado: ");//imprime en consola
                EstadoV[conta]=sca.nextInt();//guarda en el arreglo los caracteres que escriba el Cliente
                System.out.print("Nombre del vendedor: ");//imprime n consola
                NomVend[conta]= sca.next();//guarda en el arreglo los caracteres que escriba el Cliente
                System.out.print("Introduce el nombre del Producto : ");//imprime en consola
                NomPro[conta] = sca.next();//guarda en el arreglo los caracteres que escriba el Cliente
                System.out.print("Introduce EL Precio del Producto : ");//imprime en consola
                Precio[conta] = sca.nextInt();//guarda en el arreglo los caracteres que escriba el Cliente
                conta=conta+1;//contador
                System.out.print("desea continuar 1=si/4=no: ");//imprime en consola
                condicionVC = sca.nextInt();//guarda en la variable condicion
                if((condicionVC==3)||(condicionVC==2)){condicionVC=4;}//cunado condicionVC equivale a 2 cambia a 4
            }//fin de while vendedor
            //-----------------------------------------------Cliente----------------------------------------------------
            while((condicionVC==2)&&(NomVend[0]!=null)){
                System.out.print("\033[H\033[2J");//para que no quede nada en la pantalla de la consola.
                System.out.flush();//limpiar los bytes
                System.out.println("-----------------------------Cliente---------------------------------");//imprime en consola
                System.out.println("Nu Estado registro     |  Nombre Provedor            |            Nombre del Producto            |            Precio");//imprime en consola
                for(i=0;i<conta;i++){//bucle for para imprimir nombre, precio, cantidad
                    System.out.println(i+" .-"+Prov[EstadoV[i]]+"  |            "+NomVend[i]+"            |                    "+NomPro[i]+"            |            "+Precio[i]);//imprime en consola
                    }//fin del bucle for
                System.out.print("Introdusca el numero del producto que se muestra en la tabla: ");//imprime en consola
                Compra[conta2]=sca.nextInt();//guarda en el arreglo los caracteres que escriba el Cliente
                System.out.print("Introdusca el nombre del cliente: ");//imprime en consola
                NomCom[conta2]=sca.next();//guarda en el arreglo los caracteres que escriba el Cliente
                System.out.print("Introduce La cantida del producto : ");//imprime en consola
                Cantida[conta2] = sca.nextInt();//guarda en el arreglo los caracteres que escriba el Cliente
                System.out.println("-------------------Estados------------");//imprime en consola
                for(i=0;i<=3;i++){//bucle for
                    if((i==0)||(i==1)){System.out.println((i)+" .-"+Prov[i]+" Envio gratis");}//si el Cliente desea que se en vie el produto el estado de mexico o a l ciudad de mexico el envio es gratis
                    else if(i==2){System.out.println((i)+" .-"+Prov[i]+" Envio 300");}//si el cliente desea que s envié el producto al estado de jalisco se le cobra 300 pesos mas 
                    else if(i==3){System.out.println((i)+" .-"+Prov[i]+" Envio 500");}//si el cliente desea que s envié el producto al estado de Yucatan se le cobra 500 pesos mas 
                }//Fin del bucle for
                System.out.print("Introduce el numero del estado que sera enviado el producto: ");//imprime en consola
                Envio[conta2]=sca.nextInt();//guarda en el arreglo los caracteres que escriba el Cliente
                if((Envio[conta2]==0)||(Envio[conta2]==1)){total[conta2]=(Precio[Compra[conta2]]*Cantida[conta2]);}//si el Cliente desea que se en vie el produto el estado de mexico o a l ciudad de mexico el envio es gratis
                else if(Envio[conta2]==2){total[conta2]=(Precio[Compra[conta2]]*Cantida[conta2])+300;}//si el cliente desea que s envié el producto al estado de jalisco se le cobra 300 pesos mas 
                else if(Envio[conta2]==3){total[conta2]=(Precio[Compra[conta2]]*Cantida[conta2])+500;}//si el cliente desea que s envié el producto al estado de Yucatan se le cobra 500 pesos mas 
                System.out.println("Total a pagar:                            "+total[conta2]);
                System.out.print("Recibir pago: ");//imprime en consola
                pagoT[conta2]=sca.nextInt();//guarda en el arreglo
                while(pagoT[conta2]<total[conta2]){//si el pago es menor a total se repite hasta que el pago sea mayor o igual al total
                    System.out.println("----------------Error--------------");//imprime en consola
                    System.out.print("introduzca de nuevo el pago: ");//imprime en consola
                    pagoT[conta2]=sca.nextInt();//guarda en el arreglo
                }
                System.out.print("EL Cliente: "+NomCom[conta2]+" Compro: "+NomPro[Compra[conta2]]+" Total es de: "+total[conta2]+" camvio= "+(pagoT[conta2]-total[conta2]));
                conta2=conta2+1;//contador2
                System.out.print("\nDesea comprar mas 2=s1/4=no: ");//imprime en consola
                condicionVC=sca.nextInt();//guarda lo que desea hacer el cliente en la variable condicionVC
                if((condicionVC==1)||(condicionVC==3)){condicionVC=4;}//cunado condicionVC equivale a 1 o 3 cambia a 4
            }
            //----------------------------------------------Historial de compras----------------------------------------------
            while((condicionVC==3)&&(NomCom[0]!=null)){//bucle de historial de compras
                System.out.print("\033[H\033[2J");//para que no quede nada en la pantalla de la consola.
                System.out.flush();//limpiar los bytes
                System.out.println("-----------------------------Historial de compras---------------------------------");//imprime en consola 
                System.out.println("Nu.- Nombre Del Cliente | Nombre del Producto | Cantidad    |    Estado    |    Precio    |    Total    |    Pago");//imprime en consola 
                for(i=0;i<conta2;i++){//bucle for
                    System.out.println(i+".-              "+NomCom[i]+"    |    "+NomPro[Compra[i]]+"     |     "+Cantida[i]+"    |    "+Prov[Envio[i]]+"    |    "+Precio[Compra[i]]+"    |    "+total[i]+"    |    "+pagoT[i]);//imprime los datos del cliente
                }//fin del bucle for
                System.out.print("salir=4 ");//imprime en consola 
                condicionVC=sca.nextInt();//gurada en la variable lo que desea el Cliente
                if((condicionVC==1)||(condicionVC==2)){condicionVC=4;}//cunado condicionVC equivale a 1 cambia a 4
            }//fin del bucle while del historial de compras
        }//fin del while principal
    }//fin de main   
}//fin de la clase 