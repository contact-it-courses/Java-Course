package classes;

public class Truck {
    private String vinNumber;
    private int hPowers;

    public Truck(){
        System.out.println("Hey, I am a default constructor.");
    }

    public Truck(String vinNumber,int hPowers){
        this.setVinNumber(vinNumber);
        System.out.println("My vin is "+this.getVinNumber());
        this.sethPowers(hPowers);
        System.out.println("My hPowers is "+this.gethPowers());
    }

    public Truck(String vinNumber){
        this.setVinNumber(vinNumber);
        System.out.println("My vin is "+this.getVinNumber());
    }

    public Truck(int hPowers){
        this.sethPowers(hPowers);
        System.out.println("My hPowers is "+this.gethPowers());

    }

    public String getVinNumber() {
        return vinNumber;
    }

    public int gethPowers() {
        return hPowers;
    }

    public void sethPowers(int hPowers) {
        this.hPowers = hPowers;
    }

    public void setVinNumber(String vinNumber) {
        this.vinNumber = vinNumber;
    }
}
