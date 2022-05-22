package corejava.access.child;

import corejava.access.parent.Parent;

public class Child extends Parent {
    public int publicInt = 1;
    private int privateInt = 2;
    protected int protectedInt = 3;
    int noModifierInt = 4;

    public void accessPrivateInt(){
        System.out.println("publicInt=" + this.publicInt);
        System.out.println("privateInt=" + this.privateInt);
        System.out.println("protectedInt=" + this.protectedInt);
        System.out.println("noModifierInt=" + this.noModifierInt);
        System.out.println("publicIntParent=" + this.publicIntParent);
        System.out.println("protectedIntParent=" + this.protectedIntParent);
    }

}
