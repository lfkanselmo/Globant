//Realizar un programa que pida un n�mero y determine si ese n�mero es par o impar.
//	Mostrar en pantalla un mensaje que indique si el n�mero es par o impar. (para que un
//		n�mero sea par, se debe dividir entre dos y su resto debe ser igual a 0). Nota:
//			investigar la funci�n mod de PseInt.

Algoritmo Par_Inpar
	definir num Como Entero;
	Escribir "Ingrese n�mero";
	Leer num;
	
	si (num mod 2 = 0) Entonces
		Escribir "El n�mero es PAR"
	SiNo
		Escribir "El n�mero es INPAR"
	FinSi
FinAlgoritmo
