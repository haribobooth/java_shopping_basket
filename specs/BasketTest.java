import org.junit.*;
import static org.junit.Assert.*;

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


}
