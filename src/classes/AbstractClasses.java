package classes;

public class AbstractClasses {
    public static void main(String[] args){
//        AbsCar car = new AbsCar();
        Bmw myBmw = new Bmw();
        Tesla myTesla = new Tesla();
        myBmw.start();
        myBmw.drive();

        myTesla.start();
        myTesla.drive();
    }
}
