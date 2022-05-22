package datatypes;

public class Casting {
    public static void main(String[] args){
        // short->int
        short s = 1;
        int i = s;
        System.out.println(i);

        // int->shot
        int ss = 11;
        short ii = (short) ss;
        System.out.println(ii);

        byte b = 1;
        short st = b;
        int in = st;
        long l = in;
        float f = l;
        double d = f;

        double dd = 111.123456789d;
        float ff = (float) dd;
        System.out.println(dd);
        System.out.println(ff);

        long ll = 123456789;
        short srt = (short) ll;
        System.out.println(ll);
        System.out.println(srt);

        String str = "100";
        int str2 = Integer.parseInt(str);
        System.out.println(str2);

        float str3 = 100.1f;
        System.out.println(str3);

        int str4 = (int)str3;
        System.out.println(str4);


    }
}
