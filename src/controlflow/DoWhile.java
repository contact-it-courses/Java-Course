package controlflow;

public class DoWhile {
    public static void main(String[] args){
        byte x = 6;

        do{
           System.out.println("x="+x);
           x++;
        }while (x<=5);
        System.out.println("after the loop x="+x);
    }
}
