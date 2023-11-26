import java.util.Arrays;
import java.util.Collections;
import java.util.stream.Collectors;

public class ArraysJava8 {
    public static void main(String[] args) {
        int[] arr={2,4,5,7,6,9,1,8};
//        Arrays.stream(arr).filter(i->i%2==0).forEach(System.out::println);
//        Arrays.stream(arr).filter(i->i%2==0).forEach(System.out::print);
        /*int[] array = Arrays.stream(arr).filter(i -> i % 2 == 0).toArray();
        System.out.println(Arrays.toString(array));*/
      /*  String collect = Arrays.stream(arr).filter(i -> i % 2 == 0)
                .mapToObj(Integer::toString)
                .collect(Collectors.joining(" "));
        System.out.println(collect);*/
        /*long count = Arrays.stream(arr).filter(i -> i % 2 == 0).count();
        System.out.println(count);*/
       /* int sum = Arrays.stream(arr).filter(i -> i % 2 == 0).sum();
        System.out.println(sum);*/
       /* int[] array = Arrays.stream(arr).sorted().toArray();
        System.out.println(Arrays.toString(array));*/

       /* Integer[] arr1={2,4,5,7,6,9,1,8};
        Arrays.sort(arr1,Collections.reverseOrder());
        System.out.println(Arrays.toString(arr1));*/

       /* int result = Arrays.stream(arr).sorted()
                .distinct()
                .skip(1)
                .findFirst()
                .orElseThrow(() -> new IllegalArgumentException("2nd smallest element doesn't exist "));
        System.out.println(result);*/

        /*int answer = Arrays.stream(arr).sorted().distinct().skip(arr.length - 2).findFirst().orElseThrow(() -> new IllegalArgumentException("2nd largest element doesn't exist"));
        System.out.println(answer);*/

    }
}
