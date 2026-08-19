package com.mycompany.factura;
import java.util.Scanner;
public class main {

    public static void main(String[] args) {
        Factura factura1 = new Factura(1,500,true);
        Scanner input = new Scanner(System.in);
        char option ;
        do{
        System.out.println("""
                           ----Menu----
                           1.Anular factura
                           2.ver estado de la factura
                           3.Salir
                           Seleccione su option:
                           """);
        option = input.next().charAt(0);
        switch(option){
            case '1':
                factura1.anular();
                break;
            case '2':
                factura1.mostrarInfo();
                break;
            default:
                System.out.print("opcion invalida");
                break;       
        }
        }while(option != '3');        
    }
        
}
