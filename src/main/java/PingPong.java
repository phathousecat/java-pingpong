import java.util.ArrayList;

public class PingPong {
  public static void main(String[] args) {}

    public ArrayList replaceNumbers(Integer userNumber){
      ArrayList<Object> finalList = new ArrayList<Object>();{
        for(Integer i=1; i <= userNumber; i++){
          if (isFifteen(i)){
            finalList.add("pingpong");
          } else if (isThree(i)){
            finalList.add("ping");
          } else if (isFive(i)){
            finalList.add("pong");
          } else {
            finalList.add(i);
          }
        }
        return finalList;
      }
    }

    public Boolean isFifteen(Integer numbers) {
      return numbers % 15 == 0;
    }

    public Boolean isFive(Integer numbers) {
      return numbers % 5 == 0;
    }

    public Boolean isThree(Integer numbers) {
      if (numbers % 3 == 0) {
        return true;
      } else {
        return false;
      }
    }
  }
