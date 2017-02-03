package models;

import java.util.ArrayList;
import behaviours.*;

public class Basket implements Basketable {
  private ArrayList<Itemable> items;
  private double finalTotal;
  private double subTotal;

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

  public void calculateSubTotal(){
    double total = 0.00;
    for(int i = 0; i < itemCount(); i++){
      // Itemable item = items.get(i);
      total += items.get(i).getPrice();
    }
    subTotal = total;
  }

  public double getSubTotal(){
    return subTotal;
  }

  public void setFinalTotal(double newFinalTotal){
    this.finalTotal = newFinalTotal;
  }

  public double getFinalTotal(){
    return finalTotal;
  }

  public void checkDeals(Dealable dealChecker){
    finalTotal = dealChecker.checkForDeals(this);
  }

}
