import java.sql.SQLOutput;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        // Массивы
        // Домашнее задание 1
        // Зададание 1
        System.out.println("Задание 1");
        int[] integer = new int[]{1, 2, 3};
        double[] fractional = {1.57, 7.654, 9.986};
        char[] arbitrary = {'a', 'b', 'c'};

        // Задание 2
        System.out.println("Задание 2");
        for (int i = 0; i < integer.length; i++) {
            System.out.print(integer[i]);
            if (i != integer.length - 1)
                System.out.print(", ");
        }
        System.out.println();

        for (int i = 0; i < fractional.length; i++) {
            System.out.print(fractional[i]);
            if (i != fractional.length - 1)
                System.out.print(", ");
        }
        System.out.println();
        for (int i = 0; i < arbitrary.length; i++) {
            System.out.print(arbitrary[i]);
            if (i != arbitrary.length - 1)
                System.out.print(", ");
        }
        System.out.println();

        // Задание 3
        System.out.println("Задание 3");
        for (int i = integer.length - 1; i >=0; i--) {
            System.out.print(integer[i]);
            if (i != 0)
                System.out.print(", ");
        }
        System.out.println();
        for (int i = fractional.length - 1; i >=0 ; i--) {
            System.out.print(fractional[i]);
            if (i != 0)
                System.out.print(", ");
        }
        System.out.println();
        for (int i = arbitrary.length - 1; i >=0 ; i--) {
            System.out.print(arbitrary[i]);
            if (i != 0)
                System.out.print(", ");
        }
        System.out.println();
        // Задание 4
        System.out.println("Задание 4");
        for (int i = 0; i < integer.length; i++) {
            if (integer[i] % 2 != 0) {
                integer[i]++;
            }
        }
        System.out.println(Arrays.toString(integer));
    }
}