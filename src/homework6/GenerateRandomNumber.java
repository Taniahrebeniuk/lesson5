package homework6;

/* Write a method that accepts two parameters: mode of type String and length of type int.
This function should return a randomly generated string of given length according to the specified mode.
Modes: alpha, numeric, alphanumeric
Output —> String. */

public class GenerateRandomNumber {

    public static void main(String[] args) {
        String str1 = generateString("alpha", 10);
        System.out.println(str1);
        String str2 = generateString("numeric", 10);
        System.out.println(str2);
        String str3 = generateString("alphanumeric", 10);
        System.out.println(str3);
    }

    public static String generateString (String mode,int lenght){
            String alpha = "abcdefghijklmnopqrstuvwxyz";
            String numeric = "0123456789";
            String alphanumeric = alpha + numeric;
            String alphabet = null;


            if (mode == "alpha") {
                alphabet = alpha;
            } else if (mode == "numeric") {
                alphabet = numeric;
            } else {
                alphabet = alphanumeric;
            }

            String resultString = "";
            for (int i = 0; i < lenght; i++) {
                double randomIndex = Math.random() * (alphabet.length() - 1);
                int newRandomIndex = (int) randomIndex;
                char ch = alphabet.toCharArray()[newRandomIndex];
                resultString = resultString + ch;
            }
            return resultString;
        }
    }

