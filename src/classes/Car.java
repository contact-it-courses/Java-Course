package classes;

public class Car {
    private String color;
    private int maxSpeed;
    private int doors;

    public int getMaxSpeed() {
        return maxSpeed;
    }

    public void setMaxSpeed(int maxSpeed) {
        this.maxSpeed = maxSpeed;
    }

    public int getDoors() {
        return doors;
    }

    public void setDoors(int doors) {
        this.doors = doors;
    }

    public void setColor(String color){
        this.color=color;
    }
    public String getColor(){
        return color;
    }

    public void closeDoors(){
        System.out.println("All the doors are closed.");
    }
    public void openDoors(){
        System.out.println("All the doors are opened.");
    }
}
