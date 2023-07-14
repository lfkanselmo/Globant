//Programe una función que calcule el producto de un arreglo de números enteros. Para esto
//	imagine, por ejemplo, que para un vector V de tamaño 4, el producto de todos los valores es
//		igual a (V[1]*V[2]*V[3]*V[4])

Algoritmo productoVector
	Definir vector,n, i Como Entero;
	Escribir "Ingrese la cantidad de valores del vector";
	Leer n;
	Dimension vector[n];
	
	rellenar(vector, n);
	Para i=0 Hasta n-1 Con Paso 1 Hacer
		Escribir Sin Saltar "[",vector[i],"] "
	FinPara
	Escribir "";
	Escribir "";
	Escribir "el producto de los valores del vector es: ", multiplicar(vector,n);
	
FinAlgoritmo

//Proceso para rellenar el vector con números aleatorios.
SubProceso rellenar(vector Por Referencia, n)
	Definir i Como Entero;
	Para i=0 Hasta n-1 Con Paso 1 Hacer
		vector[i]<-Aleatorio(1,10);
	FinPara
FinSubProceso

//función producto
Funcion retorno<-multiplicar(vector Por Referencia, n)
	Definir retorno, i Como Entero;
	retorno<-1;
	Para i=0 Hasta n-1 Con Paso 1 Hacer
		retorno<-retorno*vector[i];
	FinPara
FinFuncion
	