package corejava.access.parent;

public class Parent {
    public int publicIntParent = 5;
    private int privateIntParent = 6;
    protected int protectedIntParent = 7;
    int noModifierIntParent = 8;

    public void accessPrivateInt(){
        System.out.println("publicIntParent=" + this.publicIntParent);
        System.out.println("privateIntParent=" + this.privateIntParent);
        System.out.println("protectedIntParent=" + this.protectedIntParent);
        System.out.println("noModifierIntParent=" + this.noModifierIntParent);
    }
}
