package models;

import behaviours.*;

public class Item implements Basketable {
  private String name;
  private double price;

  public Item(String name, double price){
    this.name = name;
    this.price = price;
  }

  public double getPrice(){
    return price;
  }

  public String getName(){
    return name;
  }

}
