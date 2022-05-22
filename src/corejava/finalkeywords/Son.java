package corejava.finalkeywords;

public class Son {
    private final String lastname;

    public Son(String lastname) {
        this.lastname = lastname;
    }

    public String getLastname() {
        return lastname;
    }

    public void hello(){
        System.out.println("Hey I am a son");
    }
    public void goodbye(){
        System.out.println("I am leaving!");
    }

}
