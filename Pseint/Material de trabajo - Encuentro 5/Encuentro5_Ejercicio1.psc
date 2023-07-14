//Realiza un programa que sólo permita introducir los caracteres S y N. Si el usuario
//	ingresa alguno de esos dos caracteres se deberá de imprimir un mensaje por pantalla
//	que diga "CORRECTO", en caso contrario, se deberá imprimir "INCORRECTO".

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
