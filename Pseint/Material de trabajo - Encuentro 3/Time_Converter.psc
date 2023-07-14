//A partir de una conocida cantidad de días que el usuario ingresa a través del teclado, escriba
//un programa para convertir los días en horas, en minutos y en segundos. Por ejemplo
//	1 día = 24 horas = 1440 minutos = 86400 segundos
Algoritmo Time_Converter
	definir dias Como Entero
	leer dias
	Escribir dias, " días = ", (dias*24), " Horas = ", (dias*24*60), " Minutos = ", (dias*24*60*60), " Segundos"
FinAlgoritmo
