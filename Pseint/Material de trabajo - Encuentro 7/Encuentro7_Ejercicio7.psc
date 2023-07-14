//Calcular las calificaciones de un grupo de alumnos. La nota final de cada alumno se
//calcula según el siguiente criterio: la parte práctica vale el 10%; la parte de problemas
//	vale el 50% y la parte teórica el 40%. El programa leerá el nombre del alumno, las tres
//	notas obtenidas, mostrará el resultado por pantalla, y a continuación volverá a pedir los
//	datos del siguiente alumno hasta que el nombre sea una cadena vacía. Las notas deben
//	estar comprendidas entre 0 y 10, y si no están dentro de ese rango no se imprimirá el
//	promedio y se mostrará un mensaje de error.

Algoritmo Calificaciones
	Definir nombre Como Caracter;
	Definir notaPractica, notaProblemas, notaTeoria, promedio Como Real;
	Definir breaker Como Logico;
	breaker<-Verdadero;

	
	Mientras (breaker==Verdadero) Hacer

		Escribir "Ingrese nombre";
		Leer nombre;
		
		si (nombre=="") Entonces
			breaker<-Falso;
		SiNo
			Escribir "Ingrese Nota de la parte práctica";
			Leer notaPractica;
			
			Mientras (notaPractica<0 o notaPractica>10) Hacer
				Escribir "Valor incorrecto. Ingrese nuevamente la nota de la parte práctica";
				Leer notaPractica;
			FinMientras
			
			Escribir "Ingrese Nota de la parte de problemas";
			Leer notaProblemas;
			
			Mientras (notaProblemas<0 o notaProblemas>10) Hacer
				Escribir "Valor incorrecto. Ingrese nuevamente la nota de la parte de problemas";
				Leer notaProblemas;
			FinMientras
			
			Escribir "Ingrese Nota de la parte teórica";
			Leer notaTeoria;
			
			Mientras (notaTeoria<0 o notaTeoria>10) Hacer
				Escribir "Valor incorrecto. Ingrese nuevamente la nota de la parte teórica";
				Leer notaTeoria;
			FinMientras
			
			promedio<-(notaPractica*0.10) + (notaProblemas*0.5) + (notaTeoria*0.4);
			Escribir "El promedio de las notas del estudiante " , nombre , " es: " , promedio;
			
		FinSi
		
	FinMientras
	
	Escribir "FIN";
	
FinAlgoritmo
