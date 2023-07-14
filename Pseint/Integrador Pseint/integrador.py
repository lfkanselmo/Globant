#función para rellenar la matriz con la muestra
def rellenar(muestra,m):
    matriz = []
    k = 0
    for i in range(m):
        filas = []
        for j in range(m):
            filas.append(muestra[k])
            k = k + 1
        matriz.append(filas)
    
    ver(matriz,m)
    return matriz

#función para comprobar si la matriz tiene el Gen Z
def comprobar(matriz,m):
    base1 = matriz[0][0]
    base2 = matriz[0][(m-1)]
    genZ = False

    for i in range(m):
        if ((matriz[i][i] == base1) and (matriz[i][(m-1)-i] == base2)):
            genZ = True
        else:
            genZ = False
            break    

    if (genZ==True):
        print("La muestra contiene el Gen Z")
    else:
        print("La muestra no contiene el Gen Z")

#función para imprimir la matriz
def ver(matriz,m):
    for i in range(m):
        for j in range(m):
            print(f"[{matriz[i][j]}]" , end=" ")
        print("\n")

muestra = "ACDDCADBCDABDBBA"
muestra = muestra.upper()
m = round((len(muestra))**(1/2))

if (m*m == len(muestra)):
    matriz = rellenar(muestra,m)
    comprobar(matriz,m)
else:
    print("Muestra no valida")