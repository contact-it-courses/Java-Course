package controlflow;

public class ConditionalOperators {
    public static void main(String[] args){

        // &&
        int x = 6;

        if (x>5 && x<10){
            System.out.println("X > 5 && x<10, x=" +x);
        }else{
            System.out.println("X < 5 && x>10, x=" +x);
        }

        // ||
        x = 9;

        if ((x==5 || x==6 || x==7) && x>0){
            System.out.println("X is greater than 0, x=" +x);
        }else{
            System.out.println(" x=" +x);
        }
    }
}
