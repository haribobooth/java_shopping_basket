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
}
