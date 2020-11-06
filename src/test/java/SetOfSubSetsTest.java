import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import java.util.*;
import java.util.stream.Collectors;


import static org.junit.jupiter.api.Assertions.*;

class SetOfSubSetsTest {

    SetOfSubSets setO ;

    @BeforeEach
    public void init (){

        setO = new SetOfSubSets();
    }

    @Test
    void getAllSubSets() {


        int [] a = {1,2,3};

        int [][] result = {{}, {1}, {1,2}, {1,2,3}, {2}, {3}};


        ArrayList<Integer> set = (ArrayList<Integer>) Arrays.stream(a).boxed().collect(Collectors.toList());

       List<ArrayList<Integer>> resultList =  setO.getAllSubSets(set, 0);
        int index = 0;
       for( ArrayList<Integer> arr: resultList){

           System.out.print(arr + " ");
       }

        //assertLinesMatch(list, );
    }
}