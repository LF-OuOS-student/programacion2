package Clases;
public class Carro {
    private String marca;
    private String modelo;
    private int velocidad;
    
    public Carro(String marca,String modelo,int velocidad){
        this.marca = marca;
        this.modelo = modelo;
        this.velocidad = velocidad;
    }
    
    public void acelerar(){
       int aceleracion =(getVelocidad()+25);
       setVelocidad(aceleracion);
    }
    
    public void frenar(){
        int desaceleracion =(getVelocidad()-25);
       setVelocidad(desaceleracion);
}
//Getters
    public String getMarca() {
        return marca;
    }

    public String getModelo() {
        return modelo;
    }

    public int getVelocidad() {
        return velocidad;
    }
//Setters

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public void setVelocidad(int velocidad) {
        this.velocidad = velocidad;
    }
    
}

