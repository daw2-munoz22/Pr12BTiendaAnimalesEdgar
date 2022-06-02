package com.mycompany.pr12tiendaanimalesedgar;

public class Gos extends Animal {
  public String raza;

  public Gos(int edad, float peso, String raza){
    super(edad, peso);
    this.raza = raza;
  }

  public String getRaza(){
    return this.raza;
  }

  public String verAnimales(){
    return super.verAnimales() + "raza" + raza;
  }
}