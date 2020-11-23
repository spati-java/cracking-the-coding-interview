package chapter10;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class RankFromStream {


    public int getRankOfNumber(List<Integer> stream  , int x) {
        Collections.sort(stream);
        System.out.println(stream);
        int count = binarySearch(stream , x);
        return count;
    }


    public int binarySearch(List<Integer> stream , int x) {
        int start = 0;
        int end = stream.size() -1 ;
        List<Integer> allSmalls = new ArrayList<>();
        while(start <= end) {
            int mid = (start +end)/2;

            if(stream.get(mid) > x) {
                end = mid -1;
            }else {

            }

        }
        return -1;
    }
}
