//Crear un subproceso que rellene dos arreglos de tama�o n, con n�meros aleatorios. Despu�s,
//	hacer una funci�n que reciba los dos arreglos y diga si todos sus valores son iguales o no. La
//			funci�n debe devolver el resultado de est� validaci�n, para mostrar el mensaje en el
//			algoritmo. Nota: recordar el uso de las variables de tipo l�gico.

Algoritmo vectoresIguales
	Definir vector1, vector2, n Como Entero;
	Escribir "Ingrese la cantidad de elementos que tendr�n los vectores";
	Leer n;
	Dimension vector1[n];
	Dimension vector2[n];
	
	rellenar(n, vector1);
	rellenar(n, vector2);
	
	Escribir "�Todos los valores de ambos vectores son iguales?: ", evaluar(vector1, vector2, n);
FinAlgoritmo

//SubProceso para rellenar los vectores
SubProceso rellenar(n, vector Por Referencia)
	Definir i como entero;
	
	Para i=0 Hasta n-1 Con Paso 1 Hacer
		vector[i]<-Aleatorio(-100,100);
	FinPara
FinSubProceso

//SubProceso para evaluar la igualdad de los vectores
Funcion retorno<-evaluar(vector1 Por Referencia, vector2 Por Referencia, n)
	Definir i Como Entero;
	Definir retorno Como Logico;
	retorno<-Verdadero;
	
	Para i=0 hasta n-1 Con Paso 1 Hacer
		si (vector1[i]<>vector2[i]) Entonces
			retorno<-Falso;
			i=n-1;
		FinSi
	FinPara
FinSubProceso
