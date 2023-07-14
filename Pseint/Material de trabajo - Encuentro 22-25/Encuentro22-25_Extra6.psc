//Realizar un programa que permita visualizar el resultado del producto de una matriz de
//enteros de 3x3 por un vector de 3 elementos. Los valores de la matriz y el vector pueden
//inicializarse evitando así el ingreso de datos por teclado.

Algoritmo matrizVector
	Definir matriz, vector Como Entero;
	Dimension vector[3], matriz[3,3];
	rellenarM(matriz);
	rellenarV(vector);
	Escribir "Matriz:";
	verM(matriz);
	Escribir "";
	Escribir "Vector:";
	verV(vector);
	Escribir "";
	multiplicar(matriz,vector);
	
FinAlgoritmo


//SubProceso para rellenar la matriz
SubProceso rellenarM(matriz Por Referencia)
	Definir i, j Como Entero;
	Para i=0 Hasta 2 Con Paso 1 Hacer
		Para j=0 Hasta 2 Con Paso 1 Hacer
			matriz[i,j]<-Aleatorio(1,9);
		FinPara
	FinPara
FinSubProceso

//SubProceso para rellenar vector
SubProceso rellenarV(vector Por Referencia)
	Definir i, j Como Entero;
	Para i=0 Hasta 2 Con Paso 1 Hacer
		vector[i]<-Aleatorio(1,9);
	FinPara
FinSubProceso

//SubProceso para mostrar vector
SubProceso verV(vector Por Referencia)
	Definir i Como Entero;
	Para i=0 Hasta 2 Con Paso 1 Hacer
		Escribir "[",vector[i],"] ";
	FinPara
	Escribir "";
FinSubProceso

//SubProceso para Imprimir la matriz
SubProceso verM(matriz Por Referencia)
	Definir i, j Como Entero;
	Para i=0 Hasta 2 Con Paso 1 Hacer
		Para j=0 Hasta 2 Con Paso 1 Hacer
			Escribir Sin Saltar "[",matriz[i,j],"] ";
		FinPara
		Escribir "";
	FinPara 
FinSubProceso

//SubProceso para multiplicar vector y matriz
SubProceso multiplicar (matriz, vector)
	Definir vectorFinal,i,j, suma Como Entero;
	Dimension vectorFinal[3];
	
	Para i=0 Hasta 2 Con Paso 1 Hacer
		suma<-0;
		Para j=0 Hasta 2 Con Paso 1 Hacer
			suma<-suma+(matriz[i,j]*vector[j])
		FinPara
		vectorFinal[i]<-suma;
	FinPara
	Escribir "Vector resultado:";
	verV(vectorFinal);
FinSubProceso
	