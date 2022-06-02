package com.mycompany.pr12tiendaanimalesedgar;

public abstract class Animal{
  private int edad;
  private float peso;

  public Animal(int edad, float peso){
    this.peso = peso;
    this.edad = edad;
  }

  public int getEdad(){
    return this.edad;
  }
  
  public float getPeso(){
    return this.peso;
  }

  public String verAnimales(){
    return Integer.toString(edad) + "edad "+ Float.toString(peso) + "kg";
  }
}