//Crear un programa que solicite al usuario que ingrese el precio de un producto al inicio del
//año, y el precio del mismo producto al finalizar el año. El programa debe calcular cuál fue el
//porcentaje de aumento que tuvo ese producto en el año y mostrarlo por pantalla.
Algoritmo Porcentaje_Aumento
	Definir Prec_Ini, Prec_Fin, Porc Como Real
	Escribir "Ingrese el precio de inicio de año del producto"
	Leer Prec_Ini
	Escribir "Ingrese el precio de final de año del producto"
	Leer Prec_Fin
	Porc=((Prec_Fin-Prec_Ini)*100)/Prec_Ini
	Escribir "El porcentaje de aumento es: ", Porc, "%"
	
FinAlgoritmo
