//Solicitar al usuario que ingrese la base y altura de un rectángulo, y calcular y mostrar por
//pantalla el área y perímetro del mismo
//area = base * altura
//perimetro = 2 * altura + 2 * base.
Algoritmo Area_perimetroRectangulo
	definir base, h, perimetro Como Real
	Escribir "Ingrese la base y altura respectivamente del rectángulo: "
	Leer base, h
	perimetro=(2*h)+(2*base)
	
	Escribir "El perimetro es: ", perimetro
FinAlgoritmo
