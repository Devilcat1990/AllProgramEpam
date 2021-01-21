package CheckInput;

import java.util.Scanner;

public class CheckInputValuesInteger {
    public static int InputValuesInt() {
        Scanner inputInteger = new Scanner(System.in);
        while(!inputInteger.hasNextInt()) {
            System.out.println("Нужно вводить число!");
            inputInteger.next();
        }
        return inputInteger.nextInt();
    }
}
