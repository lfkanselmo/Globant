//Escriba un programa que permita al usuario ingresar el valor de dos variables numéricas de
//tipo entero. Posteriormente, el programa debe intercambiar los valores de ambas variables
//y mostrar el resultado final por pantalla.
//Por ejemplo, si el usuario ingresa los valores num1 = 9 y num2 = 3, la salida a del
//programa deberá mostrar: num1 = 3 y num2 = 9
Algoritmo Intercambio
	Definir val1 Como Entero
	Definir val2 Como Entero
	Definir valaux Como Entero
	
	Escribir "Ingrese las variables: "
	Leer val1,val2
	
	valaux=val1
	val1=val2
	val2=valaux
	
	Escribir "Nuevo orden: ",val1, " --- ",val2
	
FinAlgoritmo
