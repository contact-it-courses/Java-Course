package methods;

public class ReturnMethods {
    public static void main(String[] args){
        int x =doSum(10,15);// 25
        int y =doSum(2,55); //57

        System.out.println("x="+x +" y="+y);
        System.out.println(int5());
//        System.out.println(5);
        System.out.println(sayHi());
        System.out.println(sayHello());


    }

    public static int doSum(int x,int y){
        int result=x+y;
        System.out.println("Sum="+result);
        return result;
    }

    public static int int5(){
        return 5;
    }

    public static String sayHi(){
        return new String("Hi");
    }
    public static String sayHello(){
        return "Hello";
    }
}
