package chapter1;

import java.util.HashMap;
import java.util.Map;

public class PalindromicPermutation {

    public static void main(String[] args) {
        String str = "ABC";

        System.out.println(isPalindromiCPermutation(str));
    }

    public static boolean isPalindromiCPermutation(String str) {
        Map<Character , Integer> map = new HashMap<>();
        for(char c : str.toCharArray())
            map.put(c, map.getOrDefault(c, 0) +1);
            return checkMaxOneOdd(map);
    }

    public static boolean  checkMaxOneOdd(Map<Character, Integer> map) {
        boolean foundOdd = false;
        for(int num: map.values()) {
            if(num % 2 == 1) {
                if(foundOdd)
                    return false;
                foundOdd = true;
            }
        }
        return true;
    }
}
