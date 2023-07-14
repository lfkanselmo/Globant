//Construir un programa que simule un men� de opciones para realizar las cuatro
//	operaciones aritm�ticas b�sicas (suma, resta, multiplicaci�n y divisi�n) con dos valores
//	num�ricos enteros. El usuario, adem�s, debe especificar la operaci�n con el primer
//car�cter de la operaci�n que desea realizar: ?S' o ?s? para la suma, ?R? o ?r? para la resta,
//	?M? o ?m? para la multiplicaci�n y ?D? o ?d? para la divisi�n.

Algoritmo Calculadora
	Definir num1, num2 Como Entero;
	Definir operacion Como Caracter;
	Escribir "Ingrese n�mero 1: ";
	Leer num1;
	Escribir "Ingrese n�mero 2: ";
	Leer num2;
	Escribir "�Qu� operaci�n desea realizar?"
	Escribir "S para suma";
	Escribir "R para resta";
	Escribir "M para multiplicaci�n";
	Escribir "D para divisi�n";
	Leer operacion;
	operacion<-Minusculas(operacion);
	
	Segun operacion Hacer
		"s":
			Escribir num1," + ",num2," = ",(num1+num2);
		"r":
			Escribir num1," - ",num2," = ",(num1-num2);
		"m":
			Escribir num1," * ",num2," = ",(num1*num2);
		"d":
			si (num2==0) Entonces
				Escribir "No se puede dividir entre cero, es una indeterminaci�n"
			SiNo
				Escribir num1," / ",num2," = ",(num1/num2);
			FinSi
		De Otro Modo:
			Escribir "Letra ingresada no es valida";
	FinSegun
FinAlgoritmo
