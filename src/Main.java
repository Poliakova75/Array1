import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        task1();
        task2();
        task3();
        task4();
    }

    public static void task1() {
        System.out.println("Задача 1");
        int[] numberArray = new int[]{1, 2, 3};
        double[] fractionalArray = {1.57, 7.654, 9.986};
        String[] arbitraryArray = new String[]{"apple", "orange", "banana"};
    }

    public static void task2() {
        System.out.println("\nЗадача 2");
        int[] numberArray = new int[]{1, 2, 3};
        System.out.print(numberArray[0] + ", " + numberArray[1] + ", " + numberArray[2]);
        System.out.println();

        double[] fractionalArray = {1.57, 7.654, 9.986};
        System.out.println(fractionalArray[0] + "," + fractionalArray[1] + "," + fractionalArray[2]);

        String[] arbitraryArray = new String[]{"apple", "orange", "banana"};
        System.out.println(Arrays.toString(arbitraryArray));
    }

    public static void task3() {
        System.out.println("\nЗадача3");
        int[] numberArray = {1, 2, 3};
        for (int i = numberArray.length - 1; i >= 0; i--) {
            System.out.print(numberArray[i] + " ");
        }
        System.out.println();
        double[] fractionalArray = {1.57, 7.654, 9.986};
        System.out.println(fractionalArray[2] + "," + fractionalArray[1] + "," + fractionalArray[0]);

        String[] arbitraryArray = new String[]{"apple", "orange", "banana"};
        StringBuilder sb = new StringBuilder();
        for (int i = arbitraryArray.length - 1; i >= 0; i--) {
            sb.append(arbitraryArray[i]);
            if (i != 0) {
                sb.append(", ");
            }
        }

        String result = sb.toString();
        System.out.println(result);
    }

    public static void task4() {
        System.out.println("\nЗадача 4");
        int[] numberArray = {1, 2, 3,};

        for (int i = 0; i < numberArray.length; i++) {
            if (numberArray[i] % 2 != 0) {
                numberArray[i]++;
            }
        }

        for (int number : numberArray) {
            System.out.print(number + " ");
        }
    }
}



