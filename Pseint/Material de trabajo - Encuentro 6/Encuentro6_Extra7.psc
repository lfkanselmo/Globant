//El promedio de los trabajos prácticos de un curso se calcula en base a cuatro notas de las
//cuales se elimina la nota menor y se promedian las tres notas más altas. Escriba un
//programa que determine cuál es la nota eliminada y el promedio de los trabajos prácticos
//de un estudiante.

Algoritmo Promedio_Trabajos
	Definir nota1, nota2, nota3, nota4, notaMenor Como Real;
	Definir nota Como Caracter;
	Escribir "Ingrese nota 1";
	Leer nota1;
	Escribir "Ingrese nota 2";
	Leer nota2;
	Escribir "Ingrese nota 3";
	Leer nota3;
	Escribir "Ingrese nota 4";
	Leer nota4;
	
	si ((nota1<nota2) y (nota1<nota3) y (nota1<nota4)) Entonces
		notaMenor<-nota1;
		nota<-"1";
	SiNo
		si ((nota2<nota1) y (nota2<nota3) y (nota2<nota4)) Entonces
			notaMenor<-nota2;
			nota<-"2";
		SiNo
			si ((nota3<nota1) y (nota3<nota2) y (nota3<nota4)) Entonces
				notaMenor<-nota3;
				nota<-"3";
			SiNo
				notaMenor<-nota4;
				nota<-"4";
			FinSi
		FinSi
	FinSi
	
	Escribir "La nota " , nota , " es la menor, no será tomada en cuenta. Su promedio de trabajos prácticos es: " , (nota1+nota2+nota3+nota4-notaMenor)/3;
FinAlgoritmo
