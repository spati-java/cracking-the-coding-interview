package chapter8;

public class RecursiveMultiply {

    public static void main(String[] args) {
        int result = recursiveMultiply(5,-7);
        System.out.println(result);
    }

    public static int recursiveMultiply(int x , int y){

        System.out.println("Call stack");

        if(y == 0)
            return 0;
        else if(y < 0)
            return  (recursiveMultiply(x, -y));
        return x+ recursiveMultiply(x, y-1);
    }

    public static int multiPlyIterativeWayWithoutUsingOperator(int a , int b){

        int count = 0;
        for(int row = 0;row < a; row++)
            for(int col = 0; col < b; col++){
                count++;
            }
        return count;
    }
}
