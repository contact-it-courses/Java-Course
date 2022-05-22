package classes;

public class FirstClass {
    public static void main(String[] args){

        Car myCar=new Car();
        Car myCar2 = new Car();

        myCar.openDoors();
        myCar2.closeDoors();
        new Car().closeDoors();
        new Car().openDoors();

        System.out.println(myCar);
        System.out.println(myCar2);

//        System.out.println("myCar.color="+myCar.color);
//        System.out.println("myCar.maxSpeed="+myCar.maxSpeed);
//        System.out.println("myCar.doors="+myCar.doors);

        System.out.println("myCar.color="+myCar.getColor());
        myCar.setColor("Green");
        System.out.println("myCar.color="+myCar.getColor());

        myCar2.setMaxSpeed(200);
        myCar2.setColor("Black");
        myCar2.setDoors(2);

        myCar.setMaxSpeed(400);
        myCar.setColor("White");
        myCar.setDoors(6);

        System.out.println("Color of my car1="+myCar.getColor());
        System.out.println("Doors of my car2="+myCar2.getDoors());


    }
}
