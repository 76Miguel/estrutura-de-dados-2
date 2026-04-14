package MergeSort;

import java.util.Arrays;
import java.util.Random;

public class MergeSort {

    public static void main(String[] args) {
        int[] tamanhos = {10, 100, 1000};
        Random gerador = new Random();

        for (int n : tamanhos) {
            int[] vetor = new int[n];
            for (int i = 0; i < n; i++) {
                vetor[i] = gerador.nextInt(5000);
            }

            System.out.println("\n--- Teste com " + n + " elementos ---");

            mergeSort(vetor, 0, vetor.length - 1);

            if (estaOrdenado(vetor)) {
                System.out.println("Resultado: SUCESSO! O vetor está ordenado.");
            } else {
                System.out.println("Resultado: ERRO! O vetor NÃO está ordenado.");
            }


            if (n == 10) {
                System.out.println(Arrays.toString(vetor));
            }
        }
    }

    public static void mergeSort(int[] lista, int inicio, int fim) {
        if (inicio < fim) {
            int meio = (inicio + fim) / 2;
            mergeSort(lista, inicio, meio);
            mergeSort(lista, meio + 1, fim);
            intercalar(lista, inicio, meio, fim);
        }

    }

    public static void intercalar(int[] lista, int inicio, int meio, int fim) {
        int[] auxiliar = new int[lista.length];

        // Copiamos os dados para o auxiliar (a 'mesa' segura)
        for (int i = inicio; i <= fim; i++) {
            auxiliar[i] = lista[i];
        }

        int i = inicio;      // Olho na metade esquerda da mesa
        int j = meio + 1;    // Olho na metade direita da mesa
        int k = inicio;      // Braço colocando na estante original

        while (i <= meio && j <= fim) {
            if (auxiliar[i] <= auxiliar[j]) {
                lista[k] = auxiliar[i];
                i++;
            } else {
                lista[k] = auxiliar[j];
                j++;
            }
            k++;
        }

        while (i <= meio) {
            lista[k] = auxiliar[i];
            i++;
            k++;
        }
    }

    public static boolean estaOrdenado(int[] vetor) {
        {
            for (int i = 0; i < vetor.length - 1; i++) {
                if (vetor[i] > vetor[i + 1]) return false;
            }
            return true;
        }
    }
}