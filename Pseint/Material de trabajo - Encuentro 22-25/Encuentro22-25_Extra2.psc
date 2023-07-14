//Crear una matriz de orden n * m (donde n y m son valores ingresados por el usuario), llenarla
//con números aleatorios entre 1 y 100 y mostrar su traspuesta.

Algoritmo traspuesta
	Definir matriz,n,m Como Entero
	Escribir "Ingrese el número de filas";
	Leer n;
	Escribir "Ingrese el número de columnas";
	Leer m;
	Dimension matriz(n,m);
	rellenar(matriz,n,m)
	Escribir "";
	Escribir "";
	Escribir "La matriz original: "
	ver(matriz,n,m);
	Escribir "";
	Escribir "";
	Escribir "La matriz traspuesta: ";
	verTrasponer(matriz,n,m);	
FinAlgoritmo

//SubProceso para rellenar la matriz
SubProceso rellenar(matriz Por Referencia, n, m)
	Definir i, j Como Entero;
	Para i=0 Hasta n-1 Con Paso 1 Hacer
		Para j=0 Hasta m-1 Con Paso 1 Hacer
			matriz[i,j]<-Aleatorio(1,100);
		FinPara
	FinPara
FinSubProceso

//SubProceso para Imprimir la matriz original
SubProceso ver(matriz Por Referencia, n,m)
	Definir i, j Como Entero;
	Para i=0 Hasta n-1 Con Paso 1 Hacer
		Para j=0 Hasta m-1 Con Paso 1 Hacer
			Escribir Sin Saltar "[",matriz[i,j],"] ";
		FinPara
		Escribir "";
	FinPara 
FinSubProceso

//SubProceso para Imprimir la matriz traspuesta
SubProceso verTrasponer(matriz Por Referencia, n, m)
	Definir i, j Como Entero;
	Para i=0 Hasta m-1 Con Paso 1 Hacer
		Para j=0 Hasta n-1 Con Paso 1 Hacer
			Escribir Sin Saltar "[",matriz[j,i],"] ";
		FinPara
		Escribir "";
	FinPara 
FinSubProceso
