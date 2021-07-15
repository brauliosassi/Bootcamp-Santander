programa
{
	
	funcao inicio()
	{
		
	 	escreva("Escolha uma das opções: 1- Netflix 2 - Amazon Prime 3 - HBO GO 4 - Sair")
		inteiro valor=0

		escreva("\n" + "Sua escolha:")
		leia(valor)
	 	
	 	escolha(valor)
	 	{

	 	caso 1 ://testa se o valor é igual 1
	 	escreva("Ok!Abrir Netflix")
		pare

		caso 2: 
		escreva("Ok! Abrir Amazon Prime.")
		pare

		caso 3:
		escreva("Ok! Abrir HBO GO.")
		pare

		caso 4:
		escreva("Sair do Menu")
		pare

		caso contrario:
		escreva("Você deve escolher uma das opções 1, 2 ou 3")
	 	}
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 192; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */