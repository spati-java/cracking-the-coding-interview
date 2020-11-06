package chapter1;

import java.util.Arrays;

public class URLify {


    public static void main(String[] args) {
        String str = "Mr John Smith  ";
        String output = replaceSpace(str);
        System.out.println(output);
    }

    public static  String replaceSpace(String str) {

        int spaceCount = 0;
        str = str.trim();
        for(int i = 0; i < str.length(); i++){
            if(str.charAt(i) == ' '){
                spaceCount++;
            }
        }

        int newLength = str.length()+ spaceCount*2;

        System.out.println("space count: " + spaceCount + "  str length: " + str.length() + " new Length: " + newLength);

        char [] char_array = new char[newLength];

        for(int i = str.length() -1 ; i >=0; i--) {

            if(str.charAt(i) == ' ') {
                char_array[newLength-1] = '0';
                char_array[newLength-2] = '2';
                char_array[newLength-3] = '%';
                newLength = newLength-3;
            }else{
                char_array[newLength-1] = str.charAt(i);
                newLength--;
            }

        }

        System.out.println(Arrays.toString(char_array));
        return  new String(char_array);

    }
}
