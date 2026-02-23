lista = [1, 2, 3, 5, 4]
n = len(lista)

for i in range(n):
    houve_troca = False

    for j in range(0, n - i - 1):
        if lista[j] > lista[j + 1]:
            aux = lista[j]
            lista[j] = lista[j + 1]
            lista[j + 1] = aux
            houve_troca = True

    if houve_troca == False:
        break