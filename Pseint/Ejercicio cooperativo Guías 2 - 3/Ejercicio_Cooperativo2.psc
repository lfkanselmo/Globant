//Escribir un programa que lea un n�mero entero y devuelva el n�mero de d�gitos que
//componen ese n�mero. Por ejemplo, si introducimos el n�mero 12345, el programa
//deber� devolver 5. Calcular la cantidad de d�gitos matem�ticamente utilizando el operador
//de divisi�n.

Algoritmo Digitos
	Definir cDigitos, num, aux Como Entero;
	
	Escribir "Ingrese el n�mero";
	Leer num;
	cDigitos=0;
	
	aux<-num;
	hacer 
		aux<-trunc(aux/10);
		cDigitos<-cDigitos+1;
	Mientras Que (aux>=1)
	
	Escribir "el n�mero " , num , " tiene esta cantidad de digitos: ", cDigitos;
	
FinAlgoritmo
