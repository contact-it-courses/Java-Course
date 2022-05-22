package corejava.finalkeywords;

public class Example {
    public static void main(String[] args){
        Son son = new Son("Smith");
        System.out.println("My lastname is "+son.getLastname());
        son.hello();
        son.goodbye();

    }
}
