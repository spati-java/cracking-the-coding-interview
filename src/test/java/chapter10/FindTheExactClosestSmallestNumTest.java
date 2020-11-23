package chapter10;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;

class FindTheExactClosestSmallestNumTest {

     FindTheExactClosestSmallestNum fc;
    @BeforeEach
    void init(){
        fc = new FindTheExactClosestSmallestNum();
    }
    @Test
    void findTheClosestSmallestElement() {
        List<Integer> nums = Arrays.asList(1,4,2,4,2,22,31,50);
        System.out.println( fc.findTheClosestSmallestElement(nums, 40));
        System.out.println(fc.findTheExactGreaterAmount(nums,40 ));
    }


}