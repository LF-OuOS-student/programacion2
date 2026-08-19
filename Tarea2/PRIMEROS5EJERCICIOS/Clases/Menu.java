package Clases;
import subclases.*;
import java.util.Scanner;

public class Menu {
    private CreatorObject objetos = new CreatorObject();
    private Scanner input = new Scanner(System.in);
    
    // Guardadores 
// =======================================================
    private Personas persona1;
    private Carro carro1;
    private CuentaBancaria cuenta1;
    private Libro[] listLibro;
    private Perro perro1;
    private Gato gato1;

    // MÉTODOS HELPER (AUXILIARES)
// =======================================================

    // Helper para pedir un texto (String)
    private String pedirTexto(String mensaje) {
        System.out.println(mensaje);
        return input.next();
    }

    // Helper para pedir un número entero (int)
    private int pedirNumero(String mensaje) {
        System.out.println(mensaje);
        return input.nextInt();
    }
    
    // Helper para pedir un numero double (double)
    private double pedirDouble(String mensaje){
        System.out.println(mensaje);
        return input.nextDouble();
    }

    // Helper para pedir una opción de menú (char)
    private char pedirOpcion() {
        System.out.print("Seleccione una opcion: ");
        return input.next().charAt(0);
    }
    


    // MÉTODOS DE MENÚ
// =======================================================

    public void menuMain() {
        System.out.println("""
                            ----Menu Clases----
                           1.Persona
                           2.Carro
                           3.Cuenta Bancaria
                           4.Libro
                           5.Animal
                           """);
        
        char option = pedirOpcion();
        
        switch(option) {
            //option persona
            case '1': 
                String nombre = pedirTexto("Escriba el nombre de su persona:");
                int edad = pedirNumero("Escriba su edad:");
                
                persona1 = objetos.objectPerson(nombre, edad); 
                menuPerson();
                break;
                
            //option carro    
            case '2':
                String marca = pedirTexto("Escriba la marca de su carro:");
                String modelo = pedirTexto("Escriba el modelo de su carro:");
                int velocidad = pedirNumero("Escriba la velocidad de su carro:");
                
                carro1 = objetos.objectCarro(marca, modelo, velocidad); 
                menuCarro();
                break;
            
            //option cuenta bancaria
            case '3':
                String titular = pedirTexto("Escriba el nombre de su cuenta");
                Double saldo = pedirDouble("Ingrese el saldo el cual quiere abrir su cuenta");
                
                cuenta1 = objetos.objectCuentaBancaria(titular,saldo);
                menuCuentaBancaria();
                break;
            
            //option libro
            case '4':
                int cantidadLibros = pedirNumero("Ingrese la cantidad de libros que quiere ingresar: ");
                
                // 1. Declaramos e instanciamos arreglos con el tamaño adecuado
                String[] titulos = new String[cantidadLibros];
                String[] autores = new String[cantidadLibros];
                int[] paginas = new int[cantidadLibros];

                // 2. Llenamos los arreglos con los datos que ingresa el usuario
                for (int i = 0; i < cantidadLibros; i++) {
                    System.out.println("\n--- Libro " + (i + 1) + " ---");
                    titulos[i] = pedirTexto("Ingrese el nombre del libro:");
                    autores[i] = pedirTexto("Ingrese el nombre del autor:");
                    paginas[i] = pedirNumero("Ingrese la cantidad de paginas:");
                }
                
                // 3. Pasamos los arreglos completos a la fábrica una sola vez
                listLibro = objetos.objectLibro(titulos, autores, paginas, cantidadLibros);
                menuLibro();
                break;
            case '5':
                menuAnimal();
                break;                                     
            default:
                System.out.println("Opción no válida.");
                break;
        }
    }
    //Menu de Clase Personas
// =======================================================
    
    public void menuPerson() {
        // Validación rápida al inicio
        if (persona1 == null) {
            System.out.println("Primero debes crear a la persona.");
            return;
        }

        System.out.println("""
                            ----Menu metodos----
                           1.presentacion
                           """);
                           
        if (pedirOpcion() == '1') {
            persona1.Presentarse();
        }
    }
    
    //Menu de la clase carro
// =======================================================

    public void menuCarro() {
        if (carro1 == null) {
            System.out.println("Primero debes crear el carro.");
            return;
        }

        char option;
        do {
            System.out.println("""
                              ----Menu metodo----
                              1.Acelerar
                              2.Frenar
                              3.Velocidad actual
                              4.Salir
                              """);
                              
            option = pedirOpcion();
            
            switch(option) {
                case '1':
                    carro1.acelerar();
                    break; 
                case '2':
                    carro1.frenar();
                    break;        
                case '3':
                    System.out.println("Velocidad actual: " + carro1.getVelocidad());
                    break;                 
                case '4':
                    System.out.println("Saliendo del menu del carro...");
                    break;     
                default:
                    System.out.println("Opcion no valida.");
                    break;
            }
            
        } while (option != '4'); 
    }
    
    //Menu de la clase cuenta bancaria
// =======================================================
    public void menuCuentaBancaria(){
         if (cuenta1 == null) {
            System.out.println("Primero debes crear la cuenta.");
            return;
         }
         
         char option;
         do{
             System.out.println("""
                              ----Menu metodo----
                              1.Depositar
                              2.Retirar
                              3.Saldo actual
                              4.Salir
                              """);
                              
            option = pedirOpcion();
            switch(option) {
                case '1':
                    cuenta1.depositar();
                    break; 
                case '2':
                    cuenta1.retirar();
                    break;        
                case '3':
                    cuenta1.consultarSaldo();
                    break;                 
                case '4':
                    System.out.println("Saliendo del menu de la cuenta...");
                    break;     
                default:
                    System.out.println("Opcion no valida.");
                    break;
            }
             
         }while (option != '4');      
    }
    
    //Menu de la clase libro
// =======================================================
   public void menuLibro() {
    if (listLibro == null || listLibro.length == 0) {
        System.out.println("No hay libros registrados.");
        return;
    }

    int opcion = 0;
    do {
        System.out.println("\n=== MENÚ LIBROS ===");
        System.out.println("Tienes " + listLibro.length + " libros disponibles.");
        System.out.println("1. Ver un libro en específico");
        System.out.println("2. Volver al menú principal");
        
        opcion = pedirNumero("Seleccione una opción:");

        if (opcion == 1) {
            int indice = pedirNumero("Ingrese el número del libro (1 a " + listLibro.length + "):");
            
            // Validamos que el número exista en el arreglo
            if (indice >= 1 && indice <= listLibro.length) {
                System.out.println("\n--- DETALLE DEL LIBRO ---");
                listLibro[indice - 1].mostrarLibro(); // Ajustamos de 1-index a 0-index
            } else {
                System.out.println("Número de libro no válido.");
            }
        }
    } while (opcion != 2);
}
   
      //Menu de la clase Animal
// =======================================================
 public void menuAnimal(){
     char option ;
     do {
            System.out.println("""
                              ----Menu metodo----
                              1.Acelerar
                              2.Frenar
                              3.Velocidad actual
                              4.Salir
                              """);
                              
             option = pedirOpcion();
            
            switch(option) {
                case '1':
                    perro1.hacerSonido();
                    break; 
                case '2':
                    gato1.hacerSonido();
                    break;        
                case '3':
                    System.out.println("Saliendo del menu de la cuenta...");
                    break;                    
                default:
                    System.out.println("Opcion no valida.");
                    break;
            }
            
        } while (option != '3'); 
    }
 }
