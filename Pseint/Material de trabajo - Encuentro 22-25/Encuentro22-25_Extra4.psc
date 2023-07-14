//Realizar un programa que calcule la multiplicación de dos matrices de enteros de 3x3.
//Inicialice las matrices para evitar el ingreso de datos por teclado.

Algoritmo producto
	Definir matriz1, matriz2 Como Entero
	Dimension matriz1(3,3),matriz2(3,3)
	rellenar(matriz1);
	rellenar(matriz2);
	Escribir "";
	Escribir "Primera matriz: ";
	Escribir "";
	ver(matriz1);
	Escribir "";
	Escribir "Segunda matriz: ";
	Escribir "";
	ver(matriz2);
	Escribir "";
	productoMatrices(matriz1,matriz2);
FinAlgoritmo

//SubProceso para rellenar la matriz
SubProceso rellenar(matriz Por Referencia)
	Definir i, j Como Entero;
	Para i=0 Hasta 2 Con Paso 1 Hacer
		Para j=0 Hasta 2 Con Paso 1 Hacer
			matriz[i,j]<-Aleatorio(1,2);
		FinPara
	FinPara
FinSubProceso

//SubProceso para trasponer matriz
SubProceso trasponer(matriz Por Referencia)
	
FinSubProceso

//SubProceso para Imprimir la matriz
SubProceso ver(matriz Por Referencia)
	Definir i, j Como Entero;
	Para i=0 Hasta 2 Con Paso 1 Hacer
		Para j=0 Hasta 2 Con Paso 1 Hacer
			Escribir Sin Saltar "[",matriz[i,j],"] ";
		FinPara
		Escribir "";
	FinPara 
FinSubProceso

//SubProceso para realizar el producto de matrices
SubProceso productoMatrices(matriz1 Por Referencia, matriz2 Por Referencia)
	Definir i,j,k, matrizFinal, suma Como Entero
	Dimension matrizFinal(3,3);
	suma<-0;
	
	Para k=0 Hasta 2 Con Paso 1 Hacer
		Para i=0 Hasta 2 Con Paso 1 Hacer
			suma<-0;
			Para j=0 Hasta 2 Con Paso 1 Hacer
				suma<-suma+(matriz1[k,j]*matriz2[j,i]);
			FinPara
			matrizFinal[k,i]<-suma;
		FinPara
	FinPara
	
	
	
	Escribir "";
	Escribir "Matriz final: ";
	ver(matrizFinal);
	
FinSubProceso
