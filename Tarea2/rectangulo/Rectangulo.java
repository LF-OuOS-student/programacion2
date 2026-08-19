package com.mycompany.rectangulo;
public class Rectangulo {
    private int ancho ;
    private int alto ;
    
    public Rectangulo (int ancho,int alto){
        this.ancho = ancho;
        this.alto = alto;
    }
    
    public int calcularArea(){
        int area = alto * ancho;
        return area;
        
    }
    
     public int calcularPerimetro(){
         int perimetro = 2*(ancho + alto);
         return perimetro;
        
    }
    
}
