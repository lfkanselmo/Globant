//Realiza un programa que s�lo permita introducir los caracteres S y N. Si el usuario
//	ingresa alguno de esos dos caracteres se deber� de imprimir un mensaje por pantalla
//	que diga "CORRECTO", en caso contrario, se deber� imprimir "INCORRECTO".

Algoritmo S_N_Correct
	definir let Como Caracter;
	Escribir "Ingrese caracter";
	Leer let; 
	si (let == "S") o (let=="N") Entonces
		Escribir "CORRECTO";
	SiNo
		Escribir "INCORRECTO";
	FinSi
FinAlgoritmo
