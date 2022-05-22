package corejava;

import java.util.Scanner;

public class UserInput {
    public static void main(String[] args){
        System.out.println("Hey, What is your name?");
        Scanner scanner = new Scanner(System.in);
        String name = scanner.nextLine();
        System.out.println("Hey my name is "+name);

        System.out.println("Hey, How old are you?");
        int age = scanner.nextInt();
        System.out.println("I am "+ age);

        System.out.println("How are you?");
        String today = scanner.next();
        System.out.println("I am "+ today);
        scanner.close();
    }
}
