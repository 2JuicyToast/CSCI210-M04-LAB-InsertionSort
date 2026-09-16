package edu.desu.sortutils;

public class InsertionSort {
    public static void insertionSort(int[] arr) {
        for (int i = 1; i < arr.length; i++) {
            int key = arr[i];
            int j = i - 1;

            // Move elements greater than key to one position ahead
            while (j >= 0 && arr[j] > key) {
                arr[j + 1] = arr[j];
                j--;
            }

            // Insert key into correct position
            arr[j + 1] = key;
        }
    }

    public static void main(String[] args) {
        int[] numbers = {9, 5, 1, 4, 3};

        insertionSort(numbers);

        for (int num : numbers) {
            System.out.print(num + " ");

        }
    }
}