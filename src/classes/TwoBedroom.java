package classes;

public class TwoBedroom extends Apt{
    @Override
    public String getBedrooms() {
        return "Two";
    }

    @Override
    public String isRented() {
        return "It is not rented";
    }
}
