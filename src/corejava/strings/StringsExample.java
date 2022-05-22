package corejava.strings;

public class StringsExample {
    public static void main(String[] args){
        String a = "Hello ";
        String b = new String("world");
        String c = a + b;

        System.out.println(c);
        c = c.replace('H', 'h');
        System.out.println(c);
        c = c.replace("hello", "Hi");
        System.out.println(c);
        System.out.println(c.charAt(0));
        System.out.println("c.length()="+c.length());

        if( c.contains("1") ){
            System.out.println("c is Hello world");
        }else {
            System.out.println("c is not Hello world");
        }

    }
}
