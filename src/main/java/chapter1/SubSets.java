package chapter1;

import java.util.ArrayList;
import java.util.List;

public class SubSets {


    public  List<List<Integer>>  createAllPossibleSubsets(int [] a) {

        List<List<Integer>> result = new ArrayList<>();
        List<Integer> epmty = new ArrayList<>();

        result.add(epmty);

        for(int num: a){
            System.out.println("function called ");
            List<List<Integer>> newListOfSubstes = new ArrayList<>();
            for(List<Integer> currentList : newListOfSubstes){
                System.out.println(currentList);
                List<Integer> newSubset = new ArrayList<>(currentList);
                newSubset.add(num);
                newListOfSubstes.add(newSubset);
                System.out.println(newListOfSubstes);
            }

            for(List<Integer> toCopies: newListOfSubstes){
                result.add(toCopies);
            }


        }

        return result;
    }
}
