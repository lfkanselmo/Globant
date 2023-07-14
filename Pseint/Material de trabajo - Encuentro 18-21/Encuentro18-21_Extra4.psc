//Crear un vector que contenga 100 notas de 100 supuestos estudiantes, con valores entre 0 y
//20 generadas aleatoriamente mediante el uso de la función azar() o aleatorio() de PseInt.
//Luego, de acuerdo a las notas contenidas, el programa debe indicar cuántos estudiantes son:
//	a) Deficientes 0-5
//	b) Regulares 6-10
//	c) Buenos 11-15
//	d) Excelentes 16-20

Algoritmo Notas
	Definir deficientes, regulares, buenos, excelentes Como Entero;
	Definir vectorNotas Como Real;
	Dimension vectorNotas[100];
	deficientes<-0;
	regulares<-0;
	buenos<-0;
	excelentes<-0;
	
	rellenar(vectorNotas);
	evaluar(vectorNotas, deficientes, regulares, buenos, excelentes);
	Escribir "Deficientes: ",deficientes;
	Escribir "Regulares: ", regulares;
	Escribir "Buenos: ", buenos;
	Escribir "Excelentes: ", excelentes;
FinAlgoritmo

//Proceso para rellenar las notas aleatorias
SubProceso rellenar(vector Por Referencia)
	Definir i Como Entero;
	Para i=0 Hasta 99 Con Paso 1 Hacer
		vector[i]<-Aleatorio(0,20);
	FinPara
FinSubProceso

//Proceso para comprobar las notas
SubProceso evaluar(vector Por Referencia, deficientes Por Referencia, regulares Por Referencia, buenos Por Referencia, excelentes Por Referencia)
	Definir i Como Entero;

	Para i=0 Hasta 99 Con Paso 1 Hacer
		si (vector[i]>=0 y vector[i]<=5) Entonces
			deficientes<-deficientes+1;
		SiNo
			si (vector[i]>=6 y vector[i]<=10) Entonces
				regulares<-regulares+1;
			SiNo
				si (vector[i]>=11 y vector[i]<=15) Entonces
					buenos<-buenos+1;
				SiNo
					si (vector[i]>=16 y vector[i]<=20) Entonces
						excelentes<-excelentes+1;
					FinSi
				FinSi
			FinSi
		FinSi
	FinPara
FinSubProceso
	