package BreakIntoMethods_lesson5;

import java.util.Scanner;

public class exercise_5 {
    public static void main(String[] args) {
        Scanner value = new Scanner(System.in);
        System.out.print("Input start number of the range: ");
        int startRange = value.nextInt();
        System.out.print("Input end number if the range ");
        int endRange = value.nextInt();
        int randomNumber = GeneratorRandomNumber(startRange, endRange);
        System.out.println(randomNumber);

    }
    public static int GeneratorRandomNumber(int startRange, int endRange ) {
        int randomNumber = startRange + (int) (Math.random() * ((endRange - startRange)));
        return randomNumber;
    }
}