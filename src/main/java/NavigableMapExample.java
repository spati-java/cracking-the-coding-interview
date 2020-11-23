import java.util.Map;
import java.util.NavigableMap;

public class NavigableMapExample {

    public NavigableMap<Integer, String> testHeadMap(Integer key , NavigableMap<Integer , String> map){
        return map.headMap(key, false);
    }

    public Map.Entry<Integer, String> getCeiling(Integer key , NavigableMap<Integer , String> map){
        return map.ceilingEntry(key);
    }

    public Map.Entry<Integer, String> getFloor(Integer key, NavigableMap<Integer, String> map){
        return map.floorEntry(key);
    }

    public NavigableMap<Integer, String> getTailMap(Integer key, NavigableMap<Integer, String> map){
        return map.tailMap(key, true);
    }

    public NavigableMap<Integer , String> getDescendingKeySet(NavigableMap<Integer, String> map){
        return map.descendingMap();
    }

}
