package controlflow;

public class EqualityOperators {
    public static void main(String[] args){

        int x = 4;

        // ==
        if (x==5){
            System.out.println("X is "+x);
        }else{
            System.out.println("X is not 5, but x is "+x);
        }

        // !=
        if (x!=5){
            System.out.println("X is not 5, but x is "+x);
        }else{
            System.out.println("X is "+x);
        }
    }
}
