//Solicitar al usuario que ingrese la base y altura de un rect�ngulo, y calcular y mostrar por
//pantalla el �rea y per�metro del mismo
//area = base * altura
//perimetro = 2 * altura + 2 * base.
Algoritmo Area_perimetroRectangulo
	definir base, h, perimetro Como Real
	Escribir "Ingrese la base y altura respectivamente del rect�ngulo: "
	Leer base, h
	perimetro=(2*h)+(2*base)
	
	Escribir "El perimetro es: ", perimetro
FinAlgoritmo
