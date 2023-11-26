import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.OptionalInt;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class PracticeJava8 {

    public static void main(String[] args) {

        List<Integer> numbers= Arrays.asList(2,5,3,4,7,9,1);
        Collections.sort(numbers);
        Collections.reverse(numbers);
        System.out.println(numbers);
//        numbers.stream().filter(i->i%2==0).forEach(System.out::println);
        List<Integer> collect = numbers.stream().filter(i -> i % 2 == 0).collect(Collectors.toList());
//        System.out.println(collect);

        List<Integer> collect2 = numbers.stream().sorted().collect(Collectors.toList());
//        System.out.println(collect2);


        int[] arr={2,5,3,4,7,9,1};

        int[] arr1={1};
//        Arrays.stream(arr).filter(i->i%2!=0).forEach(System.out::print);
        String collect1 = Arrays.stream(arr).filter(i -> i % 2 != 0)
                .mapToObj(Integer::toString)
                .collect(Collectors.joining(" "));
//        System.out.println(collect1);

        long count = Arrays.stream(arr).filter(i -> i % 2 == 0).count();
//        System.out.println(count);
        int sum = Arrays.stream(arr).filter(i -> i % 2 == 0).sum();
//        System.out.println(sum);
        int i = Arrays.stream(arr).min().orElse(-1);
//        System.out.println(i);
        /*int i1 = Arrays.stream(arr1).sorted()
                .distinct()
                .skip(2)
                .findFirst()
                .orElseThrow(() -> new IllegalArgumentException("2nd smallest doesn't exist "));
        System.out.println(i1);*/

        /*int i1 = Arrays.stream(arr).sorted()
                .distinct()
                .skip(arr.length-2)
                .findFirst()
                .orElseThrow(() -> new IllegalArgumentException("2nd largest doesn't exist "));
        System.out.println(i1);*/

      /*  int[] array = Arrays.stream(arr).sorted().toArray();
        System.out.println(Arrays.toString(array));*/

Integer[] nums={1,5,3,8,6};
Arrays.sort(nums, Collections.reverseOrder());
//        System.out.println(Arrays.toString(nums));


    }
}
