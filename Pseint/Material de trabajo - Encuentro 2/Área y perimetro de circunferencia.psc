//Conocido el número en matemática PI ?, pedir al usuario que ingrese el valor del radio de
//una circunferencia y calcular y mostrar por pantalla el área y perímetro. Recuerde que para
//calcular el área y el perímetro se utilizan las siguientes fórmulas:
//	area = PI * radio2
//	perimetro = 2 * PI * radio

Algoritmo Area_Perimetro_Circulo
	definir radio Como Real
	definir area Como Real
	definir perimeter Como Real
	
	Escribir "Ingresa el valor del radio:"
	Leer radio

	area=PI*radio*radio
	perimeter=2*PI*radio
	
	Escribir "el área de la circunferencia con radio ", radio, " es:", area
	Escribir "el perimetro de la circunferencia con radio ", radio, " es:", perimeter
	
	
FinAlgoritmo
