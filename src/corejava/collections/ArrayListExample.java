package corejava.collections;

import java.util.ArrayList;

public class ArrayListExample {
    public static void main(String[] args){
        ArrayList <String> arrayList;
        arrayList = new ArrayList<>();

        arrayList.add("Hello");
        arrayList.add("world");
        System.out.println(arrayList);
        System.out.println(arrayList.get(0));
        System.out.println("**********");
        for (String item: arrayList){
            System.out.println(item);
        }
        arrayList.set(0,"Hi");
        System.out.println(arrayList);

        System.out.println(arrayList.contains("Hi"));
        arrayList.add("One");
        arrayList.add("Two");
        System.out.println(arrayList);
        System.out.println("arrayList.size()="+arrayList.size());
    }
}
