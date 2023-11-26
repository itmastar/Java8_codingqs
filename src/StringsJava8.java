import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StringsJava8 {
    public static void main(String[] args) {

       /* String[] fruits={"Apple","Apricot","Banana","WaterMelon","Gauva"};
        Arrays.stream(fruits).filter(s->s.length()==5).forEach(System.out::println);

        List<StringBuilder> reverse = Arrays.stream(fruits).map(s -> new StringBuilder(s).reverse()).collect(Collectors.toList());
System.out.println(reverse);*/
        /*String fruit="Gauva";
        String fruitReverse = Stream.of(fruit).map(s -> new StringBuilder(s).reverse()).collect(Collectors.joining());
        System.out.println(fruitReverse);

        //palindromecheck
        if(fruit.equalsIgnoreCase(fruitReverse)){
            System.out.println(fruit +" is palindrome");
        }
        else{
            System.out.println(fruit + " is not palindrome");
        }*/

    }
}
