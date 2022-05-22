package classes;

public class Inheritance {
    public static void main(String[] args){

//        Truck truck = new Truck();
//        System.out.println("truck.hPowers="+truck.gethPowers());
//        System.out.println("truck.VinNumber="+truck.getVinNumber());
//
//        Volvo volvo = new Volvo();
//        System.out.println("volvo.hPowers="+volvo.gethPowers());
//        System.out.println("volvo.VinNumber="+volvo.getVinNumber());
//        volvo.sethPowers(600);
//        volvo.setVinNumber("sdfjvh5445");
//        System.out.println("volvo.hPowers="+volvo.gethPowers());
//        System.out.println("volvo.VinNumber="+volvo.getVinNumber());
//
//        VolvoM1 volvoM1=new VolvoM1();
//        System.out.println("volvoM1.Wheels="+volvoM1.getWheels());

        GrandPa grandPa = new GrandPa("Swith");
        System.out.println("grandPa.lastName="+grandPa.getLastName());

        Father father=new Father();
        System.out.println("father.lastName="+father.getLastName());
        System.out.println("father.children="+father.getChildren());

        Son son = new Son();
        System.out.println("son.children="+son.getChildren());
        System.out.println("son.lastname="+son.getLastName());

        Brother brother = new Brother();
        System.out.println("brother.lastname="+brother.getLastName());

        grandPa.myName();
        father.myName();
        son.myName();
        brother.myName();

    }
}
