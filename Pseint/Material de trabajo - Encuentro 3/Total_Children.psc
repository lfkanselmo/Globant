//Un colegio desea saber qu� porcentaje de ni�os y qu� porcentaje de ni�as hay en el curso
//actual. Dise�ar un algoritmo para este prop�sito. Recuerda que para calcular el porcentaje
//			puedes hacer una regla de 3 simple. El programa debe solicitar al usuario que ingrese la
//			cantidad total de ni�os, y la cantidad total de ni�as que hay en el curso.
Algoritmo Total_Children
	Definir boys, girls Como Entero
	Escribir "Ingrese la cantidad total de ni�os y ni�as del curso respectivamente"
	Leer boys, girls
	Escribir "el porcentaje de ni�os es:", (boys*100)/(boys+girls), "%"
	Escribir "el porcentaje de ni�as es:", (girls*100)/(boys+girls),"%"
FinAlgoritmo
