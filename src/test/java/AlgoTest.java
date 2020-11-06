import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;

import org.junit.jupiter.api.Test;

import javax.crypto.spec.PSource;
import java.util.*;
import java.util.stream.Collectors;

import static org.junit.jupiter.api.Assertions.*;


class AlgoTest {

    Algo algo;

    @BeforeEach
    public void init() {
        algo = new Algo();
    }

    @Test
    @DisplayName("Test of Reverse Array")
    public void testReverseArray() {

        int[] inputArray = {1, 2, 3, 4, 5, 0, 0, 0};

        int[] expectedArray = {0, 0, 0, 5, 4, 3, 2, 1};

        int[] actualArray = algo.reverseArray(inputArray);

        assertArrayEquals(expectedArray, actualArray, "should return an array with elements in the reverse order");
    }

    @Test
    @DisplayName("Permutation")
    public void testIsPermutation(){
        String str1 = "abc";
        String str2 = "bca";
        boolean expected = true;
        boolean actual =   algo.isPermutation(str1, str2);

        assertEquals( expected,actual);
    }


    @Test
    @DisplayName("GetAllPermutation")
    public void testGetAllPermutation(){

        String word = "abc";

        List<String> expectedList  = Arrays.asList("abc", "bca" , "acb", "cba" , "bac", "bac");

        List<String> actualList = algo.getAllPermutations(word);

        assertArrayEquals(expectedList.toArray(), actualList.toArray());

    }

    @Test
    void reverseArray() {
    }

    @Test
    void isPalindromeOfPermutation() {

        String str =  "MOM EMO";
        assertEquals(true, algo.isPalindromeOfPermutation(str.trim()));
    }

    @Test
    void isPermutation() {
    }

    @Test
    void getAllPermutations() {
    }

    @Test
    void permutation() {
    }

    @Test
    void oneEditAway() {

        assertEquals(true, algo.oneEditAway("pale", "ple"));

    }

    @Test
    void sumOfTwo() {
        int [] a = {5,3,8,6,12,10};
        int [] b = {6,2,0,100,5};
        assertEquals(true, algo.sumOfTwo(a,b, 112));
    }

    @Test
    void twoSum() {
        int [] a = {3,3,8,6,12,10};
        assertEquals(true, algo.twoSum(a,11));
    }

    @Test
    void isPalindrom() {
        String str = "kayak";
        assertEquals(true, algo.isPalindrom(str));
    }

    @Test
    void compressString() {

        String str = "aabbccddaabbccddd";
        String expected = "a2b2c2d2a2b2c2d3";
        assertEquals(expected, algo.compressString(str));
        algo.countCompression("aabccdeeaa");

    }

    @Test
    void rotateMatrix() {

        int [][] matrix = {{1,2,3,4}, {23,23,12,12}};
        algo.rotateMatrix(matrix,4);
    }

    @Test
    void findLongestPalindrom() {

        String str = "cbbd";

       String longestPalindrom =  algo.findLongestPalindrom(str);

       assertEquals("bb", longestPalindrom);
    }

    @Test
    void isBalancedParensShouldReturnTrue() {

        boolean expected = true;

        boolean actual =  algo.isBalancedParens("((()))");

        assertEquals(expected,actual);
    }

    @Test
    void isBalancedParensShouldReturnFalse() {

        boolean expected = false;

        boolean actual =  algo.isBalancedParens("(((}))");

        assertEquals(expected,actual);
    }

    @Test
    void runLengthEncoding() {

        String  input = "aabbbcccaa";

        String expected = "2a3b3c2a";

        String actual = algo.runLengthEncoding(input);

        assertEquals(expected, actual);

    }

    @Test
    void binarySearch() {

        int [] nums = { 1,3,5,6,7,8,9};
        int target = 9;
        int actual = algo.binarySearch(nums, target);
        assertEquals(-1, actual);

    }

    @Test
    void compressStringV2() {
    }

    @Test
    void countCompression() {
    }

    @Test
    void isBalancedParens() {
    }

