/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.divide_conquer;

import java.util.Random;

/**
 *
 * @author Miguel
 */
public class MergeSort {

    public static void main(String[] args) {

        int[] tamanhos = {10, 100, 1000};
        Random gerador = new Random();

        for (int tamanhoAtual : tamanhos) {
            int[] vetor = new int[tamanhoAtual];

            for (int i = 0; i < vetor.length; i++) {
                vetor[i] = gerador.nextInt(5000);
            }

            System.out.println("Testando vetor de tamanho: " + tamanhoAtual);

            mergeSort(vetor, 0, vetor.length - 1);

            if (estaOrdenado(vetor)) {
                System.out.println("Sucesso! O vetor foi ordenado.");
            } else {
                System.out.println("Erro! O vetor não ordenou direito.");
            }

        }

    }

    public static void mergeSort(int[] array, int inicio, int fim) {

        if (inicio < fim) {
            int meio = (inicio + fim) / 2;
            // int meio = (inicio + fim -1) / 2; o codigo ainda funciona, sem muita diferença do normal em questão de tempo
            // int meio = (inicio + fim +1) / 2; o codigo falha por entrar em um loop infinito, com 2 valores [0,1] ficaria sempre (0+1 +1) /2, que seria sempre 1, e nunca iria acabar

            mergeSort(array, inicio, meio);
            mergeSort(array, meio + 1, fim);

            intercalar(array, inicio, meio, fim);
        }

    }

    public static void intercalar(int[] array, int inicio, int meio, int fim) {

        int[] aux = new int[array.length];

        for (int i = inicio; i <= fim; i++) {
            aux[i] = array[i];
        }

        int i = inicio;
        int j = meio + 1;

        int k = inicio;

        while (i <= meio && j <= fim) {
            if (aux[i] <= aux[j]) {
                array[k] = aux[i];
                i++; // Anda com o ponteiro da esquerda
            } else {
                array[k] = aux[j];
                j++; // Anda com o ponteiro da direita
            }
            k++; // Sempre anda com o ponteiro do array original
        }

        while (i <= meio) {
            array[k] = aux[i];
            i++;
            k++;
        }

    }

    public static boolean estaOrdenado(int[] array) {

        boolean ordenado = true;

        for (int i = 0; i < array.length - 1; i++) {
            if (array[i] > array[i + 1]) {
                ordenado = false;
                break;
            }
        }

        return ordenado;
    }
}


