package classes;

public class Constructor {
    public static void main(String[] args){
        Truck myTruck = new Truck();
        System.out.println("My new truck is "+myTruck);

        Truck myTruck2 = new Truck("sdfhi9f43");
        System.out.println("My new truck2 is "+myTruck);

        Truck myTruck3 = new Truck(500);
        Truck myTruck4 = new Truck(600);

        System.out.println("myTruck3 hPowers="+myTruck3.gethPowers());
        System.out.println("myTruck4 hPowers="+myTruck4.gethPowers());

        Truck myTruck5 = new Truck("sdfssdf",500);
        System.out.println("myTruck5 vinNumber is "+myTruck5.getVinNumber() + "" +
                "\n myTruck5 hPowers is "+myTruck5.gethPowers());

    }
}
