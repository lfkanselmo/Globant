//Realizar una función que calcule la suma de los dígitos de un número.
//Ejemplo: 25 = 2 + 5 = 7
//Nota: Para obtener el último número de un digito de 2 cifras o más debemos pensar en el
//		resto de una división entre 10. Recordar el uso de la función Mod y Trunc

Algoritmo sumaDigitos
	Definir num Como Entero;
	Leer num;
	
	Escribir "La suma de los digitos de ", num, " da: ", digitoSuma(num);
	
FinAlgoritmo

Funcion suma<-digitoSuma(num)
	Definir suma, temporal, digito Como Entero;
	suma<-0;
	temporal<-num;
	
	si (temporal<0) Entonces
		temporal<-temporal*(-1);
	FinSi
	
	Hacer
				
		digito<-temporal mod 10;
		temporal<-trunc(temporal/10);
		suma<-suma+digito;		
		
	Mientras Que (temporal>0)
	
	si (num<0) Entonces
		suma<-suma*(-1);
	FinSi
	
FinFuncion
	