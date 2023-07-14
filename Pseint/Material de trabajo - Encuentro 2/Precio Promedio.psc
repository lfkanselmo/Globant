//Escribir un programa que calcule el precio promedio de un producto. El precio promedio se
//debe calcular a partir del precio del mismo producto en tres establecimientos distintos.
Algoritmo PrecioPromedio
	definir priceStore1 Como real
	definir priceStore2 Como real
	definir priceStore3 Como real
	definir promedio Como Real
	
	Escribir "Ingrese el precio del producto en la tienda 1, tienda 2, tienda 3: "
	leer priceStore1, priceStore2, priceStore3
	
	promedio=(priceStore1 + priceStore2 + priceStore3) / 3
	Escribir "El precio promedio es: ", promedio

FinAlgoritmo
