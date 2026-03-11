lista = [10, 1, 20, 2, 12,15,14]
n = len(lista)

print(lista)
for i in range(n):

    indiceMenorNumero = i

    for j in range(i+1,n):

        if lista[j] < lista[indiceMenorNumero]:
            indiceMenorNumero = j

    lista[i], lista[indiceMenorNumero] = lista[indiceMenorNumero], lista[i]

print(lista)