//Escribir un programa que calcule cuántos dígitos tiene un número entero positivo sin
//convertirlo a cadena (pista: se puede hacer dividiendo varias veces entre 10). Nota:
//investigar la función trunc().

Algoritmo sin_titulo
	Definir num,c Como Entero
	c=1
	Escribir "ingrese un numero entero positivo"
	Leer num
	Mientras (num>9) Hacer
		num = trunc(num/10)
		c = c +1
	FinMientras
	Escribir "el numero tiene ", c, " digitos"
FinAlgoritmo