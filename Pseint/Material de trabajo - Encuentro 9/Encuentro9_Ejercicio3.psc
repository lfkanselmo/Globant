//Un docente de Programación tiene un listado de 3 notas registradas por cada uno de sus
//N estudiantes. La nota final se compone de un trabajo práctico Integrador (35%), una
//Exposición (25%) y un Parcial (40%). El docente requiere los siguientes informes claves
//de sus estudiantes:
//? Nota promedio final de los estudiantes que reprobaron el curso. Un estudiante
//reprueba el curso si tiene una nota final inferior a 6.5
//? Porcentaje de alumnos que tienen una nota de integrador mayor a 7.5.
//? La mayor nota obtenida en las exposiciones.
//? Total de estudiantes que obtuvieron en el Parcial entre 4.0 y 7.5.
//El programa pedirá la cantidad de alumnos que tiene el docente y en cada alumno pedirá
//las 3 notas y calculará todos informes claves que requiere el docente. 

Algoritmo Notas
	Definir nota1, nota2, nota3, notaFinal, promedioReprobados, sumaReprobados, notaMayorExpo Como Real;
	Definir nEstudiantes, i, contadorReprobados, contadorTPIM, contadorEstuParcial Como Entero;
	
	Escribir "Ingrese la cantidad de estudiantes";
	Leer nEstudiantes;
	notaMayorExpo=0;
	contadorReprobados=0;
	contadorTPIM=0;
	contadorEstuParcial=0;
	sumaReprobados=0;
	
	Para i<-1 Hasta nEstudiantes Con Paso 1 Hacer
		
		Hacer
			Escribir "Ingrese la nota del trabajo práctico integrador del estudiante ", i;
			Leer nota1;
			
			si (nota1<0 o nota1>10) Entonces
				Escribir "Valor ingresado no valido. Intente de nuevo";
			FinSi
		Mientras Que (nota1<0 o nota1>10)
		
		si (nota1>7.5) Entonces
			contadorTPIM<-contadorTPIM+1
		FinSi
		
		
		Hacer
			Escribir "Ingrese la nota de la exposición del estudiante ", i;
			Leer nota2;
			
			si (nota2<0 o nota2>10) Entonces
				Escribir "Valor ingresado no valido. Intente de nuevo";
			FinSi
		Mientras Que (nota2<0 o nota2>10)
		
		si (nota2>notaMayorExpo) Entonces
			notaMayorExpo<-nota2
		FinSi
		
		Hacer
			Escribir "Ingrese la nota del parcial del estudiante ", i;
			Leer nota3;
			
			si (nota3<0 o nota3>10) Entonces
				Escribir "Valor ingresado no valido. Intente de nuevo";
			FinSi
		Mientras Que (nota3<0 o nota3>10)
		
		Escribir "---------------------------------------------------------"
		
		si (nota3>=4.0 y nota3<=7.5) Entonces
			contadorEstuParcial<-contadorEstuParcial+1
		FinSi
		
		notaFinal<-(nota1*0.35)+(nota2*0.25)+(nota3*0.40)
		
		si (notaFinal<6.5) Entonces
			sumaReprobados<-sumaReprobados+notaFinal;
			contadorReprobados<-contadorReprobados+1;
		FinSi
		
	FinPara
	
	si (contadorReprobados==0) Entonces
		promedioReprobados=0;
	SiNo
		promedioReprobados<-sumaReprobados/contadorReprobados;
	FinSi
	
	Escribir "La nota promedio final de los estudiantes que reprobaron el curso es: ", promedioReprobados;
	Escribir "El porcentaje de alumnos que tienen una nota de integrador mayor a 7.5 es: ", trunc((contadorTPIM/nEstudiantes)*100), "%";
	Escribir "La mayor nota obtenida en las exposiciones es: ", notaMayorExpo;
	Escribir "El total de estudiantes que obtuvieron en el Parcial entre 4.0 y 7.5 es: ", contadorEstuParcial;
	Escribir "";
	Escribir "";
	Escribir "FIN";
	
	
FinAlgoritmo
