package com.mycompany.empleado;
public class Programador extends Empleado {
    public Programador (String nombre,double salario){
        super(nombre,salario);
    }
    
   public void Presentacion(){
       System.out.println("Hola soy programador");
   }
     
}
