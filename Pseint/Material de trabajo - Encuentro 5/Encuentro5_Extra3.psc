//Solicitar al usuario que ingrese dos números enteros y determinar si ambos son pares o
//	impares. Mostrar en pantalla un mensaje que indique "Ambos números son pares"
//	siempre y cuando cumplan con la condición. En caso contrario se deberá imprimir el
//	siguiente mensaje "Los números no son pares, o uno de ellos no es par".

Algoritmo Pares_Inpares2
	Definir num1, num2 Como Entero;
	Escribir "Ingrese el número 1: ";
	Leer num1;
	Escribir "Ingrese el número 2: ";
	Leer num2;
	
	si ((num1 mod 2 == 0) y (num2 mod 2 == 0)) Entonces
		Escribir "Ambos números son pares";
	SiNo
		Escribir "Los números no son pares, o uno de ellos no es par"
	FinSi
	
FinAlgoritmo
