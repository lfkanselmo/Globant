//Escribir un programa que realice la búsqueda lineal de un número entero ingresado por el
//usuario en una matriz de 5x5, llena de números aleatorios y devuelva por pantalla las
//coordenadas donde se encuentra el valor, es decir en que fila y columna se encuentra. En
//caso de no encontrar el valor dentro de la matriz se debe mostrar un mensaje.

Algoritmo busqueda
	Definir matriz Como Entero;
	Dimension matriz[5,5];
	rellenar(matriz);
	buscar(matriz);
FinAlgoritmo

//SubProceso para rellenar la matriz
SubProceso rellenar(matriz Por Referencia)
	Definir i, j Como Entero;
	Para i=0 Hasta 4 Con Paso 1 Hacer
		Para j=0 Hasta 4 Con Paso 1 Hacer
			matriz[i,j]<-Aleatorio(1,25);
		FinPara
	FinPara
FinSubProceso

//Busqueda del valor
SubProceso buscar(matriz)
	Definir num, i, j, iaux, jaux Como Entero;
	Definir encontrado Como Logico;
	encontrado<-Falso;
	Escribir "Ingrese el número a buscar en la matriz";
	Leer num;
	Para i=0 Hasta 4 Con Paso 1 Hacer
		Para j=0 Hasta 4 Con Paso 1 Hacer
			si (num==matriz[i,j]) Entonces
				iaux<-i;
				jaux<-j;
				encontrado<-Verdadero;
				i<-4;
				j<-4;
			FinSi
		FinPara
	FinPara
	Escribir "";
	Escribir "";
	
	//ver la matriz completa
	Para i=0 Hasta 4 Con Paso 1 Hacer
		Para j=0 Hasta 4 Con Paso 1 Hacer
			Escribir sin saltar "[",matriz[i,j],"]   ";
		FinPara
		Escribir "";
	FinPara
	Escribir "";
	Escribir "";
	
	si(encontrado==Verdadero) Entonces
		Escribir "El número ", num, " se encuentra en la posición [", iaux+1, "] , [", jaux+1, "] en la matriz";
	SiNo
		Escribir "Lo sentimos, el número ", num, " no se encuentra en la matriz";
	FinSi
FinSubProceso
	