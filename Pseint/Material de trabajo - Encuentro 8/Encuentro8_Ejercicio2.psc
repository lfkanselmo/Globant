//Escribir un programa que lea números enteros hasta teclear 0 (cero). Al finalizar el
//programa se debe mostrar el máximo número ingresado, el mínimo, y el promedio de
//todos ellos.
//Para poder lograr, por ejemplo, el máximo inicializaremos una variable en cero llamada
//numeroMaximo. Luego iremos comparando cada número que se ingresa con esta variable. Si es
//mayor reemplazaremos el valor de numeroMaximo. Por ejemplo si 5>0 entonces el máximo entre
//estos números será 5. Si luego ingreso el número 2, se evalúa 2>5 lo que resultará falso y por lo
//tanto el valor 5 de numeroMaximo no se reemplaza. Una lógica similar tendrá el número menor.

Algoritmo Ingreso_Numeros
	Definir num, numeroMaximo, numeroMinimo, suma, contador Como Entero;
	Definir promedio Como Real;
	numeroMaximo<-0;
	numeroMinimo<-0;
	promedio<-0;
	suma<-0;
	contador<-0;
	
	Hacer
		Escribir "Ingrese número";
		Leer num;
		
		si (contador==0) Entonces
			numeroMaximo<-num;
			numeroMinimo<-num;
		FinSi
		
		si (num<>0) Entonces
			si (num>numeroMaximo) Entonces
				numeroMaximo<-num;
			FinSi
			
			si (num<numeroMinimo) Entonces
				numeroMinimo<-num
			FinSi
			
			suma<-suma+num;
			contador<-contador+1;
			
		FinSi
				
	Mientras Que (num<>0)
	
	si(contador==0) Entonces
		Escribir "No se ingresaron números";
		promedio<-0;
	SiNo
		promedio<-suma/contador;
	FinSi
	
	Escribir "El número máximo ingresado fue ", numeroMaximo, ". El número minimo ingresado fue ", numeroMinimo, ". Y el promedio de todos los números ingresados fue ", promedio;
	
FinAlgoritmo
