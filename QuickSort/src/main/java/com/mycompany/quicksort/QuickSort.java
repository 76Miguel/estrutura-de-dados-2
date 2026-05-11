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

        System.out.println("Vetor ANTES do processamento: " + Arrays.toString(vetor));
        System.out.println("--------------------------------------------------");

        quickSort(vetor, 0, vetor.length - 1);

        System.out.println("--------------------------------------------------");
        System.out.println("Vetor DEPOIS do processamento: " + Arrays.toString(vetor));
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
        System.out.println("\n[Nova Partição] Índices " + left + " a " + right + " | Pivô escolhido: " + pivot);
        
        int i = left - 1;

        for (int j = left; j < right; j++) {
            System.out.print("  -> Comparando " + array[j] + " <= " + pivot + "? ");
            if (array[j] <= pivot) {
                System.out.println("Sim. Trocando posições.");
                i++;
                
                // Troca
                int temp = array[i];
                array[i] = array[j];
                array[j] = temp;
                
                System.out.println("     Estado atual: " + Arrays.toString(array));
            } else {
                System.out.println("Não.");
            }
        }

        System.out.println("  -> Fim das comparações. Colocando o pivô na posição correta (trocando " + array[i + 1] + " com " + pivot + ").");
        // Coloca o pivô no lugar certo
        int temp = array[i + 1];
        array[i + 1] = array[right];
        array[right] = temp;

        System.out.println("  [Fim da Partição] Vetor: " + Arrays.toString(array));
        return i + 1;
    }
}
