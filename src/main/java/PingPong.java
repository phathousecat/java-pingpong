import java.util.ArrayList;

public class PingPong {
  public static void main(String[] args) {}

    public static ArrayList makeList(Integer countTo){
      ArrayList<Integer> list = new ArrayList<Integer>();{
        for(Integer i=1; i<=2; i++){
          list.add(i);
        }
        return list;
      }
    }

    public Boolean isFifteen(Integer numbers) {
      return numbers % 15 == 0;
    }

    public Boolean isFive(Integer numbers) {
      return numbers % 5 == 0;
    }

    public Boolean isThree(Integer numbers) {
      return numbers % 3 == 0;
    }
}
