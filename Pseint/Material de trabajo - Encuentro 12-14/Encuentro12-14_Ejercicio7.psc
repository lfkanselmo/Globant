//Diseñar una función que reciba un numero en forma de cadena y lo devuelva como numero
//entero. El programa podrá recibir números de hasta 3 dígitos. Nota: no poner números con
//decimales ni letras. Ejemplo: ingresando "100"(carácter) debe convertirse en 100(entero).

Algoritmo Converter
	Definir number Como Caracter;
	
	Hacer
		Escribir "Ingrese número de 3 digitos, entero";
		Leer number;
	Mientras Que (Longitud(number)>3)
		Escribir convertir(number);
FinAlgoritmo

Funcion num<-evaluar(i, digito)
	Definir num Como Entero;
	num<-0;
	
	si(i==0) Entonces
		num<-num+(digito*100);
	SiNo
		si(i==1) Entonces
			num<-num+(digito*10);
		SiNo
			si(i==2) Entonces
				num<-num+(digito*1);
			FinSi
		FinSi
	FinSi
	
FinFuncion

Funcion num<-convertir(number)
	Definir num, i, aux, suma Como Entero;
	Definir x Como Caracter;
	num<-0;
	suma<-0;
	
	
	Para i=0 Hasta Longitud(number)-1 Con Paso 1 Hacer
		x<-Subcadena(number,i,i);
		Segun x Hacer
			"1":
				
				suma<-evaluar(i,1)
				num<-num+suma;
				
			"2":
				suma<-evaluar(i,2)
				num<-num+suma;
				
			"3":
				suma<-evaluar(i,3)
				num<-num+suma;
				
			"4":
				suma<-evaluar(i,4)
				num<-num+suma;
				
			"5":
				suma<-evaluar(i,5)
				num<-num+suma;
				
			"6":
				suma<-evaluar(i,6)
				num<-num+suma;
				
			"7":
				suma<-evaluar(i,7)
				num<-num+suma;
				
			"8":
				suma<-evaluar(i,8)
				num<-num+suma;
				
			"9":
				suma<-evaluar(i,9)
				num<-num+suma;
				
			"0":
				suma<-evaluar(i,0)
				num<-num+suma;
		FinSegun
	FinPara
	
	si (Longitud(number)==2) Entonces
		num<-trunc(num/10);
	SiNo
		si (Longitud(number)==1) Entonces
			num<-trunc(num/100)
		FinSi
	FinSi
	
FinFuncion
	