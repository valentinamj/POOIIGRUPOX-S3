/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package geometrica;

/**
 *
 * @author Lileth
 */
public class Circulo extends FiguraGeometrica {
    private Punto centro;
    private int radio;

    // Constructor
    public Circulo(String name, Punto centro, int radio) {
        super(name);
        this.centro = centro;
        this.radio = radio;
    }

    // Método calcularArea
    @Override
    public double calcularArea() {
        return Math.PI * Math.pow(radio, 2);
    }

    // Método esRegular
    @Override
    public boolean esRegular() {
        return true; 
    }

    // ToString para devolver el nombre de la figura, su centro y su radio
    @Override
    public String toString() {
        return "Circulo: " + super.getName() + ", Centro: " + centro.toString() + ", Radio: " + radio;
    }

    // Getters y Setters
    public Punto getCentro() {
        return centro;
    }

    public void setCentro(Punto centro) {
        this.centro = centro;
    }

    public int getRadio() {
        return radio;
    }

    public void setRadio(int radio) {
        this.radio = radio;
    }
}

    

