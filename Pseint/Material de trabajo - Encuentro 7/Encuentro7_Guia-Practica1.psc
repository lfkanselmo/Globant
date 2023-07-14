//Diseña un programa que guarde una vocal secreta en una variable, debemos pedirle al usuario
//que intente adivinar la vocal secreta, e intentará tantas veces como sea necesario hasta que la
//adivine.

Algoritmo Vocal_Secreta
	Definir vocalSecreta, vocalIngresada Como Caracter;
	vocalSecreta="a";
	vocalIngresada="";
	Mientras (vocalIngresada<>vocalSecreta) Hacer
		Escribir "Adivine la vocal secreta";
		Leer vocalIngresada;
		vocalIngresada<-Minusculas(vocalIngresada);
		Mientras  (vocalIngresada<>"a" y vocalIngresada<>"e" y vocalIngresada<>"i" y vocalIngresada<>"o" y vocalIngresada<>"u") Hacer
			Escribir "No es una vocal. Intente de nuevo";
			Leer vocalIngresada;
			vocalIngresada<-Minusculas(vocalIngresada);
		FinMientras
		
		si (vocalIngresada==vocalSecreta) Entonces
			Escribir "Adivinaste. La vocal secreta es: " , vocalSecreta;
		SiNo
			Escribir "Erró. Siga intentando"
		FinSi
	FinMientras
	
	
	
FinAlgoritmo
