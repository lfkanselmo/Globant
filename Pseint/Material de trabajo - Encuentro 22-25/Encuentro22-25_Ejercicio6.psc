//Una matriz mágica es una matriz cuadrada (tiene igual número de filas que de columnas) que
//tiene como propiedad especial que la suma de las filas, las columnas y las diagonales es igual.

//	En la matriz de ejemplo las sumas son siempre 15. Considere el problema de construir un
//	algoritmo que compruebe si una matriz de datos enteros es mágica o no, y en caso de que
//			sea mágica escribir la suma. Además, el programa deberá comprobar que los números
//			introducidos son correctos, es decir, están entre el 1 y el 9. El usuario ingresa el tamaño de la
//			matriz que no debe superar orden igual a 10.

Algoritmo matrizMagica
	Definir matriz,n Como Entero;
	Hacer
		Escribir "Ingrese el tamaño de la matriz";
		Leer n;
	Mientras Que (n<=0 o n>10) 
	Dimension matriz[n,n];
	rellenar(matriz,n);
	magica(matriz,n);
	
FinAlgoritmo

//SubProceso para rellenar la matriz
SubProceso rellenar(matriz Por Referencia,n)
	Definir i, j Como Entero;
	Definir pass Como Logico;
	pass<-Falso;
	Escribir "Ingrese a continuación los valores de la matriz";
	Para i=0 Hasta n-1 Con Paso 1 Hacer
		Para j=0 Hasta n-1 Con Paso 1 Hacer
			Hacer
				Leer matriz[i,j];
				si (matriz[i,j]>0 y matriz[i,j]<=9) Entonces
					pass<-Verdadero;
				SiNo
					Escribir "Valor incorrecto";
					pass<-Falso;
				FinSi				
			Mientras Que (pass==Falso)			
		FinPara
	FinPara
FinSubProceso

//SubProceso para comprobar que la matriz es mágica
SubProceso magica(matriz Por Referencia,n)
	Definir comprobador, i, j, tama Como Entero;
	tama<-2+(n*2);
	Dimension comprobador[tama];
	Para i=0 Hasta tama-1 Con Paso 1 Hacer
		comprobador[i]<-0;
	FinPara
	
	Para i=0 Hasta n-1 Con Paso 1 Hacer
		Para j=0 Hasta n-1 Con Paso 1 Hacer
			si (i==j) Entonces
				comprobador[tama-2]<-comprobador[tama-2]+matriz[i,j];
				comprobador[tama-1]<-comprobador[tama-1]+matriz[i,(n-1)-j]
			FinSi
			comprobador[i]<-comprobador[i]+matriz[i,j]
			comprobador[n+i]<-comprobador[n+i]+matriz[j,i]
		FinPara
	FinPara
	
	//Mostrar la matriz
	Para i=0 Hasta n-1 Con Paso 1 Hacer
		Para j=0 Hasta n-1 Con Paso 1 Hacer
			Escribir Sin Saltar "[",matriz[i,j],"] ";
		FinPara
		Escribir "";
	FinPara
	
	Escribir "";
	Escribir "¿Es la matriz mágica?: ", comprobar(comprobador,tama);
FinSubProceso

//SubProceso para comprobar si todos los valores del comprobador son iguales
SubProceso retorno<-comprobar(comprobador Por Referencia, tama Por Valor)
	Definir retorno Como Logico
	retorno<-Verdadero;
	tama<-tama-1;
	Hacer
		si (comprobador[tama]<>comprobador[tama-1]) Entonces
			retorno<-Falso
		FinSi
		tama<-tama-1;
	Mientras Que (tama>0 y retorno==Verdadero)
FinSubProceso
