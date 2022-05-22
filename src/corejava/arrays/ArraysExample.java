package corejava.arrays;

public class ArraysExample {
    public static void main(String[] args){
        String[] x;
        x = new String[4];
        x[0]="One";
        x[1]="Two";
        x[2]="Zero";
        x[3]="Three";
//        System.out.println("x[0]="+ x[0]);
//        System.out.println("x[1]="+ x[1]);
//        System.out.println("x[2]="+ x[2]);
//        System.out.println("x[3]="+ x[3]);
//        System.out.println("x[4]="+ x[4]);

//        for(int i=0;i<x.length;i++){
//            System.out.println("x["+i+"]="+x[i]);
//        }
        System.out.println("x.length="+x.length);
        for(String item : x){
            System.out.println(item);
        }


    }
}
