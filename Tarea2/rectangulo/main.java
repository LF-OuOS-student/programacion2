package com.mycompany.rectangulo;
public class main {

    public static void main(String[] args) {
        int base = 2;
        int altura = 4;
        Rectangulo rectangulo1 = new Rectangulo(base,altura);
        int area = rectangulo1.calcularArea();
        int perimetro = rectangulo1.calcularPerimetro();
        System.out.println("La area es de:" + area);
        System.out.println("El perimetro es de:" + perimetro);
    }
}
