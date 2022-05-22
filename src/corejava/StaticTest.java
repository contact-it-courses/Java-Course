package corejava;

public class StaticTest {
    public static void main(String[] args){

        VariableTest.setX(100);
        int obj = VariableTest.getX();
        System.out.println("x="+obj);

        VariableTest.setX(99);
        System.out.println("x="+VariableTest.getX());

        System.out.println("x="+VariableTest.getX());

//        String str = new String("Hello");
        System.out.println("Hello");
        String str2 = new String("Hello")+" World!";
        System.out.println(str2);
    }
}
