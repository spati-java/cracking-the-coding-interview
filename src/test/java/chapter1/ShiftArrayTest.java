package chapter1;

import org.junit.jupiter.api.Test;

import java.util.Arrays;

class ShiftArrayTest {


    @Test
    void shiftAllELementByPosition() {

        ShiftArray sa = new ShiftArray();

        int [] input = {1,2,0,4,5, 6,8,9};

        int [] result = sa.shiftAllElementByPosition(input,3);

        System.out.println(Arrays.toString(result));
    }

    @Test
    void shiftZeroWithNextNUmber() {

        int [] input = {1,2,0,4,5, 0, 6,8,9};
        int [] result = {1,2,0,0, 4,5,0,0,6};

        ShiftArray sa = new ShiftArray();
        int [] actual = sa.shiftZeroWithNextNUmber(input);
        System.out.println(Arrays.toString(actual));
    }

    @Test
    void testArrayCopy(){

        int [] a1 = {1,4,2,3,5,2};
        int [] a2 = new int [a1.length];

        System.arraycopy(a1, 0,a2, 0,a1.length);

        System.out.println(Arrays.toString(a2));

    }

    @Test
    void testStringMultiplication(){

        String a = "25";
        String b = "25";

        int ar [] = new int [a.length() + b.length()];
        int index1 = 0;

        for(int  i = b.length()-1; i>=0; i--){

                int num1 = Character.getNumericValue(a.charAt(i));

                for(int k = a.length()-1; k >= 0 ; k--) {

                        int num2 = Character.getNumericValue(b.charAt(k));
                       int result =  num1 * num2;

                    System.out.println( num1 + " multiply by  "+ num2 + " result: " + result);
                }
        }

        System.out.println(25*25);
    }


    @Test
    void countCharacterToBeShiftedFromStartOrEnd(){

        String a = "cab";  /*  edabc -> dabce->  */

        String b = "abc";

        int maxLen = 0;
        int len = a.length();
        int i = 0;
        while(i < len){

            int length = 0;
            for(int k = 0; k < b.length(); k++) {

                if(a.charAt(i) == b.charAt(k)){
                    ++i;
                    ++length;

                    if(i == len)
                        break;
                }
            }
            maxLen = Math.max(maxLen, length);
        }

        System.out.println(len - maxLen);
    }



}