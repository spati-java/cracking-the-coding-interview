package chapter8;

import java.util.ArrayList;
import java.util.List;

public class PowerOfSet {


    public static void main(String[] args) {

        int [] nums = {1,2};
        getAllSubsets(nums);

        int [] nums1 = {1,2};


    }



    public  static  List<List<Integer>> getAllSubsets(int [] nums ){

        List<List<Integer>> result = new ArrayList<>();

        List<Integer> zeroList = new ArrayList();
        result.add(zeroList);

        if(nums == null || nums.length == 0)
            return result;

        for(int num: nums){

            List<List<Integer>> newSubsets = new ArrayList<>();
            System.out.println("Iteration for " + num);
            for(List<Integer> current: result){
                List<Integer> newSubset = new ArrayList<>();
                System.out.println("new Subset before copy ");
                System.out.println(newSubset);
                newSubset.addAll(current);
                System.out.println("new Subset after copied ");
                System.out.println(newSubset);
                newSubset.add(num);
                System.out.println("new Subset after adding the new element ");
                System.out.println(newSubset);
                newSubsets.add(newSubset);

                System.out.println("new power set after");
                System.out.println(newSubsets);

            }


            // copy back to the result
            for(List<Integer> current: newSubsets){
                result.add(current);
            }
            System.out.println("Copied back to result Now result is ");
            System.out.println(result);
        }

        return result;

    }

}
