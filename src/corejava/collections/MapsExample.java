package corejava.collections;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.TreeMap;

public class MapsExample {
    public static void main(String[] args){
        Map <Integer,String> family = new TreeMap<>();
        family.put(4,"Daughter");
        family.put(2,"Mother");
        family.put(3,"Son");
        family.put(1,"Father");
        family.put(99,"Cat");
        family.put(0,"Dag");
        family.put(5,"Fish");

        System.out.println(family);
        System.out.println("family.get(2)="+family.get(2));

        for(Map.Entry<Integer,String> entry: family.entrySet()){
            System.out.println(entry);
            System.out.println("entry.getKey()="+entry.getKey());
            System.out.println("entry.getValue()="+entry.getValue());
        }



    }
}
