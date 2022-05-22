package corejava.testpackage;

public class Hello {
    public static void main(String[] args){
        corejava.testpackage.bedroom.Table table1 = new corejava.testpackage.bedroom.Table();
        corejava.testpackage.kitchen.Table table2 = new corejava.testpackage.kitchen.Table();

        table1.location();
        table2.location();
    }
}
