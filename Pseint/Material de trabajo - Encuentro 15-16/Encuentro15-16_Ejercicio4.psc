//Escribir un programa que procese una secuencia de caracteres ingresada por teclado y
//terminada en punto, y luego codifique la palabra o frase ingresada de la siguiente manera:
//	cada vocal se reemplaza por el carácter que se indica en la tabla y el resto de los caracteres
//	(incluyendo a las vocales acentuadas) se mantienen sin cambios.
// a - @
// e - #
// i - $
// o - %
// u - *

//Realice un subprograma que reciba una secuencia de caracteres y retorne la codificación
//correspondiente. Utilice la estructura "según" para la transformación.
//Por ejemplo, si el usuario ingresa: Ayer, lunes, salimos a las once y 10.
//	La salida del programa debería ser: @y#r, l*n#s, s@l$m%s @ l@s %nc# y 10.

Algoritmo Encriptador
	Definir frase Como Caracter;
	Definir cantidad Como Entero;
	
	
	Hacer
		Escribir "Ingrese la frase a encriptar. Debe terminar en punto";
		Leer frase;
		cantidad<-Longitud(frase)
	Mientras Que (Subcadena(frase,cantidad-1,cantidad-1)<>".")
	
	
	encriptar(frase);
		
FinAlgoritmo

Funcion retorno<-verificar(letra)
	Definir retorno Como Caracter;
	
	Segun letra hacer
		"a","A":
			retorno<-"@";
			
		"e","E":
			retorno<-"#";
			
		"i","I":
			retorno<-"$";
			
		"o","O":
			retorno<-"%";
			
		"u","U":
			retorno<-"*";
			
		De Otro Modo:
			retorno<-letra;
	FinSegun
FinFuncion

SubProceso encriptar(frase)
	Definir tama, i Como Entero;
	Definir encrip, letra como caracter;
	tama<-Longitud(frase);
	encrip<-"";
	
	Para i=0 Hasta tama-1 Con Paso 1 Hacer
		letra<-subcadena(frase,i,i);
		encrip<-Concatenar(encrip,verificar(letra));
	FinPara
	
	Escribir encrip;
	
FinSubProceso
	