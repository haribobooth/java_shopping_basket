import org.junit.*;
import static org.junit.Assert.*;

import java.util.ArrayList;

import models.*;
import behaviours.*;

public class BasketTest {

  Itemable item;
  Basketable basket;

  @Before
  public void before(){
    item = new Item("Beer", 10.00);
    basket = new Basket();
  }

  @Test
  public void startsEmpty(){
    assertEquals(0, basket.itemCount());
  }

  @Test
  public void canAddItem(){
    basket.addItem(item);
    assertEquals(1, basket.itemCount());
  }

  @Test
  public void canRemoveItem(){
    basket.addItem(item);
    basket.removeItem(item);
    assertEquals(0, basket.itemCount());
  }

  @Test
  public void canEmptyBasket(){
    basket.addItem(item);
    basket.addItem(item);
    assertEquals(2, basket.itemCount());
    basket.empty();
    assertEquals(0, basket.itemCount());
  }

  @Test
  public void canGetItems(){
    basket.addItem(item);
    ArrayList<Itemable> returnedItems = basket.getItems();
    Item returnedItem = (Item) returnedItems.get(0);
    assertEquals("Beer", returnedItem.getName());
  }

  @Test
  public void canCalculateTotal(){
    basket.addItem(item);
    assertEquals(10.00, basket.calculateTotal(), 0.01);
  }

}
