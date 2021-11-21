package homework5;


public class task2 {
    public static void main(String[] args) {
        int[] arr = new int[]{1, 2, 3, 4, 5};
        int sum = ArraySum(arr);
        System.out.println(sum);
    }

    public static int ArraySum(int[] arr) {
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            sum = sum + arr[i];
        }

        return sum;
    }
}

