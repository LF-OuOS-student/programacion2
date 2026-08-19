package Clases;
public class Personas {
    private String nombre;
    private int edad ;
    //COnstructor
public Personas(String constructorNombre,int constructorEdad){    
    this.nombre = constructorNombre;
    this.edad = constructorEdad;
}

public void Presentarse(){
    System.out.println("Hola mi nombre es "+getNombre()+" y mi edad es "+getEdad());
}


//Getters
    public String getNombre() {
        return nombre;
    }

    public int getEdad() {
        return edad;
    }
//Setters

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    
}
