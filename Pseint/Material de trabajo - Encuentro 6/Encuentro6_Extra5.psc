//Realice un programa que, dado un año, nos diga si es bisiesto o no. Un año es bisiesto
//bajo las siguientes condiciones: Un año divisible por 4 es bisiesto y no debe ser divisible
//	por 100. Si un año es divisible por 100 y además es divisible por 400, también resulta
//		bisiesto.

Algoritmo Bisiesto
	Definir year Como Entero;
	Escribir "Ingrese año";
	Leer year;
	
	si (((year mod 4 == 0) y (year mod 100 <> 0)) o ((year mod 100 == 0) y (year mod 400 ==0))) Entonces
		Escribir "El año es bisiesto";
	SiNo
		Escribir "El año NO es bisiesto";
	FinSi
FinAlgoritmo
