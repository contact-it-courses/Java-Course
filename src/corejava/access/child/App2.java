package corejava.access.child;

public class App2 {
    public static void main(String[] args){
        Child child = new Child();
        System.out.println("child.publicInt = "+child.publicInt);

        child.accessPrivateInt();


    }
}
