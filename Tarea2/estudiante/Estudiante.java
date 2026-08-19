package com.mycompany.estudiante;
public class Estudiante {
    private String nombre;
    private int nota;
    public  Estudiante(String nombre,int nota){
        this.nombre = nombre;
        this.nota = nota;
    }
    
    public boolean aprobo(){
        boolean paso ;
        if(nota >= 60){
            paso = true;
            return paso;
        }
        else{
            paso = false;
            return paso;
        }  
    }
    
}
