package BreakIntoMethods_lesson5;

import java.util.Scanner;
public class exercise_3 {
    public static void main(String[] args) {
        Scanner value = new Scanner(System.in);
        System.out.print("Input a value for inch: ");
        double inch = value.nextDouble();
        double meters = ConvertIntoMeters(inch);
        System.out.println(inch + " inch is " + meters + " meters");
    }
    public static double ConvertIntoMeters(double inch) {
        return inch * 0.0254;
    }
}

