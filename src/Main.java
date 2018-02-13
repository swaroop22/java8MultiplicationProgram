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
        
        List<String> alphaUpper = new ArrayList<>();
        for (String s : alpha) {
            alphaUpper.add(s.toUpperCase());
        }

        System.out.println(alpha); //[a, b, c, d]
        System.out.println(alphaUpper); //[A, B, C, D]

        // Java 8
        List<String> collect = alpha.stream().map(String::toUpperCase).collect(Collectors.toList());
        System.out.println(collect); //[A, B, C, D]

        // Extra, streams apply to any data type.
        List<Integer> num = Arrays.asList(1,2,3,4,5);
        List<Integer> collect1 = num.stream().map(n -> n * 2).collect(Collectors.toList());
        System.out.println(collect1); //[2, 4, 6, 8, 10]
    }
}
