//Construir un programa que simule un menú de opciones para realizar las cuatro
//	operaciones aritméticas básicas (suma, resta, multiplicación y división) con dos valores
//	numéricos enteros. El usuario, además, debe especificar la operación con el primer
//carácter de la operación que desea realizar: ?S' o ?s? para la suma, ?R? o ?r? para la resta,
//	?M? o ?m? para la multiplicación y ?D? o ?d? para la división.

Algoritmo Calculadora
	Definir num1, num2 Como Entero;
	Definir operacion Como Caracter;
	Escribir "Ingrese número 1: ";
	Leer num1;
	Escribir "Ingrese número 2: ";
	Leer num2;
	Escribir "¿Qué operación desea realizar?"
	Escribir "S para suma";
	Escribir "R para resta";
	Escribir "M para multiplicación";
	Escribir "D para división";
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
				Escribir "No se puede dividir entre cero, es una indeterminación"
			SiNo
				Escribir num1," / ",num2," = ",(num1/num2);
			FinSi
		De Otro Modo:
			Escribir "Letra ingresada no es valida";
	FinSegun
FinAlgoritmo
