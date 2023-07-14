//Dada una matriz de orden n * m (donde n y m son valores ingresados por el usuario) realizar
//un subprograma que llene la matriz de numeros aleatorios. Despues, crearemos otro
//subprograma que calcule y muestre la suma de los elementos de la matriz. Mostrar la matriz y
//los resultados por pantalla.

Algoritmo sumaMatriz
	Definir matriz,n,m Como Entero;
	Escribir "Ingrese la cantidad de filas";
	Leer n;
	Escribir "Ingrese la cantidad de columnas";
	Leer m;
	Dimension matriz[n,m];
	rellenar(matriz,n,m);
	
FinAlgoritmo

//SubProceso para rellenar la matriz
SubProceso rellenar(matriz Por Referencia,n,m)
	Definir i, j, suma Como Entero;
	suma<-0;
	Para i=0 Hasta n-1 Con Paso 1 Hacer
		Para j=0 Hasta m-1 Con Paso 1 Hacer
			matriz[i,j]<-Aleatorio(10,99);
			suma<-suma+matriz[i,j];
		FinPara
	FinPara
	ver(matriz,n,m)
	Escribir "";
	Escribir "";
	Escribir "La suma total de los números es: ", suma;
FinSubProceso

//SubProceso para imprimir la matriz
SubProceso ver(matriz Por Referencia,n,m)
	Definir i,j Como Entero;
	Para i=0 Hasta n-1 Con Paso 1 Hacer
		Para j=0 Hasta m-1 Con Paso 1 Hacer
			Escribir sin saltar "[",matriz[i,j],"] ";
		FinPara
		Escribir "";
	FinPara
FinSubProceso
