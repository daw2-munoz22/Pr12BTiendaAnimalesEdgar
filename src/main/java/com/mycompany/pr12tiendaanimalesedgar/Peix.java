package com.mycompany.pr12tiendaanimalesedgar;

public class Peix extends Animal {
  private boolean aguaDulce;
    
  public Peix(int edad, float peso, boolean aguaDulce){
    super(edad, peso);
    this.aguaDulce = aguaDulce;
  }

  public boolean aguaDulce(){
    return this.aguaDulce;
  }

  public String verAnimales(){
    return super.verAnimales() + "agua" + aguaDulce;
  }
}