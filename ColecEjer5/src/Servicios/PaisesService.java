/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Servicios;

import Entidades.Paises;
import java.util.HashSet;
import java.util.Scanner;

/**
 *
 * @author Rodrigo
 */
public class PaisesService {
    Scanner input= new Scanner(System.in).useDelimiter("\n");
    HashSet<Paises> paises= new HashSet();
    
    public Paises crearPais(){
       Paises pais= new Paises();
         System.out.println("Ingrese nombre: ");
         pais.setNombre(input.next());
         System.out.println("Ingrese continente: ");
         pais.setContinente(input.next());
         System.out.println("Ingrese poblacion: ");
         pais.setPoblacion(input.nextInt());
    
    return pais;
    }
    
    public void cargarPaises(){
       String resp;
       
       do{
           System.out.println("***Carga de paises***");
           paises.add(crearPais());
           System.out.println("Desea cargar otro pais? s/salir");
           resp= input.next();
           if(resp.equalsIgnoreCase("salir")){
           mostrarPaises();
           }
       }while(resp.equalsIgnoreCase("s"));
    
    }
    
    public void mostrarPaises(){
        for (Paises aux : paises) {
            System.out.println(aux);
        }
    }
    
}
