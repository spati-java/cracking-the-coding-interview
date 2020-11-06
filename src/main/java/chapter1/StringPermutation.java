package chapter1;

import java.util.*;


public class StringPermutation {

    public static void main(String[] args) {
        String str = "MOM";

        List<String> result = new ArrayList<>();
        printAllPermutation(str , result);

        //getPermsWihtoutDups("", str, result);

        System.out.println(result);
    }

    static void  printAllPermutation(String str , List<String> re){
        permutation(str, "" , re);
    }

    private static void permutation(String str, String prefix, List<String> result) {

        HashMap<Character, Integer> map = new HashMap<>();
        calculate( str, 0, str.length()-1 , result);

    }

    private static void calculate(String str, int left, int right , List<String> result) {

        if(left == right) {
            result.add(str);
        }
        else {
            for(int i = left; i <=right; i++ ) {
                String swapped = swapString(str, left,i);
                calculate( swapped, left+1, right, result );
            }
        }

    }

    private static String swapString(String str, int index1, int index2) {
        char [] char_array = str.toCharArray();
        char temp = char_array[index1];
        char_array[index1] = char_array[index2];
        char_array[index2] = temp;
        return new String(char_array);

    }
}
