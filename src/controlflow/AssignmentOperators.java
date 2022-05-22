package controlflow;

public class AssignmentOperators {
    public static void main(String[] args){
        int x = 5;
        System.out.println("X="+x);

        x+=1;// x = x+1
        System.out.println("X+="+x);

        x-=2; // x=x-2
        System.out.println("X-="+x);

        x*=4;// x=x*4
        System.out.println("X*="+x);
        System.out.println("X="+x);

        x/=2; // x = x/2
        System.out.println("X/="+x);

        x%=7; // x=8%7=1
        System.out.println("X%="+x);
    }
}
