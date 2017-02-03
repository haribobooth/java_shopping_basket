package models;

import java.util.ArrayList;
import behaviours.*;

public class Basket implements Basketable {
  private ArrayList<Itemable> items;

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

}
