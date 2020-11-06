package chapter1;

import java.util.HashMap;

public class StringPermutationWithDups {

    public static void main(String[] args) {
        String str = "MOM";
        getPerm(str, 0, str.length()-1);
        HashMap<String , Integer> map = new HashMap<>();
        map.put("A" , 1);
        map.put("B" , 1);


        System.out.println(map.size());
    }

    public static void getPerm(String str , int left , int right){

            if(left == right){
                System.out.println(str);
            }
            else {
                    for(int i = left; i <= right; i++){
                        boolean check = shouldSwap(str.toCharArray() , left, i);
                        if(check){
                            String swapped = swap(str, left , i );
                            getPerm(swapped, left+1, right);
                        }
                    }
            }
    }

    public static String swap(String str , int index1, int index2){
        char [] chars = str.toCharArray();
        char temp = chars[index1];
        chars[index2] = chars[index1];
        chars[index1] = temp;
        return new String(chars);
    }

    static  boolean shouldSwap(char[] chars, int index1, int index2){
        for(int i = index1; i <index2; i++){
            if(chars[i] == chars[index2])
                return false;
        }
        return true;
    }
}



