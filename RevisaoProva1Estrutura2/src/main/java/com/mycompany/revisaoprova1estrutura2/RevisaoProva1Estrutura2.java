package com.mycompany.revisaoprova1estrutura2;

import java.util.Arrays;

public class RevisaoProva1Estrutura2 {

    public static void main(String[] args) {

        // --- TESTE QUESTAO 1 ---
        int[] listaQ1 = {1, 2, 3, 4, 5};
        // System.out.println("Questão 1:");
        // questao1(listaQ1);

        // --- TESTE QUESTAO 2 ---
        int[] listaQ2 = {1, 2, 3, 4, 6, 7, 8, 9, 10};
        int x = 5;
        // System.out.println("\nQuestão 2:");
        // questao2(listaQ2, x);

        // --- TESTE QUESTAO 3 (Recursiva) ---
        int[] listaQ3 = {15, 2, 10, 5, 3};
//        System.out.println("\nQuestão 3 - Insertion Sort Recursivo:");
//        System.out.println("Original: " + Arrays.toString(listaQ3));
//        
//        insertionSortRecursivo(listaQ3, listaQ3.length);
//        
//        System.out.println("Finalizado: " + Arrays.toString(listaQ3));

        // --- TESTE QUESTAO 4 ---
        int[] listaQ4 = {15, 2, 10, 5, 3};
        int qtd = 0;
        // selectionSortRecursivo(listaQ4, qtd);

        // --- TESTE QUESTAO 5 ---
        int[] listaQ5 = {5, 12, 8, 42, 1};
        SelectionSortDecrescente(listaQ5);

    }

    // QUESTÃO 1: Verifica ordem
    public static void questao1(int[] lista) {
        int tamanho = lista.length;
        boolean ordenada = true;
        for (int i = 0; i < tamanho - 1; i++) {
            if (lista[i] > lista[i + 1]) {
                ordenada = false;
            }
        }
        if (ordenada) {
            System.out.println("Lista Ordenada");
        } else {
            System.out.println("Lista Desordenada");
        }
    }

    // QUESTÃO 2: Insere X em lista ordenada
    public static void questao2(int[] lista, int x) {
        int tamanho = lista.length;
        int[] listaNova = new int[tamanho + 1];
        for (int i = 0; i < tamanho; i++) {
            listaNova[i] = lista[i];
        }
        int j = tamanho - 1;
        while (j >= 0 && listaNova[j] > x) {
            listaNova[j + 1] = listaNova[j];
            j--;
        }
        listaNova[j + 1] = x;
        System.out.println("Resultado: " + Arrays.toString(listaNova));
    }

    // QUESTÃO 3: Insertion Sort Recursivo
    public static void insertionSortRecursivo(int[] lista, int n) {

        if (n <= 1) {
            return;
        }

        System.out.println("Empilhando: descendo para n = " + (n - 1));
        insertionSortRecursivo(lista, n - 1);

        System.out.println("Desempilhando: resolvendo para o elemento no índice " + (n - 1));

        int ultimo = lista[n - 1]; // Pego o último cara da fatia atual
        int j = n - 2;             // Começo a comparar com quem está atrás dele

        while (j >= 0 && lista[j] > ultimo) {
            lista[j + 1] = lista[j];
            j--;
        }
        lista[j + 1] = ultimo; // Encaixa o "ultimo" no buraco
    }

    // QUESTAO 4 
    public static void selectionSortRecursivo(int[] lista, int qtd) {
        if (qtd >= lista.length - 1) {
            return;
        }

        int indiceMenor = qtd;

        for (int i = qtd + 1; i < lista.length; i++) {
            if (lista[i] < lista[indiceMenor]) { // Sem o ";" no final!
                indiceMenor = i;
            }
        }

        int aux = lista[indiceMenor];
        lista[indiceMenor] = lista[qtd];
        lista[qtd] = aux;

        System.out.println("Passo " + qtd + ": " + Arrays.toString(lista));

        selectionSortRecursivo(lista, qtd + 1);
    }

    public static void SelectionSortDecrescente(int[] lista) {
        int tamanho = lista.length;

        for (int i = 0; i < tamanho - 1; i++) {
            int indiceMaior = i;
            
            for (int j= i+1; j < tamanho; j++) {
                if (lista[j] > lista[indiceMaior]) {
                    indiceMaior = j;
                }
            }
            int aux = lista[i];
            lista[i] = lista[indiceMaior];
            lista[indiceMaior] = aux;

        }
        System.out.println(Arrays.toString(lista));
    }

}
