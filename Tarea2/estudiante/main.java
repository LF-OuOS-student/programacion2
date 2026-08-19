package com.mycompany.estudiante;
import java.util.Scanner;
public class main {
    public static void main(String[] args) {
        //variables 
        Scanner input = new Scanner(System.in);
        
        System.out.println("Ingrese su nombre:");
        String nombre = input.next();
        System.out.println("Ingrese su nota");
        int nota = input.nextInt();
        
        Estudiante estudiante1 = new Estudiante(nombre,nota);
        boolean aprobo = estudiante1.aprobo();
        if(aprobo == true){
            System.out.println("Felicidades aprobo la materia");
        }
        else{
            System.out.println("no aprobo la materia");
        }
        
    }
}

