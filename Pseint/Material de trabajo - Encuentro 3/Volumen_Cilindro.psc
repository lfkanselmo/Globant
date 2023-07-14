//Escribir un programa que calcule el volumen de un cilindro. Para ello se deberá solicitar al
//	usuario que ingrese el radio y la altura. Mostrar el resultado por pantalla.
//	volumen = ? * radio2 * altura
Algoritmo Volumen_Cilindro
	definir r, h, volumen Como Real
	Escribir "Ingrese respectivamente el radio y la altura del cilindro: "
	leer r, h
	volumen= PI*r*r*h
	Escribir "El volumen del cilindro es: ", volumen
FinAlgoritmo
