//Realizar una funci�n que reciba un numero ingresado por el usuario y averig�e si el n�mero
//tiene todos sus d�gitos impares (ejemplo: 333, 55, etc.). Para esto vamos a tener que separar el
//numero en partes (si es un numero de m�s de un digito) y ver si cada n�mero es par o impar.
//Nota: recordar el uso de la funci�n Mod y Trunc(). No podemos pasar el numero a cadena para
//realizar el ejercicio.

Algoritmo Inpar
	Definir num Como Entero;
	Leer num;
	
	Escribir "�Todos los digitos del n�mero ", num, " son inpares?: ", esInpar(num);
	
FinAlgoritmo

Funcion retorno<-esInpar(num)
	Definir retorno Como logico;
	Definir digito, temporal Como Entero;
	temporal<-num;
	retorno<-Verdadero;
	
	Hacer
		digito<- temporal mod 2;
		temporal<-trunc(temporal/10);
		
		si (digito==0) Entonces
			retorno<-Falso;
			temporal<-0;
		FinSi
	Mientras Que (temporal>0)
	
FinFuncion
	