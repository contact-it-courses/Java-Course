package corejava.access;

import corejava.access.child.Child;

public class App {
    public static void main(String[] args){
        Child child = new Child();
        System.out.println("child.publicInt = "+child.publicInt);

        child.accessPrivateInt();


    }
}
