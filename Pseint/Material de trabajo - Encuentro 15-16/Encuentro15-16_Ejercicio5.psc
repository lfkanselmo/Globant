//Crea un procedimiento "convertirEspaciado", que reciba como argumento un texto y muestra
//una cadena con un espacio adicional tras cada letra.
//Por ejemplo, "Hola, tú" devolverá "H o l a , t ú ". Crea un programa principal donde se use
//dicho procedimiento.

Algoritmo espaciado
	Definir frase Como Caracter;
	Leer frase;
	
	convertirEspaciado(frase);
	
FinAlgoritmo


SubProceso convertirEspaciado(frase)
	Definir textoEspaciado Como Caracter
	Definir i, tama Como Entero;
	textoEspaciado<-"";
	tama<-Longitud(frase);
	
	Para i=0 Hasta tama Con Paso 1 Hacer
		textoEspaciado<-Concatenar(textoEspaciado, Concatenar(Subcadena(frase,i,i)," "));		
	FinPara
	
	Escribir textoEspaciado;
	
FinSubProceso
	