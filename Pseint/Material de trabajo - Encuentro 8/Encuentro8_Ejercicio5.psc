//Hacer un algoritmo para calcular la media de los n�meros pares e impares, s�lo se ingresar� diez n�meros.

Algoritmo Media_Par
	Definir num, sumaPar, sumaInpar, contadorPar, contadorInpar, total Como Entero;
	sumaInpar=0;
	sumaPar=0;
	contadorInpar=0;
	contadorPar=0;
	total=1;
	
	Hacer
		Escribir "Ingrese n�mero";
		Leer num;
		
		si (num mod 2 == 0) Entonces
			sumaPar<-sumaPar+num;
			contadorPar<-contadorPar+1;
		SiNo
			sumaInpar<-sumaInpar+num;
			contadorInpar<-contadorInpar+1;
		FinSi
		
		total<-total+1;
		
	Mientras Que (total<=10)
	
	Escribir "----------------------------------------------------------------"
	Escribir "La media de los n�meros pares es: ", sumaPar/contadorInpar;
	Escribir "La media de los n�meros inpares es: ", sumaInpar/contadorInpar;
FinAlgoritmo
