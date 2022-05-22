package classes;

public class Human {
    private String name;
    private byte age;

    public Human(String name, byte age) {
        this.name=name;
        this.setAge(age);
    }

    public void setAge(byte age) {
        if(age>=0 && age<=100){
            this.age = age;
        }else{
            System.out.println("Hey, input the correct age!");
        }

    }

    public String getName() {
        return this.name;
    }

    public byte getAge() {
        return this.age;
    }

    @Override
    public String toString() {
        return "Human{name=" + name  +", age=" + age +'}';
    }
}
