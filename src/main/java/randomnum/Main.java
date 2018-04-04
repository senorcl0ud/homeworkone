package randomnum;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int x = scanner.nextInt();
        scanner.close();
        System.out.println((int) (Math.random() * x));
    }

}
