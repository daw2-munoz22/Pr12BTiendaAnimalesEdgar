/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.pr12tiendaanimalesedgar;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author Jupiter
 */
public class Pr12TiendaAnimalesEdgar {

    
    
    public static void main(String[] args) {
  
        ArrayList<Animal> animales = new ArrayList<Animal>();        
        
        int gosLimites=0;
    
        int ocellLimites=0;
    
        int peixLimites=0;
        try(Scanner sc = new Scanner(System.in)){
          
            int eleccion = 0;
          
            while(eleccion != 5){            
                System.out.println();            
                System.out.println("1-Gos");            
                System.out.println("2-Ocell");            
                System.out.println("3-Peix");            
                System.out.println("4-Visualizar lista de animales");            
                System.out.println("5-Salir de la lista de animales");            
                System.out.println("Inserte una opcion: ");            
                eleccion= sc.nextInt();          
                int edad = 0;            
                float peso = 0.0f;

                if(eleccion != 4 && eleccion != 5){
                  System.out.println("Dame la edad");
                  edad = sc.nextInt();

                  System.out.println("Dame el peso");
                  peso = sc.nextFloat();
                }

                switch(eleccion){
                  case 1: 
                    if(gosLimites < 5){
                      System.out.println("Dame la raza");
                      String raza = sc.next();

                      animales.add(new Gos(edad, peso, raza));
                      gosLimites++;
                    }else{
                      System.out.println("Se ha superado el limite de perros");
                    }
                  break;
                  case 2:
                    if(ocellLimites < 5){
                      System.out.println("Dame la especie");
                      String especie = sc.next();

                      animales.add(new Ocell(edad, peso, especie));
                      ocellLimites++;
                    }else{
                      System.out.println("Se he superado el limite de pajaros");
                    }
                  break;
                  case 3:
                    if(peixLimites < 5){
                      System.out.println("Es dulce o salado (false o true)");
                      boolean aguaDulce = sc.nextBoolean();

                      animales.add(new Peix(edad, peso, aguaDulce));
                      peixLimites++;
                    }else{
                      System.out.println("Se he superado el limite de pajaros");
                    }
                  break;
                  case 4:
                    for(Animal animal : animales){
                      System.out.println(animal.verAnimales());
                    }
                  break;
                  case 5:
                    System.out.println("Has salido del programa");
                  break;
                  default:
                    System.out.println("Animal invalido");
                  break;
                }
            }      
        }                        
    }
}