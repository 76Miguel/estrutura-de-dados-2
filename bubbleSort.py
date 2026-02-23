lista = [14, 2, 15, 24, 2, 5, 1, 64, 14, 4, 1, 6]
n = len(lista)


for i in range(n):


    for j in range(0, n - i - 1):

        if lista[j] > lista[j + 1]:
            aux = lista[j]
            lista[j] = lista[j + 1]
            lista[j + 1] = aux

print(lista)