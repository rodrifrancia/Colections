/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package colecejer4;

import Entidades.Pelicula;
import Servicios.PeliculaService;
import Utilities.Comparators;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

/**
 *
 * @author Rodrigo
 */
public class ColecEjer4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        PeliculaService ser= new PeliculaService();
        ArrayList<Pelicula> pelis = ser.devolver();
        ser.cargarPelicula(pelis);
        ser.mostrarPeliculas(pelis);
        ser.peliculasLargas(pelis);
        
        System.out.println("");
        System.out.println("Ordenadas por duracion ascendente \n");
        Collections.sort(pelis, Comparators.ordenarPorDuracAsc);
        ser.mostrarPeliculas(pelis);
        System.out.println("");
        System.out.println("Ordenadas por duracion descendente \n");
        Collections.sort(pelis, Comparators.ordenarPorDuracDesc);
        ser.mostrarPeliculas(pelis);
        System.out.println("");
        System.out.println("Ordenadas por titulo \n");
        Collections.sort(pelis, Comparators.ordenarPorTit);
        ser.mostrarPeliculas(pelis);
        System.out.println("");
        System.out.println("Ordenadas por director \n");
        Collections.sort(pelis, Comparators.ordenarPorDirec);
        ser.mostrarPeliculas(pelis);
    }
    
}
