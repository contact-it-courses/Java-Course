package methods;

public class Calculator {
    public static void main(String[] args){
        int a =345;
        int b=734;

        System.out.println(sum(a,b));
        System.out.println(subt(a,b));
        System.out.println(mult(a,b));
        System.out.println(dev(a,b));
        System.out.println(dev(b,a));


    }

    public static int sum(int x, int y){
        return x+y;
    }
    public static int subt(int x, int y){
        return x-y;
    }
    public static int mult(int x, int y){
        return x*y;
    }
    public static float dev(float x, float y){
        return x/y;
    }

}
