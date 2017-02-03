import org.junit.*;
import static org.junit.Assert.*;

import models.*;
import behaviours.*;

public class DealCheckerTest {

  Dealable dealChecker;
  Basketable basket;
  Itemable itemBeer;
  Itemable itemCrips;
  Itemable itemWater;

  @Before
  public void before(){
    dealChecker = new DealChecker();
    basket = new Basket();
    itemBeer = new Item("Beer", 10.99);
    itemCrips = new Item("Crisps", 5.99);
    itemWater = new Item("Water", 1.99);
  }

  @Test
  public void canPerformBOGOF(){
    dealChecker.setBOGOF(true);
    dealChecker.addBOGOFItem("Beer");

    basket.addItem(itemBeer);
    basket.addItem(itemBeer);
    basket.addItem(itemBeer);

    basket.checkDeals(dealChecker);
    assertEquals(21.98, basket.getFinalTotal(), 0.01);
  }

  @Test
  public void canPerform10PercentOff(){

  }

  @Test
  public void canPerform2PercentOff(){

  }

  @Test
  public void performsDealsInRightOrder(){
    
  }


}
