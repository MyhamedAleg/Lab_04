import java.util.Scanner;

public class Perevirka {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Просимо користувача ввести кількість елементів у масиві
        System.out.print("Введіть кількість елементів масиву: ");
        int n = scanner.nextInt();

        // Оголошення масиву
        double[] array = new double[n];

        // Введення елементів масиву користувачем
        System.out.println("Введіть елементи масиву:");
        for (int i = 0; i < n; i++) {
            System.out.print("Елемент " + (i + 1) + ": ");
            array[i] = scanner.nextDouble();
        }

        // Зміна знаку непарних елементів
        for (int i = 0; i < array.length; i++) {
            if (array[i] % 2 != 0) { // перевірка чи елемент є непарним
                array[i] *= -1; // зміна знаку елемента
            }
        }

        System.out.println("Масив зі зміненими знаками непарних елементів:");
        printArray(array);


    }


    public static void printArray(double[] arr) {
        for (double num : arr) {
            System.out.print(num + " ");
        }
        System.out.println();
    }
}
