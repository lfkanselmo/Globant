//Realizar un programa que cree una matriz de 5x15 y deberemos llenar la matriz de unos y
//ceros. Llenando el marco o la delimitación externa de la matriz de unos y la parte interna de
//ceros.


Algoritmo cuadrado
	Definir matriz Como Entero
	Dimension matriz(5,15)
	dibujar(matriz);
	ver(matriz);
FinAlgoritmo

//SubProceso para dibujar el cuadrado a partir de una matriz
SubProceso dibujar(matriz Por Referencia)
	Definir i, j Como Entero
	Para i=0 Hasta 4 Con Paso 1 Hacer
		Para j=0 Hasta 14 Con Paso 1 Hacer
			si (i<>0 y i<>4 y j<>0 y j<>14) Entonces
				matriz[i,j]<-0;
			SiNo
				matriz[i,j]<-1;
			FinSi
		FinPara
	FinPara
FinSubProceso

//SubProceso para Imprimir la matriz
SubProceso ver(matriz Por Referencia)
	Definir i, j Como Entero;
	Para i=0 Hasta 4 Con Paso 1 Hacer
		Para j=0 Hasta 14 Con Paso 1 Hacer
			Escribir Sin Saltar matriz[i,j];
		FinPara
		Escribir "";
	FinPara 
FinSubProceso
	