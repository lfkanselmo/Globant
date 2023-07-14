//Escriba un programa que solicite al usuario números decimales mientras que el usuario
//escriba números mayores al primero que se ingresó. Por ejemplo: si el usuario ingresa
//		como primer número un 3.1, y luego ingresa un 4, el programa debe solicitar un tercer
//		número. El programa continuará solicitando valores sucesivamente mientras los valores
//			ingresados sean mayores que 3.1, caso contrario, el programa finaliza.

Algoritmo Decimales_Mayores
	Definir num, inicial Como Real;
	Escribir "Ingrese número inicial";
	Leer inicial;
	Escribir "ingrese número";
	Leer num
	
	Mientras (inicial<num) Hacer
		Escribir "ingrese número";
		Leer num
	FinMientras
	
	Escribir "FIN";
FinAlgoritmo
