package corejava.scope;

public class TestClass {
    private int x = 1;

    public void m1(){
        System.out.println("m1() x="+this.x);
        System.out.println("m1() x="+this.x);
    }

    public int m2(){
        int z = 0;
        System.out.println("m2() x="+this.x);
        System.out.println("m2() z="+z);
        return z;
    }
}
