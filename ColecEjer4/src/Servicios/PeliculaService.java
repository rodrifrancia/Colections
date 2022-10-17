/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Servicios;

import Entidades.Pelicula;
import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author Rodrigo
 */
public class PeliculaService {
      Scanner input= new Scanner(System.in).useDelimiter("\n") ;
      
      public ArrayList<Pelicula> devolver(){
      ArrayList <Pelicula> pelis= new ArrayList();
      return pelis;
      }
      public Pelicula crearPelicula(){
         Pelicula peli= new Pelicula();
          System.out.println("Ingrese titulo: ");
          peli.setTitulo(input.next());
          System.out.println("Ingrese director: ");
          peli.setDirector(input.next());
          System.out.println("Ingrese duracion en horas: ");
          peli.setDuracion(input.nextInt());
      return peli;
      }
      
      public void cargarPelicula(ArrayList<Pelicula> pelis){
      String resp;
      do{
          pelis.add(crearPelicula());
          System.out.println("Desea cargar otra pelicula? s/n");
          resp= input.next();     
          
      }while(resp.equalsIgnoreCase("s"));
      }
      
      public void mostrarPeliculas(ArrayList<Pelicula> pelis){
          System.out.println("Mostramos todas las peliculas: ");
          System.out.println("");
          for (Pelicula aux : pelis) {
              System.out.println(aux);
          }
      
      }
      
      public void peliculasLargas(ArrayList<Pelicula> pelis){
          System.out.println("Peliculas con duracion mayor a 2 HORAS:");
          System.out.println("");
          for (Pelicula aux : pelis) {
              if(aux.getDuracion()>=2){
                  System.out.println(aux);
              }
          }
      }
}
