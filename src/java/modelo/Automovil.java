/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo;

/**
 *
 * @author IRINA
 */
public class Automovil {
    private String placa;
    private String color;
    private String modelo;
    private Persona dueño;

    public Automovil(String placa, String color, String modelo, Persona dueño) {
        this.placa = placa;
        this.color = color;
        this.modelo = modelo;
        this.dueño = dueño;
    }

    
    public String getPlaca() {
        return placa;
    }

    public void setPlaca(String placa) {
        this.placa = placa;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public Persona getDueño() {
        return dueño;
    }

    public void setDueño(Persona dueño) {
        this.dueño = dueño;
    }

    
    
}
