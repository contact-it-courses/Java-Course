package classes;

public class Polymorphism {
    public static void main(String[] args){
        Phone myPhone = new Phone("5455236565");
        myPhone.call();

        Iphone myIphone = new Iphone("5455236566");
        myIphone.call();

        Phone newPhone = new Iphone("007");
        newPhone.call();

        Phone newSamsung = new Samsung("10");
        newSamsung.call();

        Phone inStore = getPhone(11);
        Phone inStore2 = getPhone(10);
        Phone inStore3 = getPhone(12);
        inStore.call();
        inStore2.call();
//        inStore3.call();

    }

    public static Phone getPhone(int model){
        switch (model){
            case 11: return new Iphone("1111111");
            case 10: return new Samsung("1000000");
        }
        return null;
    }
}
