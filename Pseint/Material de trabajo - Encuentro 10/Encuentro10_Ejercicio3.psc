//Escriba un programa que lea un número entero (altura) y a partir de él cree una escalera
//invertida de asteriscos con esa altura.

Algoritmo Escalera_Invertida
	Definir altura, i, j Como Entero;
	Escribir "Ingrese altura de la escalera invertida";
	Leer altura;
	
	Para i=altura Hasta 1 Con Paso -1 Hacer
		Para j=1 Hasta i con paso 1 Hacer
			Escribir Sin Saltar "*";
		FinPara
		Escribir "";
	FinPara
	
FinAlgoritmo
