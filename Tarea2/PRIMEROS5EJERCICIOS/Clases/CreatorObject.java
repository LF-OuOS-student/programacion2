package Clases;
import subclases.*;
public class CreatorObject {
    
     //Crear objecto Personas
// =======================================================
    public Personas objectPerson(String nombre,int edad){
        Personas persona1 = new Personas(nombre,edad);
        return persona1;
    }
    
    //Crear objecto carro
// =======================================================
    public Carro objectCarro(String marca,String modelo,int velocidad){
        Carro carro1 = new Carro(marca,modelo,velocidad);
        return carro1;
    }
    
    //Crear objecto cuenta bancaria
// =======================================================
    public CuentaBancaria objectCuentaBancaria(String titular,double saldo){
        CuentaBancaria cuenta1 = new CuentaBancaria(titular,saldo);
        return cuenta1;
    }
    
    //Crear objecto libro
// =======================================================
   public Libro[] objectLibro(String[] titulos, String[] autor, int[] paginas, int cantidadObjetos) {
    Libro[] libros = new Libro[cantidadObjetos];
    for (int i = 0; i < cantidadObjetos; i++) {
        libros[i] = new Libro(titulos[i], autor[i], paginas[i]);
    }
    return libros; 
}
   
     //Crear objecto libro
// =======================================================
   public Animal objectPerro (){
       Animal perro1 = new Perro();
       return perro1;       
   }
   public Animal objectGato (){
       Animal gato1 = new Gato();
       return gato1;
   }

}
