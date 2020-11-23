package chapter4;

import java.util.TreeMap;

public class CustomTreeMap extends TreeMap {
    public void getRangeValues(){
        super.ceilingEntry(8);

    }

    public void put(Integer key, String value){
        super.put(key, value);
    }
}
