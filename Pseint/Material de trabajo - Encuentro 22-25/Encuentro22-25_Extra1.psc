//Realizar un programa que rellene de números aleatorios una matriz a través de un
//subprograma y generar otro subprograma que muestre por pantalla la matriz final.

Algoritmo matrizRellena
	Definir matriz, n Como Entero;
	n<-Aleatorio(2,9);
	Dimension matriz(n,n);
	rellenar(matriz,n);
	ver(matriz,n);
FinAlgoritmo

//SubProceso para rellenar la matriz
SubProceso rellenar(matriz Por Referencia, n)
	Definir i, j Como Entero;
	Para i=0 Hasta n-1 Con Paso 1 Hacer
		Para j=0 Hasta n-1 Con Paso 1 Hacer
			matriz[i,j]<-Aleatorio(1,99);
		FinPara
	FinPara
FinSubProceso

//SubProceso para Imprimir la matriz
SubProceso ver(matriz Por Referencia, n)
	Definir i, j Como Entero;
	Para i=0 Hasta n-1 Con Paso 1 Hacer
		Para j=0 Hasta n-1 Con Paso 1 Hacer
			Escribir Sin Saltar "[",matriz[i,j],"] ";
		FinPara
		Escribir "";
	FinPara 
FinSubProceso
	