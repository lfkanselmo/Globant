//Escriba un programa en el cual se ingrese un valor l�mite positivo, y a continuaci�n
//solicite n�meros al usuario hasta que la suma de los n�meros introducidos supere el
//l�mite inicial.

Algoritmo Limite
	definir num, limiteP, suma Como Entero;
	Escribir "Ingrese el l�mite positivo que desea: ";
	Leer limiteP;
	num<-0;
	suma<-0;
	
	si (limiteP<=0) Entonces
		Mientras (limiteP<=0) Hacer
			Escribir "El valor debe ser positivo. Intente de nuevo";
			Leer limiteP;
		FinMientras
	FinSi
	
	Mientras (suma<=limiteP) Hacer
		Escribir "Ingrese n�mero: "
		Leer num;
		suma<-suma+num;
		si (suma>limiteP) Entonces
			Escribir "L�mite superado";
		FinSi
	FinMientras
FinAlgoritmo
