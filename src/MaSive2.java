import java.util.Scanner;

public class MaSive2 {
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

        // Обчислення суми елементів масиву
        double sum = 0;
        for (int i = 0; i < n; i++) {
            sum += array[i];
        }


        System.out.println("Сума елементів масиву: " + sum);


    }
}
