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
        int[] lista1 = {15, 2, 10, 5, 3};
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
    public static void insertionSortOtimizado(int[] lista, int n){
        
        for (int i = 1; i < n; i++) {
            boolean trocou = false;
            int chave = lista[i];
            int j = i - 1;

            while (j >= 0 && lista[j] > chave) {
                lista[j + 1] = lista[j];
                j = j - 1; 
                trocou = true;
            }
            lista[j + 1] = chave;
            if (trocou == false){
                
                System.out.println("Passo " + i + ":");
                imprimirVetor(lista);
                break;
            }
                        
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
