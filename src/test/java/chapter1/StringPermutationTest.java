package chapter1;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Stack;

import static org.junit.jupiter.api.Assertions.*;

class StringPermutationTest {

    StringPermutation sp;
    @BeforeEach
    public void init(){
        sp = new StringPermutation();
    }

    @Test
    void printAllPermutation() {
        sp.printAllPermutation("abcd" ,new ArrayList<>());
    }

    @Test
    void backwordSpace(){

        String s = "abcd";

        Stack<Character> stack = new Stack<>();

        for(char c : s.toCharArray())
            stack.push(c);
    }

    @Test
    void  testRecursion(){
        String s = "abcdef";
        String result = recursion(s);
        System.out.println(result);
    }

    String recursion(String str ){

        if(str == null || str.length() == 0 ){
            return str;
        }
        return recursion(str.substring(1))+ str.charAt(0);
    }
}