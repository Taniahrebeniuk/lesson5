package homework5;

public class task3 {
    public static void main(String[] args) {
        String str = "Hello World!";
        int[] codes = IntegerCodes(str);
        for (int i = 0; i < str.length(); i++) {
            System.out.println(codes[i]);
        }
    }

    public static int[] IntegerCodes(String str) {
        int[] codes = new int[str.length()];

        for (int i = 0; i < str.length(); i++) {
            char c = str.charAt(i);
            codes[i] = (int) c;
        }

        return codes;
    }
}
