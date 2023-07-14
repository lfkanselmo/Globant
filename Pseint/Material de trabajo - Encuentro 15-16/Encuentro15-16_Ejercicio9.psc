//Diseñar un procedimiento que reciba una frase, y el programa remueva todas las vocales
//repetidas. Al final el procedimiento mostrará la frase final.
//Por ejemplo:
//Entrada: "Habia una vez un barco"
//Salida: "Habi un vez n brco"
//	Se marcan en rojo las repetidas sólo para explicar la consigna. Las vocales ?e?, ?i? y ?o? quedan
//		al no estar repetidas.

Algoritmo removiendoVocal
	Definir frase Como Caracter;
	Leer frase;
	
	remover(frase);
	
FinAlgoritmo

//Para comprobar si la letra ya apareció
Funcion frase<-comprobar(letra, contador Por Referencia)
	Definir frase Como Caracter;
	frase<-"";
	si (contador==0) Entonces
		frase<-letra;
		contador<-contador+1;
	FinSi
FinFuncion

//para remover letras
SubProceso remover(frase)
	Definir a, e, i, or, u, tama, puntero Como Entero;
	Definir text, x Como Caracter;
	text<-"";
	x<-"";
	a<-0;
	e<-0;
	i<-0;
	or<-0;
	u<-0;
	tama<-Longitud(frase);
	
	Para puntero=0 Hasta tama-1 Con Paso 1 Hacer
		x<-subcadena(frase,puntero,puntero)
		Segun x Hacer
			"a":
				text<-Concatenar(text,comprobar(x,a));
				
			"e":
				text<-Concatenar(text,comprobar(x,e));
				
			"i":
				text<-Concatenar(text,comprobar(x,i));
				
			"o":
				text<-Concatenar(text,comprobar(x,or));
				
			"u":
				text<-Concatenar(text,comprobar(x,u));
			De Otro Modo:
				text<-Concatenar(text,x);
		FinSegun
	FinPara
	
	Escribir text;
	
FinSubProceso
	