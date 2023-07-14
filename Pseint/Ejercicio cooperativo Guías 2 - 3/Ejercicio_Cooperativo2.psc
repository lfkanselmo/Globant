//Escribir un programa que lea un número entero y devuelva el número de dígitos que
//componen ese número. Por ejemplo, si introducimos el número 12345, el programa
//deberá devolver 5. Calcular la cantidad de dígitos matemáticamente utilizando el operador
//de división.

Algoritmo Digitos
	Definir cDigitos, num, aux Como Entero;
	
	Escribir "Ingrese el número";
	Leer num;
	cDigitos=0;
	
	aux<-num;
	hacer 
		aux<-trunc(aux/10);
		cDigitos<-cDigitos+1;
	Mientras Que (aux>=1)
	
	Escribir "el número " , num , " tiene esta cantidad de digitos: ", cDigitos;
	
FinAlgoritmo
