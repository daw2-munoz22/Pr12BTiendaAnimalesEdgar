package com.mycompany.pr12tiendaanimalesedgar;
        
public class Ocell extends Animal{
  public String especie;

  public Ocell (int edad, float peso, String especie){
    super(edad, peso);
    this.especie = especie;
  }

  public String getEspecie(){
    return this.especie;
  }

  public String verAnimales(){
    return super.verAnimales() + "especie" + especie;
  }
}