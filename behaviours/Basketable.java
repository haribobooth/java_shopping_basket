package behaviours;

import java.util.ArrayList;

public interface Basketable {
  public int itemCount();
  public void addItem(Itemable item);
  public void removeItem(Itemable item);
  public void empty();
  public ArrayList<Itemable> getItems();
  public double calculateTotal();
}
