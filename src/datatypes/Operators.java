package datatypes;

public class Operators {
    public static void main(String[] args){

        //Addition
        int x = 5;
        int y = 55;
        int result1 = x+y;
        System.out.println(result1);
        int result2 = 55+55;
        System.out.println(result2);

        //Subtraction
        x = 5;
        y = 1;
        result1 = x-y;
        System.out.println(result1);
        result2 = 10-1;
        System.out.println(result2);
        int result3 = result2-9;
        System.out.println(result3);

        //Concatenation
        String str = "I am ";
        String str2 = "a String";
        String strResult = str + str2;
        System.out.println(strResult);

        String strResult2 = "I am " + "a String";
        System.out.println(strResult2);
        System.out.println("I am " + "a String");
        System.out.println(str + str2);

        //Multiplication
        short a1 = 2;
        byte b2 = 2;
        long l= a1*b2;
        System.out.println(l);

        //Division
        a1 =10;
        b2 = 0;
        System.out.println(a1/2);

        //Remainder
        int s1 = 20;
        int s2 = 2;
        int sr = s1%s2;
        System.out.println(sr);

        sr = 20%3;//20/3=6*3=18 20-18=2
        System.out.println(sr);

        //incrementing

        int  i = 1;
        System.out.println(i++);
        System.out.println(i);

        //decrementing
        int j = 5;
        System.out.println(--j);
        System.out.println(j);
    }
}
