package com.mycompany.calculadora;
public class Calculadora {
    public double sumar(double numberOne,double numberTwo){
        double suma = numberOne + numberTwo;
        return suma;
        
    }
    public double restar(double numberOne,double numberTwo){
        double resta = numberOne - numberTwo;
        return resta;
    }
    
    public double multiplicar(double numberOne,double numberTwo){
        double multiplicacion = numberOne * numberTwo;
        return multiplicacion;
    }
    
    public double dividir(double numberOne,double numberTwo){
        double division = 0; 
        if(numberTwo != 0){
        division = numberOne/numberTwo;
        }
        return division;
    }
    
    public static void main(String[] args) {
        System.out.println("Hello World!");
    }
    
}
