package corejava.errors;

public class App {
    public static void main(String[] args){
        int a = 10;
        int b =0;
        App.test1(a,b);
        App.test2(a, 2);
    }

    public static void test1(int a, int b){
        if (b!=0){
            System.out.println("a/b=" + a/b);
        }else{
            System.out.println("b is 0");
        }
    }

    public static void test2(int a, int b){
        String s="null";

        try{
            System.out.println(s.charAt(0));
            System.out.println("a/b=" + a/b);
        }catch (ArithmeticException e){
            System.out.println("b is 0");
        }catch (NullPointerException e){
            System.out.println("s="+s);
        }finally {
            System.out.println("I am finally");
        }


    }
}
