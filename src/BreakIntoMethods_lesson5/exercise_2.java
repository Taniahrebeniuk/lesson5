package BreakIntoMethods_lesson5;

public class exercise_2 {
    public static void main(String[] args) {
        int[] arr = new int[]{1, 2, 3, 4, 5};

        ArrayOrder(arr);

    }
    public static void ArrayOrder(int[] arr) {

        System.out.println("Original array order");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
        System.out.println("Array in reverse order");
        for (int i = arr.length - 1; i >= 0; i--) {
            System.out.print(arr[i] + " ");
        }
    }
}

