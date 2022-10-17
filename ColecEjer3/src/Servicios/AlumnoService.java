/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Servicios;

import Entidades.Alumno;
import java.util.ArrayList;
import java.util.Iterator;

import java.util.Scanner;

/**
 *
 * @author Rodrigo
 */
public class AlumnoService {
      Scanner input= new Scanner(System.in);
      
      
      
        
            
        
        
        ArrayList<Alumno> alumnosList= new ArrayList();
        
          
         public Alumno crearAlumno() {
             Alumno alumno= new Alumno();
             boolean compr= true;
             String resp;
      
            System.out.println("Ingrese nombre de alumno: ");
            alumno.setNombre(input.next());
            ArrayList<Integer> notas = new ArrayList();
            for (int i = 0; i < 3; i++) {
                System.out.println("Ingrese nota " + (i + 1) + " : ");
                int nota = input.nextInt();
                
                notas.add(nota);
            }
            alumno.setNotas(notas);
            return alumno;
    }
       
         public void cargarAlumnos(){
         String resp;
         boolean seguir=true;
         do{
             alumnosList.add(crearAlumno());
             System.out.println("Desea ingresar otro alumno?");
             resp= input.next();
         
         }while(seguir==true && resp.equalsIgnoreCase("s"));
         }
         
         
         
         public void mostrarAlumnos(){
         for (Alumno aux: alumnosList) {
             System.out.println(aux);
        }
         }
         
    
        
        public void buscar(String buscar){
            int suma=0;
            
            for (Alumno alumno: alumnosList){
            if(alumno.getNombre().equalsIgnoreCase(buscar)){
                for(Integer nota : alumno.getNotas()){
                    suma+=nota;
                }
            }
        }
            System.out.println(suma);
            System.out.println("El promedio de notas de: "+buscar+" es: "+suma/3);
        }
     
}
