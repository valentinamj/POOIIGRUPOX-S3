/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package geometrica;

/**
 *
 * @author Lileth
 */
public abstract class FiguraGeometrica {
    private String name;

 
    public FiguraGeometrica(String name) {
        this.name = name;
    }

    // Getter y Setter 
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    // Métodos
    public abstract double calcularArea();
    public abstract boolean esRegular();

    @Override
    public String toString() {
        return "FiguraGeometrica: " + name;
    }
}