package com.mycompany.empleado;
public class Empleado {
    private String nombre;
    private double salario;
    
    public Empleado (String nombre,double salario){
        this.nombre = nombre;
        this.salario = salario;
    }
    
    public double calcularBono(){
        double bono = getSalario()*0.1;
        return bono;
    }
//Getters
    public String getNombre() {
        return nombre;
    }

    public double getSalario() {
        return salario;
    }

//Setters
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }
    
    
    
}
