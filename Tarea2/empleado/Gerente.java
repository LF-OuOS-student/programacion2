package com.mycompany.empleado;
public class Gerente extends Empleado {
    public Gerente(String nombre, double salario){
        super(nombre, salario); 
    }

    public double calcularBonoExtra(){
        double bonoExtra = getSalario() * 0.15;
        return bonoExtra;
    }
}
