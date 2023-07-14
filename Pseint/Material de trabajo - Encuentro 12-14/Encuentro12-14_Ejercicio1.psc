//Realizar una función que calcule la suma de dos números. En el algoritmo principal le
//pediremos al usuario los dos números para pasárselos a la función. Después la función
//calculará la suma y lo devolverá para imprimirlo en el algoritmo.

Algoritmo ProgramaSuma
	Definir num1, num2 Como Entero;
	Leer num1, num2;
	Escribir "El resultado de la suma es: " , sumar(num1,num2);
FinAlgoritmo

Funcion suma <- sumar(num1 Por valor,num2 Por Valor)
	Definir suma Como Entero;
	suma<-num1+num2;
FinFuncion
