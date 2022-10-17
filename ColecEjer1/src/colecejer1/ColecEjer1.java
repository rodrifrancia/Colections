/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package colecejer1;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

/**
 *
 * @author Rodrigo
 */
public class ColecEjer1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        ColecEjer1 clase= new ColecEjer1();
        Scanner input= new Scanner(System.in);
        ArrayList <String> lista= new ArrayList<>();
        String resp= "n";
        do{
            System.out.println("Ingrese raza de perro: ");
            lista.add(input.next());
            System.out.println("Desea salir? S/N");
            resp= input.next();
        }while(resp.equalsIgnoreCase("n"));
        clase.imprimirLista(lista);
        
        System.out.println("Ingrese perro: ");
        String perro= input.next();
        Iterator iterador = lista.iterator();
        
        while(iterador.hasNext()){
        if(iterador.next().equals(perro)){
        iterador.remove();
        }
        }
        clase.imprimirLista(lista);
        
    }
    public void imprimirLista(ArrayList <String>lista){
        for (String aux: lista){
            System.out.println("Raza: "+aux);
        }
        }
}
