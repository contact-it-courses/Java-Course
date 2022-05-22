package corejava.scope;

public class TestScope {
    public static void main(String[] args){
        TestClass testClass = new TestClass();
        testClass.m1();
        testClass.m2();


        {
            int a = 10;
            System.out.println("a="+a);
        }
//        System.out.println("a="+a);


    }
}
