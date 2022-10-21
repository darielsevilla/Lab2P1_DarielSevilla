package lab2p1_darielsevilla;

//Dariel Emilio Sevilla Bueso
//12241006

import java.util.Scanner;

public class Lab2P1_DarielSevilla {

    public static void main(String[] args) {
        //entradas
        Scanner lea = new Scanner(System.in);
        int menu;
        do {
            System.out.print("\nMenu\nElija opcion\n\n");
            System.out.println("1- MCD");
            System.out.println("2- Sumatoria");
            System.out.println("3- Supermercado");
            System.out.println("4- Salida");
            //validacion de menu
            do{
                System.out.print("Opcion elegida: ");
                menu = lea.nextInt();
            }while(menu < 0 && menu >4);
            //variables para validacion y algunas entradas
            float test;
            int num;
            int num2;
            //opcion
            if(menu == 1){
                //entrada
                System.out.println("\n--Opcion MCD--\n");
                //chequeo de si son enteros y positivos
                do{
                  System.out.print("Ingrese un numero entero positivo: ");
                  test = lea.nextFloat();
                  num = (int) test;
                }while((test - num != 0) || (num <= 0));
                //validacion num2
                do{
                  System.out.print("Ingrese otro numero entero positivo: ");
                  test = lea.nextFloat();
                  num2 = (int) test;
                }while((test - num2 != 0) || (num2 <= 0));
                
                //MCD
                int val1 = num;
                int val2 = num2;
                
                while(val1 != val2){
                    if (val1 > val2){
                        val1 -= val2;
                    }
                    else{
                        val2 -= val1;
                    }        
                }
                
                int mcd = val1;
                System.out.printf("El MCD de %d y %d es: %d%n", num, num2, mcd);
            }
            else if (menu == 2){
                //Opcion sumatoria
                System.out.println("\n--Opcion Sumatoria--\n");
                //validacion
                do{
                  System.out.print("Ingrese un numero entero positivo: ");
                  test = lea.nextFloat();
                  num = (int) test;
                }while((test - num != 0) || (num <= 0));
                
                //contador
                double n = 1;
                double acu = 0;
                while (n <= num) {
                    acu += Math.pow((n/(n+1)), n);
                    n++;
                }
                //salida
                System.out.printf("Sumatoria: %f%n", acu);
            }
            else if (menu == 3){
                //Opcion supermercado
                System.out.println("\n--Opcion Supermercado--\n");
                //entradas
                int tipo, cUni;
                float pUni;
                do{
                    System.out.print("Ingrese tipo de cliente: ");
                    tipo = lea.nextInt();
                    
                }while(tipo < 0 || tipo > 2);
                
                do{
                    System.out.print("Ingrese precio por unidad: ");
                    pUni = lea.nextFloat();
                    
                    System.out.print("Ingrese numero de unidades: ");
                    cUni = lea.nextInt();
                }while(pUni <= 0 || cUni <= 0);
                
                //calculos 
                int canti = cUni; 
                double des = 1;
                double tot;
                
                if(tipo == 0){
                    if(canti >= 10 && canti <= 19){
                        canti -= 2;
                    }
                    else if(canti >= 20){
                        canti -= 5;
                    }
                }
                else if(tipo == 1){
                    if (canti >= 20 && canti <= 29){
                        canti -= 2;
                    }
                    else if (canti >= 30){
                        canti -= 5;
                    }   
                    
                    des = 0.9;
                }
                else{
                    if(canti >= 30 && canti <= 39){
                        canti -= 2;
                    }
                    else if(canti >= 40){
                        canti -= 5;
                    }
                    
                    des = 0.7;
                }
                
                tot = canti * pUni * des;
                System.out.printf("total a pagar: %f%n", tot);
            }
        }while(menu != 4);
        
        System.out.println("Saliendo...");
       
    }
}
