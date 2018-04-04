package aliceandbob;

import java.util.Scanner;

public class main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Are you Alice or Bob?");



        while (true) {
            System.out.println("Enter Name: ");
            String name = scan.nextLine();
            if(name.equalsIgnoreCase("Alice")){
                System.out.println("Welcome " + name);
                break;
            }else if(name.equalsIgnoreCase("Bob")){
                System.out.println("Welcome " + name);
                break;
            }else{
                System.out.println("Wrong name try again!");
            }

        }





    }
}
