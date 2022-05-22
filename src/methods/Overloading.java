package methods;

public class Overloading {
    public static void main(String[] args){
        int x =sum(2,6);
        System.out.println("x="+x);

        int y =sum(2,6, 54);
        System.out.println("y="+y);

        float z =sum(2.1f,6.5f);
        System.out.println("z="+z);

        sum();
    }

    public static int sum(int a, int b){
        return a+b;
    }

    public static int sum(int a, int b, int c){
        return a+b+c;
    }

    public static float sum(float a, float b){
        return a+b;
    }

    public static void sum(){
        System.out.println("I need number!");
    }
}
