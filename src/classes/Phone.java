package classes;

public class Phone {
    private String number;

    public Phone(String number){
        this.number=number;
    }

    public void call(){
        System.out.println("I am calling "+this.number);
    }

    public String getNumber() {
        return number;
    }
}
