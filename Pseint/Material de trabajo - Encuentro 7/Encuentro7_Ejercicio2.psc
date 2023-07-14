//Escriba un programa en el cual se ingrese un valor límite positivo, y a continuación
//solicite números al usuario hasta que la suma de los números introducidos supere el
//límite inicial.

Algoritmo Limite
	definir num, limiteP, suma Como Entero;
	Escribir "Ingrese el límite positivo que desea: ";
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
		Escribir "Ingrese número: "
		Leer num;
		suma<-suma+num;
		si (suma>limiteP) Entonces
			Escribir "Límite superado";
		FinSi
	FinMientras
FinAlgoritmo
