/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package colecejer5;

import Servicios.PaisesService;

/**
 *
 * @author Rodrigo
 */
public class ColecEjer5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        PaisesService ser= new PaisesService();
        ser.cargarPaises();
    }
    
}
