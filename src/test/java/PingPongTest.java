import org.junit.*;
import static org.junit.Assert.*;

import java.util.ArrayList;

public class PingPongTest {

  @Test
  public void replaceNumbers_ifFunctionPassesTrueAndPrintsNumberList(){
    PingPong PingPongTest = new PingPong();
    ArrayList<Object> finalList = new ArrayList<Object>();
    finalList.add(1);
    finalList.add(2);
    finalList.add("ping");
    assertEquals(finalList, PingPongTest.replaceNumbers(3));
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
