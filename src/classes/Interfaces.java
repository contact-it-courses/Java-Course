package classes;

public class Interfaces {
    public static void main(String[] args){
        Apt myApt=new TwoBedroom();
        System.out.println("Number of bedrooms "+myApt.getBedrooms());
        System.out.println("Is it rented? "+myApt.isRented());
    }
}
