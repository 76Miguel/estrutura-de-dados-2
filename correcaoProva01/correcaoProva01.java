package correcaoProva01;

import java.util.Arrays;

public class correcaoProva01 {

    public static void main(String[] args) {
        System.out.println("--- QUESTÃO 01 ---");
        int[] array1 = {5, 12, 18, 25, 30, 0};
        int x = 15;
        System.out.println("Antes: " + Arrays.toString(array1));
        inserir_ordenado(array1, x);
        System.out.println("Depois: " + Arrays.toString(array1));

        System.out.println("\n--- QUESTÃO 02 ---");
        int[] listaExemplo = {11, 4, 30, 22, 7, 26};
        System.out.println("Original: " + Arrays.toString(listaExemplo));
        selection_sort_inverse(listaExemplo);
        System.out.println("Decrescente: " + Arrays.toString(listaExemplo));

        System.out.println("\n--- QUESTÃO 03 ---");
        String[] nomes = {"ana", "roberto", "beatriz", "joao", "clara", "lu"};
        System.out.println("Nomes: " + Arrays.toString(nomes));
        ordenarPorTamanho(nomes);
        System.out.println("Por tamanho: " + Arrays.toString(nomes));
    }


    public static void inserir_ordenado(int[] array, int x) {
        array[array.length - 1] = x;
        bubbleSort(array);
    }

    public static void bubbleSort(int[] array) {
        int n = array.length;
        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - i - 1; j++) {
                if (array[j] > array[j + 1]) {
                    int aux = array[j];
                    array[j] = array[j + 1];
                    array[j + 1] = aux;
                }
            }
        }
    }

    public static void selection_sort_inverse(int[] array) {
        int n = array.length;
        for (int i = 0; i < n - 1; i++) {
            int indiceMaior = i;
            for (int j = i + 1; j < n; j++) {
                if (array[j] > array[indiceMaior]) {
                    indiceMaior = j;
                }
            }
            int aux = array[indiceMaior];
            array[indiceMaior] = array[i];
            array[i] = aux;
        }
    }

    public static void ordenarPorTamanho(String[] lista) {
        int n = lista.length;
        for (int i = 0; i < n - 1; i++) {
            int menor = i;
            for (int j = i + 1; j < n; j++) {
                if (lista[j].length() < lista[menor].length()) {
                    menor = j;
                }
            }
            String aux = lista[i];
            lista[i] = lista[menor];
            lista[menor] = aux;
        }
    }
}