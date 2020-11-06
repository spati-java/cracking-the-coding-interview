
import model.MostRecent;

import java.util.*;
import java.util.stream.*;
public class MostRecentMapImplementation  {

    private Map<String ,MostRecent> mostRecentMap = new HashMap<>();
    private LinkedHashMap<String ,MostRecent> sortedMap = null;

    Comparator<Map.Entry<String ,MostRecent>> timestampComparator = (e1, e2) ->  e2.getValue(). getTimestamp().compareTo(e1.getValue(). getTimestamp());

    public void put(String key , Long timestamp ,  String message){
        mostRecentMap.put(key, new MostRecent(timestamp, message) );
      this. sortedMap = sortMap(mostRecentMap);
    }

    public  LinkedHashMap<String ,MostRecent> sortMap(Map<String ,MostRecent> mostRecentMap){
            return mostRecentMap.entrySet()
                .stream().sorted(timestampComparator)
                .collect(Collectors.toMap(Map.Entry::getKey , Map.Entry::getValue , (e1, e2) -> e2, LinkedHashMap::new));

    }

    public String get(String key){

        MostRecent  mostRecent =  this.sortedMap.get(key);
        System.out.println(mostRecent);
        if(mostRecent == null) {
            Set<Map.Entry<String , MostRecent>> entries = this.sortedMap.entrySet();
            for(Map.Entry<String ,MostRecent > e: entries){
                mostRecent = e.getValue();
                return mostRecent.getMessage();
            }


        }
        return  mostRecent.getMessage();
    }

    public LinkedHashMap<String ,MostRecent> getSortedMap(){
        return this.sortedMap;
    }

}


