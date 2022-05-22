package methods;

public class FirstMethod {
    public static void main(String[] args){

        int x = 0;
        int y = 1;
        int result;

        result = x + y;
        System.out.println("from the block of the main,result=" + result);


        doSum(x,y);
        x=5;
        y=12;
        doSum(x,y);

        for(int i=0;i<3;i++){
            printMe();
        }







    }

    public static void doSum(int x,int y){
//        int x = 0;
//        int y = 1;
        System.out.println("Starting method doSum()");
        int result;

        result = x + y;
        System.out.println("result=" + result);
        System.out.println("Method doSum() is done.");
    }

    public static void printMe(){
        System.out.println("Hey it is Me");
        int x = 0;
        System.out.println("I created x="+x);
        System.out.println("I am done.");
    }

}
