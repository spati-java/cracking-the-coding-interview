package chapter10;

public class MergeSortExample {

    public static  void main(String[] args){

        int [] arr = {5,3,2,4,1,8,1,1,1,3,4,5};

        System.out.println("Before sorting");
        printArray(arr);

        System.out.println(" ");
        int [] resultAr = mergerSort(arr);
        System.out.println("After sorting");
        printArray(resultAr);
    }

    private static void printArray(int[] arr) {

        for(int num : arr)
            System.out.print(num + " ");
    }

    public static int [] mergerSort(int [] arr){
        return splitArrAndMerge(arr);
    }

    public static int [] splitArrAndMerge(int [] arr) {


        if(arr.length == 1)
            return arr;


        int  midpoint = arr.length/2;

        int [] leftA =  new int [midpoint];
        int [] rightA ;

        if(arr.length % 2 == 0) {
            rightA = new int[midpoint];
        } else
            rightA = new int[midpoint+1];


        for(int i = 0; i < midpoint; i++) {
            leftA[i] = arr[i];
        }

        for(int i = 0; i < rightA.length; i++) {
            rightA[i] = arr[ midpoint+i];
        }

        leftA = splitArrAndMerge(leftA);
        rightA = splitArrAndMerge(rightA);


        int [] result =   merge(leftA, rightA);

        return result;

    }

    public static int [] merge(int [] leftA, int [] rightA ){

        int [] result = new int [leftA.length + rightA.length];
        int leftIndex = 0;
        int rightIndex = 0;
        int resultIndex = 0;

        while(leftIndex < leftA.length || rightIndex < rightA.length) {

            if(leftIndex < leftA.length && rightIndex < rightA.length) {

                if(leftA[leftIndex] > rightA[rightIndex]) {
                    result[resultIndex++] =  rightA[rightIndex++];
                }else {
                    result[resultIndex++]  = (leftA[leftIndex++]);
                }
            }
            else if(leftIndex < leftA.length) {
                result[resultIndex++]  = (leftA[leftIndex++]);
            }else {
                result[resultIndex++] =  rightA[rightIndex++];
            }

        }

        return result;

    }

}
