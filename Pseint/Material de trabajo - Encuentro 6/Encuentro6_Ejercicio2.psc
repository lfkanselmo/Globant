//Realizar un programa que, dado un n�mero entero, visualice en pantalla si es par o
//impar. En caso de que el valor ingresado sea 0, se debe mostrar "el n�mero no es par ni
//impar".

Algoritmo Par_Impar
	Definir num Como Entero;
	Leer num;
	
	si(num==0) Entonces
		Escribir "el n�mero no es par ni impar"
	SiNo
		si (num mod 2 == 0) Entonces
			Escribir "El n�mero es PAR"
		SiNo
			Escribir "El n�mero es IMPAR"
		FinSi
	FinSi
	
FinAlgoritmo
