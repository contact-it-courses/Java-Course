package controlflow;

public class TernaryOperator {
    public static void main(String[] args){
        // ?:

        int x = 11;
        int y;
        y=(x==10)?100:1;

        System.out.println("x="+x);
        System.out.println("y="+y);

        boolean b1 = true;
        boolean b2;
        System.out.println("b1="+b1);
        System.out.println("b2= empty");

        b2=(b1==true)?true:false;
        System.out.println("b1="+b1);
        System.out.println("b2="+b2);
    }
}
