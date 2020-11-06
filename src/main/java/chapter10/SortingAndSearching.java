package chapter10;

import java.util.Arrays;

public class SortingAndSearching {


    public int [] mergeSort(int [] array) {
        int [] result = new int[array.length];

        mergeSort(array, 0, array.length - 1, result);
        return result;
    }

    public int [] mergeSort(int [] array , int left , int right , int [] result) {

        if(left >= right) return result;

        int mid = (left+right) /2 ;
        mergeSort(array , 0 , mid , result);
        System.out.println(Arrays.toString(array));
        mergeSort(array , mid+1 ,right  , result);

        return merge(array , result , left, mid, right );
    }

    private int [] merge(int[] array, int[]  result, int left, int mid, int right) {

        int leftStart = left;
        int leftEnd = (left+mid)/2;
        int rightStart = mid;
        int rightEnd = right;
        int index = 0;

        while(leftStart < leftEnd && rightStart < rightEnd) {
            if( array[leftStart] > array[rightStart] ) {
                result[index++] = array[rightStart++];
            }else {
                result[index++] = array[leftStart++];
            }
        }

        while(leftStart <leftEnd){
            result[index++] = array[leftStart++];
        }
        while(rightStart < rightEnd){
            result[index++] = array[rightStart++];
        }
        return result;
    }



}
