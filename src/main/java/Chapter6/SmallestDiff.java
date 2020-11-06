package Chapter6;

import java.util.Arrays;

public class SmallestDiff {

    public static void main(String[] args) {

        int [] a1 = {1,3,15,11,2};
        int [] a2 = {23,127,235,19,8};

        int [] result = findSmallestDiff(a1, a2);
        System.out.println(Arrays.toString(result));

    }

    static  int []  findSmallestDiff(int [] a1, int [] a2)  {

        Arrays.sort(a1);
        Arrays.sort(a2);

        int [] result = new int [2];
        int l1 = 0;
        int l2 = 0;

        int diff = Integer.MAX_VALUE;



        while(l1 < a1.length && l2 < a2.length) {
            if( Math.abs( a1[l1] - a2[l2])  < diff ) {
                diff = Math.abs( a1[l1] - a2[l2]);
                result[0] = a1[l1];
                result[1] = a2[l2];
            }

            /** Move smaller value;*/

            if( a1[l1] < a2[l2]) {
                l1++;
            }else l2++;
        }


        return result;
    }

}
