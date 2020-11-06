import java.util.*;
import java.util.stream.*;

class FlatMapExample {

    public static void main(String ...  args) {

        int [] a = { 2, 4, 2, 5, 6, 2 , 5};

        int [] b = { 4, 23, 43, 2, 123};



        List<Integer> intListA = Arrays.stream(a)
                .boxed()
                .collect(Collectors.toList());

        List<Integer> intListB = Arrays.stream(b)
                .boxed()
                .collect(Collectors.toList());


        List<List<Integer>> listOfList = new ArrayList<>();

        listOfList.add(intListA);
        listOfList.add(intListB);

        System.out.println(listOfList);


        List<Integer> flattenedList =  listOfList.stream()
                .flatMap(list -> list.stream())
                .collect(Collectors.toList());

        System.out.println(flattenedList);



    }
}
