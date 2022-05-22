package controlflow;

public class NestedIf {
    public static void main(String[] args){

        int x = 0;
        System.out.println("X="+x);

        boolean flag = true;

        if (!(flag)){
            x+=5;
            System.out.println("if was true,X+=5, and now x="+x);

            if (x>=5){
                x+=1;
                System.out.println("It is from nested if,x+=1 and now x="+x);
            }else {
                x-=1;
                System.out.println("It is from nested if,x-=1 and now x="+x);
            }
        }else{
            x-=3;
            System.out.println("if was false,X-=3, and now x="+x);
            if (x>=5){
                x+=1;
                System.out.println("It is from nested if,x+=1 and now x="+x);

            }else {
                x-=1;
                System.out.println("It is from nested if,x-=1 and now x="+x);
            }
        }
    }
}
