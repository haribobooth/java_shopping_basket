package models;

import java.util.ArrayList;
import behaviours.*;

public class Basket implements Basketable {
  private ArrayList<Itemable> items;
  private double finalTotal;

  public Basket(){
    items = new ArrayList<Itemable>();
  }

  public int itemCount(){
    return items.size();
  }

  public void addItem(Itemable item){
    items.add(item);
  }

  public void removeItem(Itemable item){
    items.remove(item);
  }

  public void empty(){
    items.clear();
  }

  public ArrayList<Itemable> getItems(){
    return items;
  }

  public double calculateTotal(){
    double total = 0.00;
    for(Itemable item : items){
      total += item.getPrice();
    }
    return total;
  }

  public void setFinalTotal(double newFinalTotal){
    this.finalTotal = newFinalTotal;
  }

  public double getFinalTotal(){
    return finalTotal;
  }

}
