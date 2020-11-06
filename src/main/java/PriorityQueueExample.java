import lombok.Data;

import java.util.Comparator;
import java.util.PriorityQueue;


public class PriorityQueueExample {



    public String [] returnFiveStringInSortedAndReverseOrdered(String [] words){


        Comparator<String> strComparator = (e1, e2) -> {
           return e2.compareTo(e1);
        };

        PriorityQueue<String> pq = new PriorityQueue<>(strComparator);

        for(String word : words){
            pq.offer(word);
            if( pq.size() > 5 ){
                pq.poll();
            }
        }

        String [] result = new String[pq.size()];
        int index = 0;
           while(!pq.isEmpty()){
               result[index] = pq.poll();
               index++;
           }

        return result;
    }

}

