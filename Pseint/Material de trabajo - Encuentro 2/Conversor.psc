//A partir de una conocida cantidad de metros que el usuario ingresa a trav�s del teclado se
//debe obtener su equivalente en cent�metros, en mil�metros y en pulgadas.

Algoritmo Conversor
	Definir meters Como Real
	Definir centimeters Como Real
	Definir millimeters Como Real
	Definir inches Como Real
	
	Escribir "Ingrese la cantidad de metros a convertir: "
	Leer meters
	centimeters=meters*100
	millimeters=meters*1000
	inches=centimeters/2.54
	
	Escribir meters," metro equivalen a ", centimeters, " centimetros, ", millimeters, " milimetros y ",inches, " pulgadas"
	
FinAlgoritmo
