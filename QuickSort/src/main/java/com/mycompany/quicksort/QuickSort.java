/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */
package com.mycompany.quicksort;

/**
 *
 * @author Miguel
 */
public class QuickSort {

    public static void main(String[] args) {
        int[] vetor = {7, 2, 9, 4, 3, 8, 6, 1};

        System.out.println("Antes: " + java.util.Arrays.toString(vetor));

        quickSort(vetor, 0, vetor.length - 1);

        System.out.println("Depois: " + java.util.Arrays.toString(vetor));
    }

    public static void quickSort(int[] array, int left, int right) {
        if (left < right) {
            int pivot_index = partition(array, left, right);

            quickSort(array, left, pivot_index - 1);
            quickSort(array, pivot_index + 1, right);
        }
    }

    public static int partition(int[] array, int left, int right) {
        int pivot = array[right]; // Pivô é o último
        int i = left - 1;

        for (int j = left; j < right; j++) {
            if (array[j] <= pivot) {
                i++;
                int temp = array[i];
                array[i] = array[j];
                array[j] = temp;
            }
        }

        int temp = array[i + 1];
        array[i + 1] = array[right];
        array[right] = temp;

        return i + 1;
    }
}
