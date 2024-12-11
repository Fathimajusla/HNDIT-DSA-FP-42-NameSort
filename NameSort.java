import java.util.Arrays;

public class NameSorter {
    public static void main(String[] args) {
        String[] names = {"Zara", "Ben", "Alice"};
        selectionSort(names);
        System.out.println(Arrays.toString(names));
    }

    public static void selectionSort(String[] array) {
        for (int i = 0; i < array.length - 1; i++) {
            int minIndex = i;
            for (int j = i + 1; j < array.length; j++) {
                if (array[j].compareTo(array[minIndex]) < 0) {
                    minIndex = j;
                }
            }
            String temp = array[minIndex];
            array[minIndex] = array[i];
            array[i] = temp;
        }
    }
}
