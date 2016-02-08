import org.junit.*;
import static org.junit.Assert.*;

import java.util.ArrayList;

public class PingPongTest {

  @Test
  public void makeList_returnsAListOfNumbers(){
    PingPong PingPongTest = new PingPong();
    ArrayList<Integer> list = new ArrayList<Integer>();
    list.add(1);
    list.add(2);
    assertEquals(list, PingPongTest.makeList(2));
  }

  @Test
  public void isFifteen_forNumbersDivisibleByFifteen_true(){
    PingPong PingPongTest = new PingPong();
    assertEquals(true, PingPongTest.isFifteen(15));
  }

  @Test
  public void isFive_forNumbersDivisibleByFive_true(){
    PingPong PingPongTest = new PingPong();
    assertEquals(true, PingPongTest.isFive(5));
  }

  @Test
  public void isThree_forNumbersDivisibleByThree_true(){
    PingPong PingPongTest = new PingPong();
    assertEquals(true, PingPongTest.isThree(3));
  }
}
