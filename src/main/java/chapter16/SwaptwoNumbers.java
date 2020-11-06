package chapter16;

public class SwaptwoNumbers {

    public static void main(String[] args) {
        swapTwoNumbersWithoutTempValue(1212,600);
    }

    public static void swapTwoNumbersWithoutTempValue(int a, int b){
        a = a^b;
        b = a^b;
        a = a^b;
        System.out.println("a " + a + " b "+ b );
    }


}
