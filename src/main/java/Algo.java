import java.util.ArrayList;

import java.util.List;

import java.util.*;
import java.util.stream.Collector;
import java.util.stream.Collectors;


public class Algo {

    public int[] reverseArray(int[] array) {

        for (int i = 0; i < array.length / 2; i++) {
            int temp = array[(array.length - 1) - i];
            array[(array.length - 1) - i] = array[i];
            array[i] = temp;
        }

        return array;
    }


    public boolean isPalindromeOfPermutation(String str) {
        HashMap<Character, Integer> charMap = new HashMap<>();

        for (int i = 0; i < str.length(); i++) {

            char tempChar = str.charAt(i);
            if (!Character.isWhitespace(tempChar)) {
                if (charMap.containsKey(tempChar)) {
                    charMap.put(tempChar, charMap.get(tempChar) + 1);

                } else charMap.put(tempChar, 1);
            }

        }

        Set<Map.Entry<Character, Integer>> set = charMap.entrySet();

        List<Integer> valueList = new ArrayList<>();

        for (Map.Entry e : set) {
            Integer countVal = (Integer) e.getValue();

            valueList.add(countVal);
        }

        System.out.println(valueList);
        long oneCount = valueList.stream()
                .filter(e -> e % 2 == 0)
                .count();

        return oneCount > 1 ? false : true;

    }


    public boolean oneEditAway(String first, String second) {

        if (first.length() == second.length()) {
            return oneEditReplace(first, second);
        } else if (first.length() + 1 == second.length()) {
            return oneEditInsert(first, second);
        } else if (first.length() - 1 == second.length()) {
            return oneEditInsert(second, first);
        }

        return false;
    }

    private boolean oneEditInsert(String s1, String s2) {

        int index1 = 0;
        int index2 = 0;

        while (index2 < s2.length() && index1 < s1.length()) {
            if (s1.charAt(index1) != s2.charAt(index2)) {
                if (index1 != index2) {
                    return false;
                }
                index2++;
            } else {
                index1++;
                index2++;
            }
        }


        return true;
    }

    private boolean oneEditReplace(String s1, String s2) {

        boolean foundDifference = false;

        for (int i = 0; i < s1.length(); i++) {
            if (s1.charAt(i) != s2.charAt(i)) {
                if (foundDifference) {
                    return false;
                }
                foundDifference = true;
            }
        }
        return true;
    }


    public boolean isPermutation(String str1, String str2) {

        List<Character> charList = new ArrayList<>();
        if (str1.length() != str2.length() || str1.equalsIgnoreCase(str2)) {
            return false;
        }

        for (int i = 0; i < str1.length(); i++) {
            charList.add(str1.charAt(i));
        }

        for (int j = 0; j < str2.length(); j++) {
            if (charList.contains(str2.charAt(j))) {
                continue;
            } else return false;
        }

        return true;
    }

    public ArrayList<String> getAllPermutations(String word) {

        String prefix = "";
        return null;
    }

    void permutation(String word, String prefix) {

    }


