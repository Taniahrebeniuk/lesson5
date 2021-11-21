package homework5;

import java.util.Scanner;

public class task1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int sum  = scanner.nextInt();
        boolean isEvenOdd = CheckEvenOdd(sum);
        System.out.println(isEvenOdd);
    }

    public static boolean CheckEvenOdd ( int number) {
        if (number % 2 == 0)    {
            return true;}
        else {
            return false ;
        }
    }
}
