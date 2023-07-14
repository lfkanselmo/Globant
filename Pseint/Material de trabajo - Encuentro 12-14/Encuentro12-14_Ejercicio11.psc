//Realizar una función que reciba un numero ingresado por el usuario y averigüe si el número
//tiene todos sus dígitos impares (ejemplo: 333, 55, etc.). Para esto vamos a tener que separar el
//numero en partes (si es un numero de más de un digito) y ver si cada número es par o impar.
//Nota: recordar el uso de la función Mod y Trunc(). No podemos pasar el numero a cadena para
//realizar el ejercicio.

Algoritmo Inpar
	Definir num Como Entero;
	Leer num;
	
	Escribir "¿Todos los digitos del número ", num, " son inpares?: ", esInpar(num);
	
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
	