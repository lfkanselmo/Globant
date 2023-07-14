//Disponemos de un vector unidimensional de 20 elementos de tipo carácter. Se pide
//desarrollar un programa que:
//	a) Pida una frase al usuario y luego ingrese la frase dentro del arreglo letra por letra.
//Ayuda: utilizar la función Subcadena de PSeInt.
//	b) Una vez completado lo anterior, pedirle al usuario un carácter cualquiera y una
//	posición dentro del arreglo, y el programa debe intentar ingresar el carácter en la
//	posición indicada, si es que hay lugar (es decir la posición está vacía o es un espacio
//	en blanco). De ser posible debe mostrar el vector con la frase y el carácter ingresado,
//	de lo contrario debe darle un mensaje al usuario de que esa posición estaba ocupada.

Algoritmo CadenaCaracter
	Definir frase, vector, letra Como Caracter;
	Definir posi Como Entero;
	Dimension vector[20];
	
	//Ingreso de la frase, se evalúa que no sobrepase el tamaño del vector
	Hacer
		Escribir "Escriba la frase";
		Leer frase;
	Mientras Que (Longitud(frase)>20)
	
	ingreso(frase,vector);
	
	Escribir "Ingrese un carácter";
	Leer letra;
	Escribir "Ingrese posición en el vector";
	Leer posi;
	
	insertar(vector, letra, posi);
FinAlgoritmo

//SubProceso para ingresar la frase dentro del vector
SubProceso ingreso(frase, vector Por Referencia)
	Definir i Como Entero;
	
	Para i=0 Hasta 19 Con Paso 1 Hacer
		vector[i]<-Subcadena(frase,i,i);
	FinPara
FinSubProceso

//SubProceso para ingresar la letra dentro del vector
SubProceso insertar(vector Por Referencia, letra, posicion)
	Definir i Como Entero;
	si (vector[posicion-1]=="" o vector[posicion-1]==" ") Entonces
		vector[posicion-1]<-letra;
		
		Para i=0 Hasta 19 Con Paso 1 Hacer
			Escribir Sin Saltar vector[i];
		FinPara
		Escribir "";
	SiNo
		Escribir "Lo sentimos, la posición ", posicion, " del vector está ocupada";
	FinSi
FinSubProceso
	