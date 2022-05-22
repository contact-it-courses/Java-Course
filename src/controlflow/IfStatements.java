package controlflow;

public class IfStatements {
    public static void main(String[] args){

        int x = 1;

        if (x==0){
            System.out.println("X is 1");
        }

        int z = 0;

        if (z==0){
            System.out.println("Z is 0");
        }else{
            System.out.println("Z is NOT 0");
        }

        int v = 5;

        if (v==1){
            System.out.println("V is 1");
        }else if (v==0){
            System.out.println("V is 0");
        }else if (v==2){
            System.out.println("V is 2");
        }else if (v==3){
            System.out.println("V is 3");
        }else{
            System.out.println("V is not here");
        }
    }
}
