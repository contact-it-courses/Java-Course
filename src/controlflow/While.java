package controlflow;

public class While {
    public static void main(String[] args){

        byte x =1;
        while(x<=10){
            System.out.println("Hi, x="+x);
            x++;

            if(x==5){
                break;
            }
        }

    }
}
