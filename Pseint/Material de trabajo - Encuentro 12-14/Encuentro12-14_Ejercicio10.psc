//Realizar una funci�n que calcule la suma de los d�gitos de un n�mero.
//Ejemplo: 25 = 2 + 5 = 7
//Nota: Para obtener el �ltimo n�mero de un digito de 2 cifras o m�s debemos pensar en el
//		resto de una divisi�n entre 10. Recordar el uso de la funci�n Mod y Trunc

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
	