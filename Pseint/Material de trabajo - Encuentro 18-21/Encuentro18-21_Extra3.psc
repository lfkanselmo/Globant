//Crear dos vectores que tengan el mismo tamaño (el tamaño se pedirá por teclado) y
//almacenar en uno de ellos nombres de personas como cadenas. En el segundo vector se
//debe almacenar la longitud de cada uno de los nombres (para ello puedes usar la función
//	Longitud() de PseInt). Mostrar por pantalla cada uno de los nombres junto con su longitud.

Algoritmo vectoresNombres
	Definir vectorNombre Como Caracter;
	Definir vectorLongitud, n, i Como Entero;
	Escribir "Ingrese la cantidad de nombres a guardar";
	Leer n;
	Dimension vectorLongitud[n],vectorNombre[n]
	
	//Ingresar los nombres y sus longitudes
	Para i=0 Hasta n-1 Con Paso 1 Hacer
		Escribir "Ingrese nombre";
		Leer vectorNombre[i];
		vectorLongitud[i]<-Longitud(vectorNombre[i])
	FinPara
	
	//imprimir los vectores
	Para i=0 Hasta n-1 Con Paso 1 Hacer
		Escribir vectorNombre[i]," --- ",vectorLongitud[i]
	FinPara
FinAlgoritmo
