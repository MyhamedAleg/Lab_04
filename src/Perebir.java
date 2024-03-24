public class Perebir {
    public static void main(String[] args) {
        int[] array = {2, 17, 13, 6, 22, 31, 45, 66, 100, -18};

        System.out.println("Перебір масиву за допомогою циклу while:");
        int i = 0;
        while (i < array.length) {
            System.out.print(array[i] + " ");
            i++;
        }
        System.out.println();

        System.out.println("Перебір масиву за допомогою циклу for:");
        for (int j = 0; j < array.length; j++) {
            System.out.print(array[j] + " ");
        }
        System.out.println();

        System.out.println("Числа з непарним індексом (цикл while):");
        i = 1; // Починаємо з індексу 1 (непарний)
        while (i < array.length) {
            System.out.print(array[i] + " ");
            i += 2; // Збільшуємо індекс на 2 для непарних індексів
        }
        System.out.println();

        System.out.println("Числа з парним індексом (цикл for):");
        for (int j = 0; j < array.length; j += 2) {
            System.out.print(array[j] + " ");
        }
        System.out.println();

        System.out.println("Масив у зворотньому порядку:");
        for (int j = array.length - 1; j >= 0; j--) {
            System.out.print(array[j] + " ");
        }
        System.out.println();
    }
}