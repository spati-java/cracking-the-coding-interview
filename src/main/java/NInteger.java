import java.util.*;

class NInteger {

    public static void main(String [] args){

        int a [] = sumZero(5);

        System.out.println(Arrays.toString(a));

    }


    public static int[] sumZero(int n) {

        int sum = 0;


        HashSet<Integer> set = new HashSet<>();

        for(int i = 0; i< n ; i++){

            int negative  = 0 - i;

            if(sum == negative +i){

                if(set.size() < n){
                    set.add(negative);
                    set.add(i);
                }else {
                    return set.stream().mapToInt(e->e).toArray();
                }

            }

        }

        return new int[5];
    }
}