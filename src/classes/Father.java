package classes;

public class Father extends GrandPa{
    private int children;

    public Father(){
        super("Swith");
        this.setChildren(2);
    }

    public int getChildren() {
        return children;
    }

    public void setChildren(int children) {
        this.children = children;
    }

    @Override
    public void myName() {
        System.out.println("Father lastname="+this.getLastName());
    }
}
