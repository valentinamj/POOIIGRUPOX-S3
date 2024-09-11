/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package geometrica;

/**
 *
 * @author Lileth
 */

public class Main {
    public static void main(String[] args) {
        // Objeto Punto para el centro del círculo
        Punto centroCirculo = new Punto(0, 0);
        
        // Objeto Circulo
        Circulo circulo = new Circulo("Círculo 1", centroCirculo, 5);
        
        // Círculo los detalles
        System.out.println(circulo);
        System.out.println("Área del Círculo: " + circulo.calcularArea());
        System.out.println("¿Es regular?: " + circulo.esRegular());
        
        // Vértices del cuadrilátero
        Punto vertice1 = new Punto(0, 0);
        Punto vertice2 = new Punto(0, 4);
        Punto vertice3 = new Punto(6, 4);
        Punto vertice4 = new Punto(6, 0);
    }
}