//Rellenar en un subproceso una matriz cuadrada con números aleatorios salvo en la diagonal
//	principal, la cual debe rellenarse con ceros. Una vez llena la matriz debe generar otro
//	subproceso para imprimir la matriz.

Algoritmo matrizDiagonal
	Definir matriz, n Como Entero;
	Escribir "Ingrese tamaño de la matriz";
	Leer n;
	Dimension matriz[n,n];
	rellenar(matriz,n);	
FinAlgoritmo

//SubProceso para rellenar la matriz
SubProceso rellenar(matriz Por Referencia, n)
	Definir i, j Como Entero;
	Para i=0 Hasta n-1 Con Paso 1 Hacer
		Para j=0 Hasta n-1 Con Paso 1 Hacer
			si (i<>j) Entonces
				matriz[i,j]<-Aleatorio(1,99);
			SiNo
				matriz[i,j]<-0;
			FinSi
		FinPara
	FinPara
	ver(matriz,n);
FinSubProceso

//SubProceso para Imprimir la matriz
SubProceso ver(matriz Por Referencia, n)
	Definir i, j Como Entero;
	Para i=0 Hasta n-1 Con Paso 1 Hacer
		Para j=0 Hasta n-1 Con Paso 1 Hacer
			Escribir sin saltar "[",matriz[i,j],"] ";
		FinPara
		Escribir "";
	FinPara
FinSubProceso