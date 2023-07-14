//Hacer un algoritmo para calcular la media de los números pares e impares, sólo se ingresará diez números.

Algoritmo Media_Par
	Definir num, sumaPar, sumaInpar, contadorPar, contadorInpar, total Como Entero;
	sumaInpar=0;
	sumaPar=0;
	contadorInpar=0;
	contadorPar=0;
	total=1;
	
	Hacer
		Escribir "Ingrese número";
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
	Escribir "La media de los números pares es: ", sumaPar/contadorInpar;
	Escribir "La media de los números inpares es: ", sumaInpar/contadorInpar;
FinAlgoritmo
