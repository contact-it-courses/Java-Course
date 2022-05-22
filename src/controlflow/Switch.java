package controlflow;

public class Switch {
    public static void main(String[] args){

        byte x = 2;

        if(x==0){
            System.out.println("X is "+x);
        }else if(x==1){
            System.out.println("X is "+x);
        }else if(x==2){
            System.out.println("X is "+x);
        }else {
            System.out.println("X is not 0,1,2, and x="+x);
        }

        //Switch
        switch (x){
            case 0: System.out.println("From case 0, x="+x);
                break;
            case 1: System.out.println("From case 1, x="+x);
                break;
            case 2: System.out.println("From case 2, x="+x);
                break;
            default: System.out.println("X is not 0,1,2, and x="+x);
                break;
        }

        int i = 4;
        switch (i){
            case 0: System.out.println("From case 0, i="+i);
                break;
            case 1: System.out.println("From case 1, i="+i);
                break;
            case 2: System.out.println("From case 2, i="+i);
                break;
            default: System.out.println("i is not 0,1,2, and i="+i);
                break;
        }

        char c = 'z';
        switch (c){
            case 'a': System.out.println("From case a, c="+c);
                break;
            case 'b': System.out.println("From case b, c="+c);
                break;
            case 'c': System.out.println("From case c, c="+c);
                break;
            default: System.out.println("c is not a,b,c, and c="+c);
                break;
        }

        int z;
        String str = "John";

        switch (str){
            case "Bob": System.out.println("Hi "+str);
                z=1;
                break;
            case "Mary": System.out.println("Hello "+str);
                z=2;
                break;
            case "John": System.out.println("Hey "+str);
                z=3;
                break;
            default: System.out.println("Nice to meet you, "+str);
                z=4;
                break;
        }

        System.out.println("Z="+z);

    }
}
