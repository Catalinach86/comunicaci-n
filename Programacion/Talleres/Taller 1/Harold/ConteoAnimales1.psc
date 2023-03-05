Funcion conteoAnimales ( patas, animales )
	
	pataConejo <- 4
	pataGanzo <- 2
	numeroConejos <- (patas - (animales * pataGanzo)) / 2
	numeroGanzo <- ((animales * pataConejo) - patas) / 2
	
	Si patas % 2 == 0 Entonces
		Escribir "Tenemos ", numeroConejos, " conejos y tenemos ", numeroGanzo, " ganzos."
	SiNo
		Escribir "Digito erroneo."
	Fin Si
	
Fin Funcion

Algoritmo ConteoAnimales2
	
	Escribir "Digita la cantidad patas"
	Leer patas
	Escribir "Digita la cantidad animales"
	Leer animales
	
	conteoAnimales(patas, animales);
	
FinAlgoritmo
