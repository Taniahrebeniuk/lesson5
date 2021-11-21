package BreakIntoMethods_lesson5;
import java.util.Scanner;


public class exercise_4 {
    public static void main(String[] args) {

        Scanner value = new Scanner(System.in);
        System.out.print("Input the number of minutes: ");

        double minutes = value.nextDouble();
        int days = ConvertMinutesIntoDays(minutes);
        int years = ConvertMinutesIntoYears(minutes);

        System.out.println((int) minutes + "  minutes is approximately " + years + " years and " + days + " days");

    }

    public static int ConvertMinutesIntoYears (double minutes) {
        double minutesSuminYear = 60 * 24 * 365;
        int years = (int) (minutes / minutesSuminYear);
        return years;
    }

    public static int ConvertMinutesIntoDays (double minutes ) {

        int days = (int) (minutes /60 / 24) % 365;
        return days;
    }
}
