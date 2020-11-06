package chapter8;

import java.util.Arrays;

public class TrippleStep {

    public static void main(String[] args) {
        int result = countWays(4 );
        System.out.println(result);
    }

    public static int countWays(int n ){
        int [] cache = new int [n+1];
        Arrays.fill(cache, -1);
        return countWays(n, cache);
    }
    public  static int countWays(int n ,  int [] cache) {

        if(n < 0) return 0;
        else if(n == 0) return 1;
        else if (cache[n] > -1) return cache[n];
        else {
            cache[n] = countWays(n-1, cache) + countWays(n-2, cache) + countWays(n-3, cache);
        }

        return cache[n];
    }
}
