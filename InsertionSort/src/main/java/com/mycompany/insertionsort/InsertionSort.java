/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.insertionsort;

/**
 *
 * @author Miguel
 */
public class InsertionSort {
    public static void main(String[] args) {
                                        
                     //{15, 14, 13, 12, 11, 10, 9, 8, 7, 6, 5, 4, 3, 2, 1};
                     //{1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15};
                     //{45, 12, 89, 3, 67, 21, 54, 9, 77, 32, 1, 99, 23, 56, 8, 41, 13, 90, 4, 66, 22, 55, 10, 78, 31, 2, 100, 24, 57, 7};
        int[] lista1 = {3,2,1};
        int[] lista2 = lista1.clone();
        int n = lista1.length;

        System.out.println("Vetor lista Original:");
        imprimirVetor(lista1);
        
        System.out.println("-------------------------------");
        System.out.println("Vetor não otimizado: ");
        
        long t1 = System.nanoTime();
        insertionSort(lista1, n);
        long t2 = System.nanoTime();
        System.out.println("Tempo Original: " + (t2 - t1) + " ns");
        
        System.out.println("-------------------------------");
        
        System.out.println("Vetor Otimizado");
        
        long t3 = System.nanoTime();
        insertionSortOtimizado(lista2, n);
        long t4 = System.nanoTime();
        System.out.println("Tempo Original: " + (t4 - t3) + " ns");
        
        System.out.println("Resumindo: ");
        System.out.println("Versão não otimizada = "+ (t2-t1));
        System.out.println("Versão otimizada =     "+ (t4-t3));
    }
    
    public static void insertionSort(int[] lista, int n){
        for (int i = 1; i < n; i++) {
            int chave = lista[i];
            int j = i - 1;

            while (j >= 0 && lista[j] > chave) {
                lista[j + 1] = lista[j];
                j = j - 1; 
            }
            lista[j + 1] = chave;
            
            System.out.println("Passo " + i + ":");
            imprimirVetor(lista);
        }
    }
    
    public static void insertionSortOtimizado(int[] lista, int n) {
    boolean jaOrdenado = true;
    for (int q = 0; q < n - 1; q++) { 
        if (lista[q] > lista[q + 1]) {
            jaOrdenado = false;
            break;
        }
    }

    if (jaOrdenado) {
        System.out.println("Vetor já estava ordenado. Fim precoce.");
        return;
    }

    for (int i = 1; i < n; i++) {
        int chave = lista[i];
        int j = i - 1;
        boolean houveMudanca = false;

        while (j >= 0 && lista[j] > chave) {
            lista[j + 1] = lista[j];
            j = j - 1;
            houveMudanca = true;
        }
        lista[j + 1] = chave;

        System.out.println("Passo " + i + ":");
        imprimirVetor(lista);
    }
}
    

    public static void imprimirVetor(int[] vet) {
        for (int num : vet) {
            System.out.print(num + " ");
        }
        System.out.println();
    }
    
}