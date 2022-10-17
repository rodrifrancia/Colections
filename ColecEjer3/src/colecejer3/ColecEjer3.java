/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package colecejer3;

import Entidades.Alumno;
import Servicios.AlumnoService;
import java.util.ArrayList;
import java.util.Iterator;

import java.util.Scanner;

/**
 *
 * @author Rodrigo
 */
public class ColecEjer3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner input= new Scanner(System.in);
        
        
        AlumnoService ser= new AlumnoService();
        
        ser.cargarAlumnos();
        ser.mostrarAlumnos();
        
        System.out.println("Ingrese alumno a buscar: ");
        String buscar= input.next();
        ser.buscar(buscar);
    }
    
}
