package corejava.collections;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

public class SetsExamples {
    public static void main(String[] args){

        Set<String> mySet = new TreeSet<>();

        for(int i = 10;i>0;i--){
            mySet.add("X="+i);
        }
        mySet.add("X=10");
        System.out.println(mySet);


    }
}
