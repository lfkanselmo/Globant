//Hacer un algoritmo que lea un n�mero por el teclado y determine si tiene tres d�gitos.

Algoritmo Tres_Digitos
	Definir num Como Entero;
	
	Leer num;
		
	si ((num>99 y num<1000) o (num<-99 y num>-1000)) Entonces
		Escribir "El n�mero tiene 3 d�gitos";
	SiNo
		Escribir "El n�mero no tiene 3 d�gitos";
	FinSi
	
FinAlgoritmo
