//Realice un programa que, dado un a�o, nos diga si es bisiesto o no. Un a�o es bisiesto
//bajo las siguientes condiciones: Un a�o divisible por 4 es bisiesto y no debe ser divisible
//	por 100. Si un a�o es divisible por 100 y adem�s es divisible por 400, tambi�n resulta
//		bisiesto.

Algoritmo Bisiesto
	Definir year Como Entero;
	Escribir "Ingrese a�o";
	Leer year;
	
	si (((year mod 4 == 0) y (year mod 100 <> 0)) o ((year mod 100 == 0) y (year mod 400 ==0))) Entonces
		Escribir "El a�o es bisiesto";
	SiNo
		Escribir "El a�o NO es bisiesto";
	FinSi
FinAlgoritmo
