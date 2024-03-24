public class Masive {
    public static void main(String[] args) {
        int[] array = new int[100]; // Створюємо масив розміром 100 елементів (50 парних та 50 непарних чисел)

        // Заповнюємо масив парними числами
        int evenNumber = 2;
        for (int i = 0; i < 50; i++) {
            array[i] = evenNumber;
            evenNumber += 2;
        }

        // Заповнюємо масив непарними числами
        int oddNumber = 1;
        for (int i = 50; i < 100; i++) {
            array[i] = oddNumber;
            oddNumber += 2;
        }

        // Виводимо масив для перевірки
        for (int i = 0; i < array.length; i++) {
            System.out.println("array[" + i + "] = " + array[i]);
        }
    }
}