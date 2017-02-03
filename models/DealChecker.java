package models;

import java.util.ArrayList;
import java.util.HashMap;

import behaviours.*;

public class DealChecker implements Dealable {
  private Basketable basket;
  private ArrayList<String> itemsForBOGOF;
  private ArrayList<Itemable> itemsInBasket;
  private boolean buyOneGetOneFree;
  private boolean tenPercentOffWhenTwentyPlusTotal;
  private boolean twoPercentOffWithLoyaltyCard;
  
  public DealChecker(){
    itemsForBOGOF = new ArrayList<String>();
    itemsInBasket = new ArrayList<Itemable>();
    buyOneGetOneFree = false;
    tenPercentOffWhenTwentyPlusTotal = false;
    twoPercentOffWithLoyaltyCard = false;
  }

  public void setBOGOF(boolean buyOneGetOneFree){
    this.buyOneGetOneFree = buyOneGetOneFree;
  }

  public void addBOGOFItem(String itemName){
    itemsForBOGOF.add(itemName);
  }

  public double checkForDeals(Basketable basket){
    if(buyOneGetOneFree){
      basket.setFinalTotal(BuyOneGetOneFree(basket));
    }
    return basket.getFinalTotal();
  }

  public double BuyOneGetOneFree(Basketable basket){
    HashMap<String, Integer> itemQuantities = new HashMap<>();
    basket.calculateSubTotal();
    double finalTotal = basket.getSubTotal();
    itemsInBasket = basket.getItems();

    for(Itemable item : itemsInBasket){
      String itemName = item.getName();
      if(itemsForBOGOF.contains(itemName) && itemQuantities.containsKey(itemName)){
        itemQuantities.put(itemName, itemQuantities.get(itemName)+1);
      } else {
        itemQuantities.put(itemName, 1);
      }
    }

    for(String itemName : itemQuantities.keySet()){
      if(itemQuantities.get(itemName) % 2 != 0){
        itemQuantities.put(itemName, itemQuantities.get(itemName)-1);
      }
    }

    for(Itemable item : itemsInBasket){
      int numberOfDeductions = itemQuantities.get(item.getName()) / 2;
      double totalDeduction = item.getPrice() * numberOfDeductions;
      itemQuantities.put(item.getName(), 0);
      finalTotal -= totalDeduction;
    }

    return finalTotal;
  }
}
