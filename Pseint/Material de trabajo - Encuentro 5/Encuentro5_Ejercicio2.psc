//Realizar un programa que pida un número y determine si ese número es par o impar.
//	Mostrar en pantalla un mensaje que indique si el número es par o impar. (para que un
//		número sea par, se debe dividir entre dos y su resto debe ser igual a 0). Nota:
//			investigar la función mod de PseInt.

Algoritmo Par_Inpar
	definir num Como Entero;
	Escribir "Ingrese número";
	Leer num;
	
	si (num mod 2 = 0) Entonces
		Escribir "El número es PAR"
	SiNo
		Escribir "El número es INPAR"
	FinSi
FinAlgoritmo
