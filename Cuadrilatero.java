/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package geometrica;

/**
 *
 * @author Lileth
 */
public abstract class Cuadrilatero extends FiguraGeometrica {
    private String nombre;
    private Punto vertice1, vertice2, vertice3, vertice4;


    public Cuadrilatero(String nombre, Punto vertice1, Punto vertice2, Punto vertice3, Punto vertice4) {
        super(nombre); 
        this.vertice1 = vertice1;
        this.vertice2 = vertice2;
        this.vertice3 = vertice3;
        this.vertice4 = vertice4;
    }

    // Llamar desde el método esRegular
    @Override
    public boolean esRegular() {
        return checkRectangulo(); 
    }

    // Método privado 
    private boolean checkRectangulo() {
       
        return true;
    }

    @Override
    public String toString() {
        return "Cuadrilatero: " + super.getName() + ", Vertices: [" + vertice1 + ", " + vertice2 + ", " + vertice3 + ", " + vertice4 + "]";
    }

    // Métodos de acceso (Getters y Setters)
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String name) {
        this.nombre = nombre;
    }

    public Punto getVertice1() {
        return vertice1;
    }

    public void setVertice1(Punto vertice1) {
        this.vertice1 = vertice1;
    }

    public Punto getVertice2() {
        return vertice2;
    }

    public void setVertice2(Punto vertice2) {
        this.vertice2 = vertice2;
    }

    public Punto getVertice3() {
        return vertice3;
    }

    public void setVertice3(Punto vertice3) {
        this.vertice3 = vertice3;
    }

    public Punto getVertice4() {
        return vertice4;
    }

    public void setVertice4(Punto vertice4) {
        this.vertice4 = vertice4;
    }
}