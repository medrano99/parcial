/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package app.vehiculo;

import app.interfaces.Vehiculo;

/**
 *
 * @author MEDRANO
 */
public class Automovil implements Vehiculo{
    private int peaje;
    private String modelo;
    private String marca;

    public Automovil(int peaje, String modelo, String marca) {
        this.peaje = peaje;
        this.modelo = modelo;
        this.marca = marca;
    }
    
    @Override
    public void desplazar() {
       //To change body of generated methods, choose Tools | Templates.
    }

    public int getPeaje() {
        return peaje;
    }

    public void setPeaje(int peaje) {
        this.peaje = peaje;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    @Override
    public String toString() {
        return "Automovil{" + "peaje=" + peaje + ", modelo=" + modelo + ", marca=" + marca + '}';
    }
    
}
