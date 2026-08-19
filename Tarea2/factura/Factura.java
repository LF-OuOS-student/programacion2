package com.mycompany.factura;
public class Factura {
    private int numero;
    private float monto;
    private boolean estado;
    
    public Factura(int numero,float monto,boolean estado){
        this.numero = numero;
        this.monto = monto;
        this.estado = estado;
    }
    
    public void anular(){
        setEstado(false);      
    }
    
    public void mostrarInfo(){
        if(estado == true){
            System.out.println("La factura es vigente");
        }
        else{
            System.out.println("La factura esta anulada");
        }
        
    }
//Getters    

    public int getNumero() {
        return numero;
    }

    public float getMonto() {
        return monto;
    }

    public boolean getEstado() {
        return estado;
    }
    
//Setters

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public void setMonto(float monto) {
        this.monto = monto;
    }

    public void setEstado(boolean estado) {
        this.estado = estado;
    }
    
    
}
