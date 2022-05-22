package classes;

public class Encapsulation {
    public static void main(String[] args){
        Human human = new Human("Bob",(byte) 20);
        System.out.println(human);

        System.out.println("My human age is "+human.getAge());
        human.setAge((byte) 1);
        System.out.println(human);
    }
}
