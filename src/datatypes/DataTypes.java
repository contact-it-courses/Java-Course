package datatypes;

public class DataTypes {
    public static void main(String[] args){
        byte x = 1;
        byte minByte = -128;
        byte maxByte = 127;

        System.out.println(x);
        System.out.println(minByte);
        System.out.println(maxByte);

        short minShort = -32768;
        short maxShort = 32767;
        System.out.println(minShort);
        System.out.println(maxShort);

        int minInt = -2147483648;
        int maxInt = 2147483647;
        System.out.println(minInt);
        System.out.println(maxInt);

        long minLong = -9223372036854775808L;
        long maxLong = 9223372036854775807L;
        System.out.println(minLong);
        System.out.println(maxLong);

        float f1 = 1.11F;
        System.out.println(f1);
        double d1 = 1.111111111;
        System.out.println(d1);

        boolean b1 = true;
        boolean b2 = false;
        System.out.println(b1);
        System.out.println(b2);

        char char1 = 'a';
        System.out.println(char1);

        String str = "Hello";
        System.out.println(str);

        String str1 = new String("Hi I am a String.");
        System.out.println(str1);
        System.out.println(str1.length());

        int n;

        String str2;
        n = 99;
        System.out.println(n);
        str2 = "Hey I am here again.";
        System.out.println(str2);



    }
}
