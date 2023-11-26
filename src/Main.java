import java.util.*;
import java.util.function.BinaryOperator;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class Main {
    public static void main(String[] args) {


//        int[] nos={10,5,7,8,1,1};
////        System.out.println(Arrays.stream(nos).sorted().skip(1).findFirst().orElseThrow(()->new IllegalArgumentException("Array doesnt have second smallest element")));
//        int ans = Arrays.stream(nos).distinct().sorted().skip(1).findFirst().orElseThrow(() -> new IllegalArgumentException("Array doesnt have second largest element "));
//        System.out.println(ans);
                //2nd smallest
                int[] nos={9,5,7,3,2,2,5,3};
                int result= Arrays.stream(nos).distinct()
                        .sorted()
                        .skip(1)
                        .findFirst()
                        .orElseThrow(()-> new IllegalArgumentException("2nd smallest doesnt exist"));
                System.out.println(result);

//        int[] arr1={1,2,3,4,5};
//        int[] arr2={4,5,6,7,8};
//        List<Integer> collect = Arrays.stream(arr1).filter(no1 -> Arrays.stream(arr2).anyMatch(no2 -> no2 == no1)).boxed().collect(Collectors.toList());
//        System.out.println(collect);
                //common elements in two arrays

                int[] arr1={1,2,3,4,5};
                int[] arr2 ={4,5,6,7,8,1};

                List<Integer> commonElements=Arrays.stream(arr1).filter(no1-> Arrays.stream(arr2).anyMatch(no2-> no2==no1))
                        .boxed().collect(Collectors.toList());
                System.out.println("CommonElements :" +commonElements);

//        //reverse array in place
//        int[] arr ={1,2,3,4,5};
//        IntStream.range(0,(arr.length/2)).forEach(
//              i->  {
//                      int temp = arr[i];
//                      arr[i]=arr[arr.length-1-i];
//                  arr[arr.length-1-i]=temp;
//
//              }
//        );
//        System.out.println(Arrays.toString(arr));
                //Reverse array in place

                int[] arr={1,2,3,4,5};

                IntStream.range(0,arr.length/2).forEach(i->{
                    int temp=arr[i];
                    arr[i]= arr[arr.length-i-1];
                    arr[arr.length-i-1]=temp;
                });

                System.out.println(Arrays.toString(arr));

//        //longest string
//        String[] strings={"Pune","Noida","chennai","Bangaluru"};
//        int max = Arrays.stream(strings).mapToInt(String::length).max().orElse(0);
//        System.out.println(max);

                //longest string
                String[] strings={"Pune","Noida","chennai","Bangaluru"};
//        int max = Arrays.stream(strings).mapToInt(s->s.length()).max().orElse(0);
                int max = Arrays.stream(strings).mapToInt(String::length).max().orElse(0);
                System.out.println(max);

//        //chars by occurence
//        String input="AdamThatha";
//        Map<String, Long> inputMap = Arrays.stream(input.split("")).
//                collect(Collectors.groupingBy(
//                        Function.identity(), Collectors.counting()
//                ));
//
//        System.out.println(inputMap);
                //occurence of characters
                String input="tomato";
                Map<String, Long> inputMap=Arrays.stream(input.split("")).collect(Collectors.groupingBy(Function.identity(),Collectors.counting()));
                System.out.println(inputMap);

                //reverse string
                String word="krsna";
                String output = Stream.of(word).map(s -> new StringBuilder(s).reverse()).collect(Collectors.joining());
                System.out.println(output);

                //palindrome check

                String given="Dad";
                String lowergiven = Stream.of(given).map(String::toLowerCase).collect(Collectors.joining());
                boolean isPalindrome = IntStream.range(0, lowergiven.length() - 1).allMatch(i -> lowergiven.charAt(i) == lowergiven.charAt(lowergiven.length() - i - 1));
                System.out.println(given +" is Palindrome :"+isPalindrome);


                //GroupBY max salary in each department
                List<Employee> empList = Stream.of(new Employee(1, "Phani", "DEV", 180000),
                        new Employee(2, "Mohan", "DEV", 150000),
                        new Employee(3, "Priya", "QA", 50000),
                        new Employee(4, "Sravani", "QA", 80000)
                ).collect(Collectors.toList());

                //group by dept
                Map<String, List<Employee>> groupByDEPT = empList.stream().collect(Collectors.groupingBy(Employee::getDept));

                //GroupBY max salary in each department
                //Comparator
                Comparator<Employee> compareBySAL = Comparator.comparing(Employee::getSal);
                System.out.println(groupByDEPT);
                Map<String, Optional<Employee>> groupByMaxSaldeptwise = empList.stream().collect(Collectors.groupingBy(Employee::getDept, Collectors.reducing(BinaryOperator.maxBy(compareBySAL))));
                System.out.println(groupByMaxSaldeptwise);


        //List<String> words = Arrays.asList("apple", "banana", "orange", "kiwi", "pear");
        //Output: {5=1, 6=2, 4=2}

        /*List<String> words = Arrays.asList("apple", "banana", "orange", "kiwi", "pear");
        Map<Integer, Long> collect = words.stream().collect(Collectors.groupingBy(String::length, Collectors.counting()));


        System.out.println(collect);*/

        /*import java.util.Arrays;

public class CodingTest {

    public static void main(String[] args) {
        int[] arr = {2, 5, 7, 9, 4};
        int target = 13;
        int[] ints = myFunction(arr, target);
        System.out.println(Arrays.toString(ints));
    }

    public static int[] myFunction(int[] arr, int target) {
        int[] arr1=new int[2];
        for (int i = 0; i < arr.length; i++) { //0,1,2,3,4
            for (int j = 1; j < arr.length - 1; j++) {//1,2,3,4  //0,1 0,2 0,3 ...1,1 ...1,2 ..4,4
                if (arr[i] + arr[j] == target) {
                    arr1[0]=i;
                    arr1[1]=j;

                }
            }
        }
        return arr1;
    }
}*/

        /*
        List<String> names=new ArrayList<>();
        names= Arrays.asList("Singh", "Mohan", "manas", "Adam");
        names.stream().filter(s->s.contains("S")|| s.contains("s")).collect(Collectors.toList()).forEach(System.out::println);

        names.stream().map(s->new StringBuilder(s).reverse()).forEach(System.out::println);
        */

            }
        }


