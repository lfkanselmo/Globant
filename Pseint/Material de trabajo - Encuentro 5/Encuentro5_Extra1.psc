//Realizar un programa que pida tres notas y determine si un alumno aprueba o reprueba
//	un curso, sabiendo que aprobará el curso si su promedio de tres calificaciones es mayor o
//		igual a 70; y reprueba en caso contrario.

Algoritmo Reprobar_Aprobar
	definir nota1, nota2, nota3 Como entero;
	Definir promedio Como Real;
	Escribir "Ingrese nota 1: ";
	Leer nota1;
	Escribir "Ingrese nota 2: ";
	leer nota2;
	Escribir "Ingrese nota 3: ";
	Leer nota3;
	
	promedio<-(nota1+nota2+nota3)/3;
	
	si (promedio>=70) Entonces
		Escribir "APRUEBA EL CURSO :D"
	SiNo
		Escribir "nO APROBÓ EL CURSO :("
	FinSi
FinAlgoritmo
