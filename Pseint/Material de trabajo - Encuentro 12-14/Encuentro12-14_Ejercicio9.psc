//Los empleados de una fábrica trabajan en dos turnos: Diurno y Nocturno. Se desea calcular el
//jornal diario de acuerdo con las siguientes reglas:
//	a) La tarifa de las horas diurnas es de $ 90
//	b) La tarifa de las horas nocturnas es de $ 125
//	c) En caso de ser feriado, la tarifa se incrementa en un 10% si el turno es diurno y en
//		un 15% si el turno es nocturno.
//
//El programa debe solicitar la siguiente información al usuario: el nombre del trabajador, el día
//	de la semana, el turno (diurno o nocturno) y la cantidad de horas trabajadas. Además, 
//debemos preguntarle al usuario si el día de la semana (lunes, martes, miércoles, etc.) era
//		festivo o no, para poder calcular el jornal diario. Utilice una función para realizar el cálculo.

Algoritmo JornalDiario
	Definir jornada, feriado, nombre Como caracter;
	Definir dia, horasTrabajo Como Entero;
	
	Escribir "El sueldo es: $", calcular(jornada,feriado);
	
FinAlgoritmo

Funcion sueldo<-calcular(jornada,feriado)
	Definir sueldo Como Real;
	sueldo<-0;
	
		Escribir "Ingrese el nombre del trabajador";
		Leer nombre;
	
	Hacer
		Escribir "Ingrese el turno del trabajador";
		Escribir "D para diurno";
		Escribir "N para nocturno";
		Leer jornada;
		jornada<-Minusculas(jornada);
	Mientras Que (jornada<>"d" y jornada<>"n")
	
	Hacer
		Escribir "Ingrese el día de la semana";
		Escribir "1. Lunes";
		Escribir "2. Martes";
		Escribir "3. Miércoles";
		Escribir "4. Jueves";
		Escribir "5. Viernes";
		Leer dia;
	Mientras Que (dia<>1 y dia<>2 y dia<>3 y dia<>4 y dia<>5)
	
	Hacer
		Escribir "Ingrese horas trabajadas";
		Leer horasTrabajo;
	Mientras Que (horasTrabajo<0 o horasTrabajo>12)
	
	Hacer
		Escribir "Ingrese si es día feriado";
		Escribir "S para feriado";
		Escribir "N para no feriado";
		Leer feriado;
		feriado<-Minusculas(feriado);
	Mientras Que (feriado<>"s" y feriado<>"n")
	
	
		
	si (jornada=="d" y feriado=="n") Entonces
		sueldo<-(8*90);
	SiNo
		si (jornada=="d" y feriado=="s") Entonces
			sueldo<-((8*90)+(8*90*0.10));
		SiNo
			si (jornada=="n" y feriado=="n") Entonces
				sueldo<-(8*125);
			SiNo
				sueldo<-((8*125)+(8*125*0.15));
			FinSi
		FinSi
	FinSi
FinFuncion
	