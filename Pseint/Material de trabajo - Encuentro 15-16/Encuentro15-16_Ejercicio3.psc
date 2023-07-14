//Realizar un procedimiento que permita realizar la divisi�n entre dos n�meros y muestre el
//cociente y el resto utilizando el m�todo de restas sucesivas.
//El m�todo de divisi�n por restas sucesivas consiste en restar el dividendo con el divisor hasta
//obtener un resultado menor que el divisor, este resultado es el residuo, y el n�mero de restas
//realizadas es el cociente. Por ejemplo: 50 / 13:
//		50 ? 13 = 37 una resta realizada
//		37 ? 13 = 24 dos restas realizadas
//		24 ? 13 = 11 tres restas realizadas
//	dado que 11 es menor que 13, entonces: el residuo es 11 y el cociente es 3.

Algoritmo DivicionRestada
	Definir numDividido, numDivisor Como Entero;
	Escribir "Ingrese el n�mero a dividir";
	Leer numDividido;
	Escribir "Ingrese el n�mero divisor";
	Leer numDivisor;
	
	dividir(numDividido, numDivisor);
	
FinAlgoritmo

SubProceso dividir(numDividido, numDivisor)
	Definir residuo, cociente Como Entero;
	cociente<-0;
	
	Hacer
		residuo<-numDividido-numDivisor;
		cociente<-cociente+1;
		numDividido<-residuo;
	Mientras Que (residuo>=numDivisor)
	
	Escribir "El residuo es ", residuo, " y el cociente es ", cociente;
FinSubProceso
	