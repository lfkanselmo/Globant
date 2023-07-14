//Escribir un programa que lea n�meros enteros hasta teclear 0 (cero). Al finalizar el
//programa se debe mostrar el m�ximo n�mero ingresado, el m�nimo, y el promedio de
//todos ellos.
//Para poder lograr, por ejemplo, el m�ximo inicializaremos una variable en cero llamada
//numeroMaximo. Luego iremos comparando cada n�mero que se ingresa con esta variable. Si es
//mayor reemplazaremos el valor de numeroMaximo. Por ejemplo si 5>0 entonces el m�ximo entre
//estos n�meros ser� 5. Si luego ingreso el n�mero 2, se eval�a 2>5 lo que resultar� falso y por lo
//tanto el valor 5 de numeroMaximo no se reemplaza. Una l�gica similar tendr� el n�mero menor.

Algoritmo Ingreso_Numeros
	Definir num, numeroMaximo, numeroMinimo, suma, contador Como Entero;
	Definir promedio Como Real;
	numeroMaximo<-0;
	numeroMinimo<-0;
	promedio<-0;
	suma<-0;
	contador<-0;
	
	Hacer
		Escribir "Ingrese n�mero";
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
		Escribir "No se ingresaron n�meros";
		promedio<-0;
	SiNo
		promedio<-suma/contador;
	FinSi
	
	Escribir "El n�mero m�ximo ingresado fue ", numeroMaximo, ". El n�mero minimo ingresado fue ", numeroMinimo, ". Y el promedio de todos los n�meros ingresados fue ", promedio;
	
FinAlgoritmo
