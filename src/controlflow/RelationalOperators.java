package controlflow;

public class RelationalOperators {
    public static void main(String[] args){

        // >
        int x = 10;

        if (x>10){
            System.out.println("X is greater than 10, x is "+ x);
        }else{
            System.out.println("X is less than 10, x is "+x);
        }

        // >=
        x = 10;

        if (x>=10){
            System.out.println("X is greater than 10, x is "+ x);
        }else{
            System.out.println("X is less than 10, x is "+x);
        }

        // <
        x = 10;

        if (x<10){
            System.out.println("X is less than 10, x is "+ x);
        }else{
            System.out.println("X is greater than 10, x is "+x);
        }

        // <=
        x = 10;

        if (x<=10){
            System.out.println("X is less than 10, x is "+ x);
        }else{
            System.out.println("X is greater than 10, x is "+x);
        }
    }
}
