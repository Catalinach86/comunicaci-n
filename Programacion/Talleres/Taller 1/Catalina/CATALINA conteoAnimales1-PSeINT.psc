Funcion ConteoAnimales ( patas, animales )
	pata_conejo <- 4
	pata_ganso <- 2
	Si patas % 2 == 0 Entonces
		conejo <- (patas - (animales * patas_ganso))/ 2
		ganso<- ((animales * pata_conejo)- patas)/2
		Escribir "tenemos ", conejo , "conejos y " , ganso " gansos" 

	SiNo
		Escribir "digito err�neo"
	Fin Si
	
Fin Funcion

Algoritmo conteoAnimales1
	Escribir "Digita el n�mero de patas"
	Leer patas
	Escribir "Digita el n�mero de animales"
	leer animales
	ConteoAnimales(patas, animales)
	
	
	
FinAlgoritmo
