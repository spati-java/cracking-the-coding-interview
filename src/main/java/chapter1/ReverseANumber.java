package chapter1;

public class ReverseANumber {

    public static void main(String[] args) {
        System.out.println(isPalindromNum(111));
    }

    public static  int reverse(int num){
        int reversed = 0;
        while(num != 0) {
            int reminder = num % 10;
            reversed = reminder + reversed*10;
            num /=10;
        }
        return reversed;
    }

    public static  boolean isPalindromNum(int num ){
        return reverse(num) == num;
    }
}
