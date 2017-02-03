package behaviours;

import java.util.ArrayList;

public interface Basketable {
  public int itemCount();
  public void addItem(Itemable item);
  public void removeItem(Itemable item);
  public void empty();
  public ArrayList<Itemable> getItems();
  public void calculateSubTotal();
  public double getSubTotal();
  public void setFinalTotal(double newFinalTotal);
  public double getFinalTotal();
  public void checkDeals(Dealable dealChecker);
}
