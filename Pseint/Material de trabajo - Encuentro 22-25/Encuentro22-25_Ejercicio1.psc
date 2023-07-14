//Realizar un programa que rellene una matriz de 3x3 con 9 valores ingresados por el usuario y
//los muestre por pantalla.

Algoritmo Matriz33
	Definir matriz Como Entero;
	Dimension matriz[3,3];
	rellenar(matriz);
	ver(matriz);
FinAlgoritmo

//SubProceso para rellenar la matriz
SubProceso rellenar(matriz Por Referencia)
	Definir i, j Como Entero;
	Para i=0 Hasta 2 Con Paso 1 Hacer
		Para j=0 Hasta 2 Con Paso 1 Hacer
			Escribir "Ingrese el valor para la posición ",i+1," , ",j+1,": ";
			Leer matriz[i,j];
		FinPara
	FinPara
FinSubProceso

//SubProceso para visualizar la matriz
SubProceso ver(matriz Por Referencia)
	Definir i, j Como Entero;
	Para i=0 Hasta 2 Con Paso 1 Hacer
		Para j=0 Hasta 2 Con Paso 1 Hacer
			Escribir sin saltar "[",matriz[i,j],"] ";
		FinPara
		Escribir "";
	FinPara
FinSubProceso
