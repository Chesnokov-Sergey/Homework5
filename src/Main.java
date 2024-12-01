import java.util.Arrays;
import java.util.Scanner;
import java.util.Random;


public class Main {
    public static void main(String[] args) {
        // Массивы
        // Домашняя работа 2
        // Задание 1
        System.out.println("Задание 1");
        int[] salaryArray = generateRandomArray();
        System.out.println(Arrays.toString(salaryArray));
        int salaryAmounts = 0;
        for (int salary : salaryArray) {
            salaryAmounts += salary;
        }
        System.out.println("Сумма трат за месяц составила " + salaryAmounts + " рублей");

        // Задание 2
        System.out.println("Задание 2");
        int[] salaryArray2 = generateRandomArray();
        System.out.println(Arrays.toString(salaryArray));
        int minimumAmounts = salaryArray[0];
        int maxAmounts = salaryArray[0];

        for (int salary : salaryArray2) {
            if (salary < minimumAmounts) {
                minimumAmounts = salary;
            }
            if (salary > maxAmounts) {
                maxAmounts = salary;
            }
        }
        System.out.println("Минимальная сумма трат за месяц составила " + minimumAmounts + " рублей " + " Максимальная сумма трат за месяц составила " + maxAmounts + " рублей");

        // Задание 3
        System.out.println("Задание 3");
        int[] salaryArray3 = generateRandomArray();
        System.out.println(Arrays.toString(salaryArray3));
        int salaryAmounts2 = 0;
        for (int salary : salaryArray3) {
            salaryAmounts2 += salary;
        }
        double salaryAverage = (double) salaryAmounts2 / salaryArray3.length;
        System.out.println("Средняя сумма трат за месяц составила " + salaryAverage + " рублей");

        // Задание 4
        System.out.println("Задание 4");
        char[] reverseFullName = {'n', 'a', 'v', 'I', ' ', 'v', 'o', 'n', 'a', 'v', 'I'};
        for (int i = 0; i < reverseFullName.length / 2; i++) {
            char temp = reverseFullName[i];
            reverseFullName[i] = reverseFullName[reverseFullName.length - 1 - i];
            reverseFullName[reverseFullName.length - 1 - i] = temp;
        }
        System.out.println(Arrays.toString(reverseFullName));
    }

    public static int[] generateRandomArray() {
        java.util.Random random = new java.util.Random();
        int[] arr = new int[30];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = random.nextInt(100_000) + 100_000;
        }
        return arr;
    }
}