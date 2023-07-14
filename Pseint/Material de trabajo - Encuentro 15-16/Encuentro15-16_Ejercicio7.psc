//Crear un programa que dibuje una escalera de números, donde cada línea de números
//comience en uno y termine en el número de la línea. Solicitar la altura de la escalera al usuario
//al comenzar. Ejemplo: si se ingresa el número 3:
//1
//12
//123

Algoritmo Escalera
	Definir altura Como Entero;
	
	Hacer
		Escribir "Ingrese valor entero positivo";
		Leer altura;
	Mientras Que (altura<=0)
	
	dibuje(altura);	
	
FinAlgoritmo

SubProceso dibuje(altura)
	Definir i Como Entero;
	Definir text Como Caracter;
	text<-"";
	
	Para i=1 Hasta altura Con Paso 1 Hacer
		text<-Concatenar(text,ConvertirATexto(i))
		Escribir text;
	FinPara

FinSubProceso
	