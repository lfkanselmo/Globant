//Realice un algoritmo que solicite al usuario una fecha y muestre por pantalla la fecha anterior.
//	Para ello se deberá utilizar un procedimiento llamado diaAnterior que reciba una fecha
//		representada a través de tres enteros dia, mes y anio, y retorne la fecha anterior. Puede
//		asumir que dia, mes y anio representan una fecha válida. Realice pruebas de escritorio para
//			los valores dia=5, mes=10, anio=2012 y para dia=1, mes=3, anio=2004.

Algoritmo fechaAnterior
	Definir day, month, year Como Entero;
	Definir bisiesto, pasar Como Logico;
	pasar<-Falso;
	

	Escribir "Ingrese año de la fecha";
	Leer year;
	
	Hacer
		Escribir "Ingrese mes de la fecha";
		Leer month;
	Mientras Que (month<1 o month>12)
	
	
	
	bisiesto<-yearBisiesto(year);
	
	//Ingreso y comprobación del día
	Hacer
		Escribir "Ingrese día";
		Leer day;
		Segun month Hacer
			1, 3, 5, 7, 8, 12:
				si (day>=1 y day<=31) Entonces
					pasar<-Verdadero;
				FinSi
				
			2:
				si (bisiesto==Verdadero) Entonces
					si (day>=1 y day<=29) Entonces
						pasar<-Verdadero;
					FinSi
				SiNo
					si (day>=1 y day<=28) Entonces
						pasar<-Verdadero;
					FinSi
				FinSi
				
			4, 6, 9, 11:
				si (day>=1 y day<=30) Entonces
					pasar<-Verdadero;
				FinSi
		FinSegun
	Mientras Que (pasar==Falso)
	
	yesterday(day,month,year,bisiesto);
	Escribir day,"/",month,"/",year;

FinAlgoritmo


//Función para comprobar si el año es bisiesto.
Funcion retorno<-yearBisiesto(year)
	Definir retorno Como Logico;
	si (((year mod 4 == 0) y (year mod 100 <> 0)) o ((year mod 100 == 0) y (year mod 400 ==0))) Entonces
		retorno<-Verdadero;
	SiNo
		retorno<-Falso;
	FinSi	
FinFuncion

//SubProceso para dia anterior
SubProceso yesterday(dia Por Referencia, mes por Referencia, anho Por Referencia, bisiesto)
	
	si (dia>1) Entonces
		dia<-dia-1;
	SiNo
		
		si (mes>1) Entonces
			mes<-mes-1;
		SiNo
			mes<-12;
			anho<-anho-1;
		FinSi
		
		Segun mes Hacer
			2:
				si (bisiesto==Falso) Entonces
					dia<-28;
				SiNo
					dia<-29;
				FinSi
				
			4,6,9,11:
				dia<-30;
			De Otro Modo:
				dia<-31;
		FinSegun
		
	FinSi
	
FinSubProceso
	