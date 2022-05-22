package controlflow;

public class ForEach {
    public static void main(String[] args){

//        for(int x=1;x<=10;x+=2){
//            System.out.println("x="+x);
//        }
//        int x=1;
//        while (x<=10){
//            System.out.println("x="+x);
//            x+=2;
//        }

        int[] x={1,5,0,-11};

        for(int i : x){
            System.out.println("i="+i);
        }

    }
}
