//A partir de una conocida cantidad de d�as que el usuario ingresa a trav�s del teclado, escriba
//un programa para convertir los d�as en horas, en minutos y en segundos. Por ejemplo
//	1 d�a = 24 horas = 1440 minutos = 86400 segundos
Algoritmo Time_Converter
	definir dias Como Entero
	leer dias
	Escribir dias, " d�as = ", (dias*24), " Horas = ", (dias*24*60), " Minutos = ", (dias*24*60*60), " Segundos"
FinAlgoritmo
