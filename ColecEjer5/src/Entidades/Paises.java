/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Entidades;

/**
 *
 * @author Rodrigo
 */
public class Paises {
    
    private String nombre;
    private String continente;
    private int poblacion;

    public Paises() {
    }

    public Paises(String nombre, String continente, int poblacion) {
        this.nombre = nombre;
        this.continente = continente;
        this.poblacion = poblacion;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getContinente() {
        return continente;
    }

    public void setContinente(String continente) {
        this.continente = continente;
    }

    public int getPoblacion() {
        return poblacion;
    }

    public void setPoblacion(int poblacion) {
        this.poblacion = poblacion;
    }

    @Override
    public String toString() {
        return "Paises{" + "nombre=" + nombre + ", continente=" + continente + ", poblacion=" + poblacion + '}';
    }
    
    
}
