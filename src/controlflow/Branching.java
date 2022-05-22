package controlflow;

public class Branching {
    public static void main(String[] args){

//        System.out.println("For loop breaking:");
//        for(int i=1;i<11;i++){
//            System.out.println("i="+i);
//
//            if(i==5){
//                break;
//            }
//        }
//
//        System.out.println("While loop breaking:");
//
//        int x = 1;
//        while (x<=10){
//            System.out.println("x="+x);
//            x++;
//
//            if(x>4){
//                break;
//            }
//        }
//
//        System.out.println("Do While loop breaking:");
//        byte z =1;
//        do{
//            System.out.println("z="+z);
//            z+=2;
//
//            if(z>10){
//                break;
//            }
//        }while (z<=20);
//
//        System.out.println("Labeled breaking:");
//
//        here:
//        for(int i = 0;i<=10;i++){
//            for(short j=1;j<=5;j++){
//                System.out.println("i="+i+" j="+j);
//                if(j==3){
//                    break;
//                }
//                if(i==5){
//                    break here;
//                }
//            }
//
//            System.out.println("=========i="+i);
//
//        }
        System.out.println("Unlabeled continue:");
        for(int i = 0;i<10;i++){
            System.out.println("i="+i);

            if(i==5){
                i=8;
                continue;
            }
        }

        System.out.println("Labeled continue:");

        test:
        for (int i=0;i<11;i++){
            System.out.println("======= i="+i);
            for(int j=1;j<12;j++){
                System.out.println("i="+i+" j="+j);

                if(i==3){
                    i=9;
                    continue test;
                }
            }
        }

    }
}
