//Conocido el n�mero en matem�tica PI ?, pedir al usuario que ingrese el valor del radio de
//una circunferencia y calcular y mostrar por pantalla el �rea y per�metro. Recuerde que para
//calcular el �rea y el per�metro se utilizan las siguientes f�rmulas:
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
	
	Escribir "el �rea de la circunferencia con radio ", radio, " es:", area
	Escribir "el perimetro de la circunferencia con radio ", radio, " es:", perimeter
	
	
FinAlgoritmo
