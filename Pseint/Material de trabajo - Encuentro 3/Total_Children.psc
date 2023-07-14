//Un colegio desea saber qué porcentaje de niños y qué porcentaje de niñas hay en el curso
//actual. Diseñar un algoritmo para este propósito. Recuerda que para calcular el porcentaje
//			puedes hacer una regla de 3 simple. El programa debe solicitar al usuario que ingrese la
//			cantidad total de niños, y la cantidad total de niñas que hay en el curso.
Algoritmo Total_Children
	Definir boys, girls Como Entero
	Escribir "Ingrese la cantidad total de niños y niñas del curso respectivamente"
	Leer boys, girls
	Escribir "el porcentaje de niños es:", (boys*100)/(boys+girls), "%"
	Escribir "el porcentaje de niñas es:", (girls*100)/(boys+girls),"%"
FinAlgoritmo
