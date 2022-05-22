package controlflow;

public class NestedLoops {
    public static void main(String[] args){
        for(int x =1;x<=7;x++){

            for(byte y=1;y<=5;y++){
                System.out.println("y="+y+"x="+x);
            }
            System.out.println("========x="+x);

        }
    }

}