    public boolean sumOfTwo(int[] a, int[] b, int target) {
        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < b.length; j++) {
                if (a[i] + b[j] == target) {
                    return true;
                }
            }
        }
        return false;
    }

    public boolean twoSum(int[] a, int target) {
        HashMap<Integer, Integer> checkSumMap = new HashMap<>();
        for (int i = 0; i < a.length; i++) {
            if (checkSumMap.containsKey(target - a[i])) {
                return true;
            }
            checkSumMap.put(a[i], i);
        }
        return false;
    }

    public boolean isPalindrom(String str) {
        if (str == null || str.length() == 0) return false;
        String palindrom = "";
        for (int i = str.length() - 1; i >= 0; i--) {

            palindrom += str.charAt(i);
        }
        System.out.println(palindrom);
        return palindrom.equalsIgnoreCase(str);
    }

    public String compressString(String str) {
        StringBuilder compress = new StringBuilder();
        int countConsecutive = 0;

        for (int i = 0; i < str.length(); i++) {
            countConsecutive++;
            if (i + 1 >= str.length() || str.charAt(i) != str.charAt(i + 1)) {
                compress.append(str.charAt(i));
                compress.append(countConsecutive);
                countConsecutive = 0;
            }
        }

        return compress.length() > str.length() ? str : compress.toString();
    }
    public String compressStringV2(String str) {



        return null;
    }

    int countCompression(String str){

        int compressedLength = 0;
        int count = 0;

        for(int i = 0; i < str.length(); i++){

            count++;

            if(i+1>=str.length() || str.charAt(i) != str.charAt(i+1)) {

                compressedLength+= 1+String.valueOf(count).length();
                System.out.println(String.valueOf(count).length()  + "  The length");
                count = 0;

            }
        }

        return compressedLength;
    }

    public void rotateMatrix(int [][] matrix, int n){
        int [][] matrix1 = {{1,2}, {3,4}};
        for(int layer= 0; layer<n/2; layer++) {

            int first = layer;

            int last = n -1 - layer;

            System.out.println( "first: "+ first + " last:" +last);

            for(int i = first; i < last; i++ ) {

                int offset = i - first;

                System.out.println(offset);

                // save top
                int top = matrix[first][i];

                // left -> top
                matrix[first][i] = matrix[last-offset][first];

                //bottom ->left
                matrix[last-offset][first] = matrix[last][last-offset];

                // right -> bottom

                matrix[last][last -offset] = matrix[i][last];

            }
        }
    }


    public String findLongestPalindrom(String str) {

        TreeMap<Integer, StringBuilder> map = new TreeMap();

        char [] chars = str.toCharArray();

        for(int i = 0; i < chars.length; i++){

             StringBuilder sb = null;

             for(int j = i ; j < chars.length; j++) {

                 sb = new StringBuilder();

                 for(int k = j ; k >= i; k--){
                     sb.append(chars[k]);
                 }

                 if(sb.toString().length()>1 && sb.toString().equals(sb.reverse().toString())){
                     map.put(sb.length(), sb);
                 }

                 //
             }
        }

        return map.get(map.lastKey()).toString();

    }



    public boolean isBalancedParens(String parens){

        HashMap<Character, Character> map = new HashMap<>();

        map.put( ')' , '(' );
        map.put( '}' , '{' );
        map.put( ']' , '[' );

        Stack<Character> stack = new Stack<>();

        for(char c : parens.toCharArray()) {

            if(map.containsKey(c)){

                char temp = map.get(c);

                if(!stack.isEmpty() && stack.peek() == temp ) {
                    stack.pop();
                }
            } else stack.push(c);
        }
        return stack.isEmpty();
    }


    public String runLengthEncoding(String s) {

        // s = "aabbbbcccaa res = 2a4b3c2

        char prevChar = '0';

        int count = 0;

        StringBuilder sb = new StringBuilder();

        for(char c: s.toCharArray()){
            if(c == prevChar){
                count++;
            }else {

                if(count == 0){
                    sb.append(c);
                }
            }
        }
        return  null;

    }

    public int binarySearch( int [] numArray , int target) {

        int start  = 0;
        int end =  numArray.length -1;


        while(start < end){
          int  mid = (start + end) / 2;
            System.out.println(mid);
            if(numArray[mid] == target) return mid;
            else if(numArray[mid] > target){
                end = mid-1;
            }else {
                start = mid + 1;
            }
        }

        return -1;

    }


    public int [] mergeTwoSortedArray(int [] a , int [] b){
        int [] result = new int [a.length + b.length];

        int leftPointer = 0;
        int rightPointer = 0;
        int resultAIndex = 0;

        while(leftPointer < a.length && rightPointer < b.length){
             if(a[leftPointer] > b[rightPointer]){
                 result[resultAIndex] = b[rightPointer];
                 rightPointer++;
             } else {
                 result[resultAIndex] = a[leftPointer];
                 leftPointer++;

             }
            resultAIndex++;
        }

        while(leftPointer < a.length){
            result[resultAIndex] = a[leftPointer];
            leftPointer++;
            resultAIndex++;
        }

        while(rightPointer < b.length){
            result[resultAIndex] = b[rightPointer];
            rightPointer++;
            resultAIndex++;
        }
        return  result;
    }



    public int []  mergeSort(int [] array) {

        int [] temp = new int [array.length];

        mergeSort(array , 0 , array.length -1 , temp);

        System.out.println(Arrays.toString(temp));
        return temp;


    }

    public void mergeSort( int [] array , int leftStart , int rightEnd , int [] temp) {
        if(leftStart >= rightEnd){
            return;
        }

        int mid = (leftStart+rightEnd)/2;

        mergeSort( array,leftStart , mid , temp );

        mergeSort(array, mid+1 , rightEnd , temp);

        merge(array, leftStart, rightEnd , temp);
    }


    private void merge( int [] array , int leftStart , int rightEnd , int [] temp) {

        int leftEnd = (leftStart + rightEnd)/2;
        int rightStart = leftEnd + 1;
        int index = leftStart;

        int left = leftStart;
        int right = rightStart;
        int size = rightEnd -leftStart +1;

        while(left < leftEnd && right < rightEnd){

            if(array[left] > array[right]){
                temp[index] =   array[right];
                right++;
            }else {
                temp[index] =   array[left];
                left++;
            }
            index++;
        }

        System.arraycopy(array , left, temp, index, leftEnd -left -1);
        System.arraycopy(array , right, temp, index, rightEnd -right -1);
        System.arraycopy(temp , leftStart, array, leftStart, size);

    }

    public String [] groupAnargam(String [] strs) {
         Map<String , List<String>> map = new HashMap<>();

        List<String> anagramList = null;

        for(String str: strs) {
            String key = sortChars(str);
            if(map.containsKey(key)) {
                anagramList = map.get(key);
                anagramList.add(str);
                map.put(key , anagramList);
            }else {
                anagramList = new ArrayList();
                anagramList.add(str);
                map.put(key , anagramList);
            }
        }

        int index = 0;
    for(Map.Entry<String , List<String>> e: map.entrySet()){

        for(String str: e.getValue()){
            if(index < strs.length){
                strs[index] = str;
                index++;
            }
        }
    }

        return strs;
    }

    private String sortChars(String s){
        char [] content = s.toCharArray();
        Arrays.sort(content);
        return new String(content);
    }


    public int spaceSearch(String sk , String [] array) {

        int start = 0;

        int end = array.length -1;

        while(start < end) {

            int mid = (start +end)/2;

            // if the string at the mid positioin is an empty then move our mid point to the closest no empty string
            mid =  moveMidToTheClosestNonEmpty(start, end, array, mid);
            if( array[mid].equalsIgnoreCase(sk) ) return mid;
                else if( sk.compareTo(array[mid]) == 1 ) {
                    start = mid+1;
                } else end = mid - 1;

        }
        return -1;
    }

    private int moveMidToTheClosestNonEmpty( int start ,int  end ,String []  array , int
            mid) {

        int leftP = mid-1;
        int rightP = mid+1;

        while(leftP >= start && rightP<=end) {

            if(leftP < start && rightP > end ) return -1;
            else if ( leftP>= start  &&  !array[leftP].isEmpty() ) {
                    mid = leftP;
                return mid;

            }
            else if ( rightP <= end  &&  !array[rightP].isEmpty() ){
                mid = rightP;
                return mid;
            }
            rightP++;
            leftP--;
        }

        return mid;
    }


    public   String reversedString(String anst) {

        char [] arr = anst.toCharArray();

        for(int i = 0; i < arr.length/2; i++){
            char temp = arr[arr.length -1 - i];
            arr[arr.length -1 - i]   = arr[i];
            arr[i] = temp;
        }

        return new String(arr);
    }



}

