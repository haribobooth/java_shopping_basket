import org.junit.*;
import static org.junit.Assert.*;

import models.*;
import behaviours.*;

public class ItemTest {

  Itemable item;

  @Before
  public void before(){
    item = new Item("Beer", 10.99);
  }

  @Test
  public void canGetItemPrice(){
    assertEquals(10.99, item.getPrice(), 0.01);
  }

  @Test
  public void canGetItemName(){
    assertEquals("Beer", item.getName());
  }

}
