package chapter10;

public class BinarySearchAlgo {

    public int getIndex(int [] ar , int target){

        int start = 0;
        int end = ar.length -1;

        while(start <= end) {

            int mid = (start+end) /2 ;

            if(ar[mid] == target) return mid;

            else if(ar[mid] > target) {
                end = mid-1;
            }
            else {
                start = mid+1;
            }
        }

        return -1;
    }


}
