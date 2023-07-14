//Dada una secuencia de números ingresados por teclado que finaliza con un ?1, por
//ejemplo: 5,3,0,2,4,4,0,0,2,3,6,0,......,-1; realizar un programa que calcule el promedio de
//	los números ingresados. Suponemos que el usuario no insertará número negativos.

Algoritmo Secuencia
	Definir num, suma, contador Como Entero;
	Definir promedio Como Real;
	suma<-0;
	promedio<-0;
	contador<-0;
	num<-0;
	
	
	Mientras (num<>(-1)) Hacer
		Escribir "Ingrese número. El -1 termina la secuencia";
		Leer num;
		Mientras (num<(-1)) Hacer
			Escribir "Deben ser números positivos. Este número no se tomara en cuenta. Intente de nuevo";
			Leer num;
		FinMientras
		suma<-suma+num;
		contador<-contador+1
	FinMientras

	promedio<-suma/contador;
	Escribir "Se ingresaron ", contador , " números en la secuencia. Su promedio es: "	, promedio;
	
FinAlgoritmo
