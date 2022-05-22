package classes;

public class Iphone extends Phone{

    public Iphone(String number){
        super(number);
    }

    public void call(){
        System.out.println("I am calling "+this.getNumber());
    }
}
