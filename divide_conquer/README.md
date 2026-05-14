# Atividade Estrutura de Dados 2 - divide conquer

## Questão 1, 2 e 4
estão nos codigos
implementação do merge sort(Q1), alterando a forma de cortar o meio no metodo mergeSort(Q2), implementação do quickSort decrescente(Q4)



### Questão 3 - Teste de Mesa Quick Sort
se a função for `quicksort(array, left, right)` e o vetor `[55, 44, 22, 11, 66, 33]`, se utilizar o primeiro elemento como o pivo, a ordem seria:

quicksort(array, 1, 6)
quicksort(array, 1, 4)
quicksort(array, 1, 2)
quicksort(array, 1, 0)
quicksort(array, 2, 2)
quicksort(array, 4, 4)
quicksort(array, 6, 6)

### Questão 5 - Análise do erro na recursão do Quick Sort

/*
public void quickSort (int [] array , int left , int right ) {
int j = partition (array , left , right );
if ( left < j - 1) {
quickSort (array , left , j - 1);
}
if (j + 1 < right ) {
quickSort (array , j + 1, right );
}
}
*/

falta a linha `if (left < right)` e esse if englobar os outros 2

### Questão 6 - Análise do erro na função Partition

/*
public int partition(int[] array, int left, int right) {
        int j = right;
        for (int i = right - 1; i >= left; i--) {
            if (array[i] > array[right]) {
                int temp = array[i];
                array[i] = array[right];
                array[right] = temp;
                j = i;
            }
        }
        return j;
    }
*/

a troca fica errada porque troca o i(contador) com o array[right](o pivo) e acaba perdendo o pivo, ao envez de fixar o lugar dele
