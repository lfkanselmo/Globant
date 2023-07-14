//Realizar un programa que muestre la cantidad de números que son múltiplos de 2 o de 3
//comprendidos entre 1 y 100

Algoritmo Multiplos
	Definir num, i, cMultiplos2, cMultiplos3 Como Entero;
	cMultiplos2=0;
	cMultiplos3=0;
	
	Para i<-1 Hasta 100 Con Paso 1 Hacer
		
		si (i mod 2 == 0) Entonces
			cMultiplos2<-cMultiplos2+1;
		FinSi
		
		si (i mod 3 == 0) Entonces
			cMultiplos3<-cMultiplos3+1;
		FinSi
	FinPara
	
	Escribir "la cantidad de multiplos de 2 entre 1 - 100 es: ", cMultiplos2;
	Escribir "la cantidad de multiplos de 3 entre 1 - 100 es: ", cMultiplos3;
		
FinAlgoritmo
