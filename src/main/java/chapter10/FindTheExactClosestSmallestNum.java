package chapter10;

import java.util.Collections;
import java.util.List;

public class FindTheExactClosestSmallestNum {

    public int findTheClosestSmallestElement(List<Integer> stream , int key){
        Collections.sort(stream);
        int result = applyBinarySearch(stream, key);
        return stream.get(result);
    }


    private int applyBinarySearch(List<Integer> stream , int key) {

          int start = 0;
          int end = stream.size() -1;
          int index = -1;
          while(start <= end){
              int mid = start + end >> 1;
              if(stream.get(mid) > key){
                  end = mid -1;
              }
              else {
                  index = mid;
                  start = mid+1;
              }
          }

        return index;
    }

    public   int findTheExactGreaterAmount(List<Integer> nums, int key){

        /**
         *
         *  2, 4,6,  7,  8,9 , 11
         * */

        Collections.sort(nums);
        System.out.println(nums);
        int start = 0;
        int end = nums.size() -1;
        int index = -1;
        while(start <= end) {
            int mid = start + end >> 1;
            if(nums.get(mid) < key){
                start = mid +1;
            }
            else {
                index = mid;
                end = mid -1;
            }

        }
        return  index;
    }
}
