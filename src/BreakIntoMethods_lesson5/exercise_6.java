package BreakIntoMethods_lesson5;

import java.util.Scanner;

public class exercise_6 {

    public static void main(String[] args) {

        Scanner value = new Scanner(System.in);

        System.out.print("Input distance in meters: ");
        float distance = value.nextFloat();

        System.out.print("Input hour: ");
        float hours = value.nextFloat();

        System.out.print("Input minutes: ");
        float minutes = value.nextFloat();

        System.out.print("Input seconds: ");
        float seconds = value.nextFloat();

        float metersInSecond = CalculateMetersinSec(seconds, minutes, hours);
        float kmHours = CalculateKmInHours(hours, minutes, seconds);

        System.out.println("Your speed in meters/second is " + distance/ metersInSecond);
        System.out.println("Your speed in km/h is " + distance / 1000 / kmHours);

    }
    public static float CalculateMetersinSec (float seconds, float minutes, float hours) {
        float metersInSecond = seconds + (minutes * 60) + (hours * 3600);
        return metersInSecond;

    }
    public  static float CalculateKmInHours (float hours, float minutes, float seconds) {
        float kmHours = hours + (minutes /  60) + (seconds / 3600);
        return kmHours;
    }
}
