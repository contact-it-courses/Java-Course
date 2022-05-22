package corejava.collections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Sorting {
    public static void main(String[] args){
        ArrayList <String> arrayList = new ArrayList<>();

        for(int i =0;i<5;i++){
            arrayList.add("The element "+i);
        }

        System.out.println("arrayList="+arrayList);
        List<String> list = arrayList;
        System.out.println("list="+list);
        list.set(0,"Hi");
        list.set(2,"World");
        list.set(4,"Java");
        System.out.println("list="+list);
        list.sort(null);
        System.out.println("list sorted="+list);
        Collections.reverse(list);
        System.out.println("list reversed="+list);

    }
}
