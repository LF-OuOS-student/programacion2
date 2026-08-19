package Clases;
import java.util.Scanner;
public class CuentaBancaria {
    private String titular;
    private double saldo;
    private Scanner input = new Scanner(System.in);
    
    public CuentaBancaria (String titular,double saldo){
        this.titular = titular;
        this.saldo = saldo;   
}
    public void depositar(){
        System.out.println("Cuanto dinero desea depositar?");
        double deposito = input.nextDouble();
        setSaldo((deposito + getSaldo()));
        System.out.println("Se deposito:"+deposito);
        
     
}
    public void retirar(){
        System.out.println("Cuanto dinero desea retirar?");
        double retiro = input.nextDouble();
        if(saldo >= retiro){
        setSaldo((retiro - getSaldo()));
        System.out.println("Se retiro:"+retiro);
        }
        else{
        System.out.println("Saldo insuficiente"); 
        }
    }
    
    public void consultarSaldo(){
        System.out.println("Su saldo actual es: "+getSaldo());    
    }
//Getters

    public String getTitular() {
        return titular;
    }

    public double getSaldo() {
        return saldo;
    }
//Setters

    public void setTitular(String titular) {
        this.titular = titular;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }
    
}
