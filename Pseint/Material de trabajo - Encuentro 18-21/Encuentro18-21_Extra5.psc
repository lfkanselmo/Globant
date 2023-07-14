Algoritmo CadenaCaracter
	Definir frase, vector, letra Como Caracter;
	Definir posi, largo Como Entero;
	Dimension vector[20];
	
	//Ingreso de la frase, se evalúa que no sobrepase el tamaño del vector
	Hacer
		Escribir "Escriba la frase";
		Leer frase;
		largo<-Longitud(frase)
	Mientras Que (largo>20)
	
	ingreso(frase,vector);
	
	Escribir "Ingrese un carácter";
	Leer letra;
	Escribir "Ingrese posición en el vector";
	Leer posi;
	
	insertar(vector, letra, posi, largo);
FinAlgoritmo

//SubProceso para ingresar la frase dentro del vector
SubProceso ingreso(frase, vector Por Referencia)
	Definir i Como Entero;
	
	Para i=0 Hasta 19 Con Paso 1 Hacer
		vector[i]<-Subcadena(frase,i,i);
	FinPara
FinSubProceso

//Función para medir cantidad de caracteres hacia la izquierda hasta el siguiente espacio
Funcion izquierda<-iContar(posicion, vector Por Referencia)
	Definir i, izquierda Como Entero;
	izquierda<-0;
	
	Para i=posicion-1 Hasta 0 Con Paso -1 Hacer
		si (vector[i]<>"" y vector[i]<>" ") Entonces
			izquierda<-izquierda+1;
		SiNo
			i<-0;
		FinSi
	FinPara
FinFuncion

//Función para medir cantidad de caracteres hacia la derecha hasta el siguiente espacio
Funcion derecha<-dContar(posicion, vector Por Referencia)
	Definir i, derecha Como Entero;	
	derecha<-0;
	
	Para i=posicion Hasta 19 Con Paso 1 Hacer
		si (vector[i]<>"" y vector[i]<>" ") Entonces
			derecha<-derecha+1;
		SiNo
			i<-19
		FinSi
	FinPara
FinFuncion

//SubProceso para ingresar la letra dentro del vector
SubProceso insertar(vector Por Referencia, letra, posicion, largo)
	Definir i Como Entero;
	si (vector[posicion-1]=="" o vector[posicion-1]==" ") Entonces
		vector[posicion-1]<-letra;
		
		Para i=0 Hasta largo-1 Con Paso 1 Hacer
			Escribir Sin Saltar vector[i];
		FinPara
		Escribir "";
	SiNo
		Definir iCantidad, dCantidad Como Entero;
		
		iCantidad<-iContar(posicion, vector);
		dCantidad<-dContar(posicion, vector);
		
		si(iCantidad>dCantidad) Entonces
			si (largo==20) Entonces
				Para i=largo-1 Hasta posicion Con Paso -1 Hacer
					vector[i]<-vector[i-1]
				FinPara
				vector[posicion-1]<-letra;
			SiNo
				Para i=largo+1 Hasta posicion Con Paso -1 Hacer
					vector[i]<-vector[i-1]
				FinPara
				vector[posicion-1]<-letra;
			FinSi
		SiNo
			Para i=0 Hasta posicion-2 Con Paso 1 Hacer
				vector[i]<-vector[i+1];
			FinPara
			vector[posicion-1]<-letra;			
		FinSi
		
		Para i=0 Hasta 19 Con Paso 1 Hacer
			Escribir Sin Saltar vector[i], "  ";
		FinPara
		Escribir "";
		
		Para i=1 Hasta 20 Con Paso 1 Hacer
			Escribir Sin Saltar i,"  ";
		FinPara
		Escribir "";
		
	FinSi
FinSubProceso