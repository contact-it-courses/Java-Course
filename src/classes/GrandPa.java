package classes;

public class GrandPa {
    private String lastName;

    public GrandPa(){

    }
    public GrandPa(String lastName){
        this.setLastName(lastName);
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public void myName(){
        System.out.println("GrandPa lastname="+this.getLastName());
    }
}
