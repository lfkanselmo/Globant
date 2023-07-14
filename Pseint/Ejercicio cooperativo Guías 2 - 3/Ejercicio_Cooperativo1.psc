//Realizar un programa que lea 5 números (comprendidos entre 1 y 20) e imprima el número
//ingresado seguido de tantos asteriscos como indique su valor. Por ejemplo:
//	5 *****
//	3 ***
//	11 ***********
//	2 **
//	9 *********

Algoritmo sin_titulo
	Definir num, i, j Como Entero;
	
	
	
	Para j<-1 Hasta 5 Con Paso 1 Hacer
		
		Hacer
			Escribir "Ingrese un número entre 1 y 20";
			Leer num;
		Mientras Que (num<=1 o num>=20)
		
		Escribir Sin Saltar num, " ";
		para i<-1 Hasta num Con Paso 1 Hacer
			Escribir Sin Saltar "*";
		FinPara
		Escribir "";
	FinPara
	
FinAlgoritmo
