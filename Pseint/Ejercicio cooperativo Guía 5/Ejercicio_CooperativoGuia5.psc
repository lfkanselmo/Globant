Algoritmo desafioGuia5
	Definir filas, columnas Como Entero;
	Definir matriz, vectorPalabras Como Caracter;
	Dimension matriz(9,12);
	
	filas<-9
	columnas<-12;
	
	//rellenar la matriz con *
	inicializarMatriz(matriz,filas,columnas);
	agregarPalabra(matriz);
	Escribir "Matriz con las palabras: ";
	imprimirMatriz(matriz,filas,columnas);
	acomodarPalabra(matriz);
	Escribir "";
	Escribir "Matriz reorganizada: ";
	imprimirMatriz(matriz,filas,columnas);	
FinAlgoritmo

//SubProceso para inicializar la matriz con *
SubProceso inicializarMatriz(matriz Por Referencia, filas, columnas)
	Definir i,j Como Entero;
	
	Para i=0 Hasta filas-1 Con Paso 1 Hacer
		Para j=0 Hasta columnas-1 Con Paso 1 Hacer
			matriz[i,j]<-"*";
		FinPara
	FinPara
FinSubProceso

//SubProceso para imprimir la matriz
SubProceso imprimirMatriz(matriz Por Referencia, filas, columnas)
	Definir i,j Como Entero;
	Para i=0 Hasta filas-1 Con Paso 1 Hacer
		Para j=0 Hasta columnas-1 Con Paso 1 Hacer
			Escribir Sin Saltar matriz[i,j], " ";
		FinPara
		Escribir "";
	FinPara
FinSubProceso

//Funcion para buscar la primera r de cada palabra
Funcion retorno<-buscarR(matriz,i)
	Definir retorno,j Como Entero
	
	Para j=0 Hasta 11 Con Paso 1 Hacer
		si (matriz[i,j] == "r") Entonces
			retorno<-j;
			j<-11;
		FinSi
	FinPara
FinFuncion

//SubProceso agregar palabra
SubProceso agregarPalabra(matriz)
	Definir i,j Como Entero;
	Definir vectorPalabras Como Caracter;
	Dimension vectorPalabras(9);
	
	//rellenar el vector con las palabras
	vectorPalabras[0]<-"vector";
	vectorPalabras[1]<-"matriz";
	vectorPalabras[2]<-"programa";
	vectorPalabras[3]<-"subprograma";
	vectorPalabras[4]<-"subproceso";
	vectorPalabras[5]<-"variable";
	vectorPalabras[6]<-"entero";
	vectorPalabras[7]<-"para";
	vectorPalabras[8]<-"mientras";
	Para i=0 Hasta 8 Con Paso 1 Hacer
		Para j=0 Hasta Longitud(vectorPalabras[i])-1 Con Paso 1
			matriz[i,j]<-Subcadena(vectorPalabras[i],j,j);
		FinPara
	FinPara
FinSubProceso

//SubProceso para acomodar las palabras de tal manera que la primera r quede en la posición 5
SubProceso acomodarPalabra(matriz Por Referencia)
	Definir i,j, posi Como Entero;

	Para i=0 Hasta 8 Con Paso 1 Hacer
		posi<-5-buscarR(matriz,i);
		Para j=11 Hasta 0 Con Paso -1 Hacer
			si (matriz[i,j]<>"*") Entonces
				matriz[i,j+posi]<-matriz[i,j];
				si (j<posi) Entonces
					matriz[i,j]<-"*";
				FinSi
			FinSi
		FinPara
	FinPara
	
FinSubProceso
	