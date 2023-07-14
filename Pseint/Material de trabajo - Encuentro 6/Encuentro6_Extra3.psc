//Hacer un algoritmo que lea un número por el teclado y determine si tiene tres dígitos.

Algoritmo Tres_Digitos
	Definir num Como Entero;
	
	Leer num;
		
	si ((num>99 y num<1000) o (num<-99 y num>-1000)) Entonces
		Escribir "El número tiene 3 dígitos";
	SiNo
		Escribir "El número no tiene 3 dígitos";
	FinSi
	
FinAlgoritmo
