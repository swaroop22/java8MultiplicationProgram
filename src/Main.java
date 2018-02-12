import java.util.ArrayList;
import java.util.List;
import java.util.OptionalDouble;
import java.util.stream.Collectors;


public class Main {

    public static void main(String[] args) {

      ArrayList<Integer> p =  new ArrayList<>();
      p.add(1);
      p.add(10);
      p.add(2);
      p.add(9);
      p.add(5);
      System.out.println("arraylsit"+p);

      OptionalDouble c = p.stream().mapToInt(i -> i*8).average();
      System.out.println("streams"+c);
        System.out.println("Hello World!");
    }
}