    @Test
    void mergeTwoSortedArray() {

        int [] a = {1,2,3,4, 43};
        int [] b = {5,7,8, 9, 10, 80, 100, 343};
        int [] expected = { 1,2,3,4,5,7,8,9,10 , 43,  80, 100, 343};
        int [] actual = algo.mergeTwoSortedArray(a,b);
        //System.out.println(Arrays.toString(actual));
        assertArrayEquals(expected, actual);
    }

        @Test
        void testMergeSort() {

        int [] inputA = { 1,3,2,4, 5};
        int [] actualA = algo.mergeSort(inputA);
        int [] expectedA = {1,2,3,4, 5};
        assertArrayEquals(expectedA, actualA);
    }

    @Test
    void testBinarySearch() {
    }

    @Test
    void mergeSort() {
    }

    @Test
    void testMergeSort1() {
    }

    @Test
    void groupAnargam() {


        List<String> list = new ArrayList<>();
        list.add(list.size(), "Hello");
        list.add(list.size(), "World");

        List<Integer> intList = new ArrayList<>();
        intList.add(1);
        intList.add(2);

            String [] strs = list.toArray(new String[list.size()]);
            int [] a = intList.stream().mapToInt(e->e).toArray();
        System.out.println(Arrays.toString(strs));



        String alphanumeric =  " 78454 hkdjhf";
        Double result = 0.0;
        for(int i = 0; i < alphanumeric.length(); i++){
            if(Character.isDigit(alphanumeric.charAt(i))){
                int dgit = Character.getNumericValue(alphanumeric.charAt(i));
                result = (result * 10) + dgit;

            }
        }

        System.out.println(result);

        System.out.println(reverseInt(result.intValue()));
    }

    private int reverseInt(int num){

        int result = 0;

        while(num != 0) {
            result = result*10;
            result = result + num %10;
            num = num/10;
        }
        return  result;
    }

    private  int revertInteger(String s){

        Double result = 0.0;

        int index = 0;

        while(index < s.length()  && Character.isDigit(s.charAt(index))){

            int  digit = Character.getNumericValue(s.charAt(index));

            result = result * 10 + digit;
            index++;
        }

        return result.intValue();
    }

    @Test
    void spaceSearch() {
        String [] array = {"at" ,"", "", "", "", "", "","dad", "ball", "" };
        String sk = "ball";
        int expected = 8;
        int actual = algo.spaceSearch(sk, array);
        assertEquals(expected, actual);
    }

    @Test
    void testHashMapUnique (){

        Map<String , Integer> map = new HashMap<>();
        String [] strs = { "abd" , "a", "c", "asd" , "abd"};
        int index = 1;
        for(String s: strs){
            map.computeIfAbsent(s, v-> s.length());
        }

        System.out.println(map);
    }

    @Test
    void reversedString() {

        assertEquals("dcba" , algo.reversedString("abcd"));
    }

    @Test
    public  void mapValueSortedTest(){

        Comparator<Map.Entry<String, Integer>> valueComparator = Comparator.comparingInt(Map.Entry::getValue);

        Map<String , Integer> map = new HashMap<>();

        map.put("A", 5);
        map.put("B" , 6);
        map.put("C" , 2);
        map.put("D" , 1);

        List<Map.Entry<String, Integer>> toSort = new ArrayList<>();

        for (Map.Entry<String, Integer> stringIntegerEntry : map.entrySet()) {
            toSort.add(stringIntegerEntry);
        }

        toSort.sort(valueComparator);

        LinkedHashMap<String, Integer> sortedMap = new LinkedHashMap<>();

        for (Map.Entry<String, Integer> stringIntegerEntry : toSort) {
            sortedMap.put(stringIntegerEntry.getKey(), stringIntegerEntry.getValue());
        }

        for(Map.Entry<String, Integer> e: sortedMap.entrySet()){
            System.out.println(e.getKey()  + " " + e.getValue());
        }

    }

    @Test
    public void testSmallestValueOfMap(){

        HashMap<String , Integer> map = new HashMap<>();

        map.put("A", 5);
        map.put("B", 3);
        map.put("C", 10);
        map.put("D", 1);
        map.put("E", 5);

        int min = Collections.max(map.values());
        System.out.println(min);;
    }
}