//Realizar un programa que lea 10 números reales por teclado, los almacene en un arreglo y
//muestre por pantalla la suma, resta y multiplicación de todos los números ingresados al
//arreglo.

Algoritmo Calculadora
	Definir suma, resta, multiplicacion, i Como Entero;
	Definir vector Como Entero;
	Dimension vector[10];
	suma<-0;
	resta<-0;
	multiplicacion<-1;
	
	Para i=0 Hasta 9 Con Paso 1 Hacer
		Escribir "Ingrese número";
		Leer vector[i];
		suma<-suma+vector[i];
		resta<-resta-vector[i];
		multiplicacion<-multiplicacion*vector[i];
	FinPara
	
	Para i=0 Hasta 9 Con Paso 1 Hacer
		si (i==9) Entonces
			Escribir "[",vector[i],"]";
		SiNo
			Escribir Sin Saltar "[",vector[i],"],";
		FinSi
	FinPara
	Escribir "";
	Escribir "La suma es: ", suma;
	Escribir "La resta es: ", resta;
	Escribir "La multiplicación es: ", multiplicacion;
FinAlgoritmo
