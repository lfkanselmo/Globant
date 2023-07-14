//Rellenar una matriz, de 3 x 3, con una palabra de 9 de longitud, pedida por el usuario,
//encontrando la manera de que la frase se muestre de manera continua en la matriz.

Algoritmo palabraMatriz
	Definir matriz, palabra como caracter
	Dimension matriz[3,3];
	Hacer
		Escribir "Ingrese una palabra de 9 caracteres";
		Leer palabra;
	Mientras Que (Longitud(palabra)<>9)
	rellenar(matriz, palabra);
	ver(matriz);
FinAlgoritmo

//SubProceso para meter la palabra en la matriz
SubProceso rellenar(matriz Por Referencia, palabra)
	Definir i,j,k Como Entero
	k<-0;
	Para i=0 Hasta 2 Con Paso 1 Hacer
		Para j=0 Hasta 2 Con Paso 1 Hacer
			matriz[i,j]<-Subcadena(palabra,k,k)
			k<-k+1;
		FinPara
	FinPara
FinSubProceso

//SubProceso para imprimir la matriz
SubProceso ver(matriz Por Referencia)
	Definir i, j Como Entero;
	Para i=0 Hasta 2 Con Paso 1 Hacer
		Para j=0 Hasta 2 Con Paso 1 Hacer
			Escribir sin saltar "[",matriz[i,j],"] ";
		FinPara
		Escribir "";
	FinPara
FinSubProceso

