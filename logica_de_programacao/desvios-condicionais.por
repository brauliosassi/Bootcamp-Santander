programa
{
	
	//função do Algoritimo é calcula a média aritmética
	funcao inicio()
	{
		real nota1, nota2, nota3, nota4, media
		cadeia aluno

		escreva("Digite o nome do aluno:")
		leia (aluno)
		escreva("Digite o nota 1:")
		leia (nota1)
		escreva("Digite o nota 2:")
		leia (nota2)
		escreva("Digite o nota 3:")
		leia (nota3)
		escreva("Digite o nota 4:")
		leia (nota4)
		
		media = (nota1 + nota2 + nota3 + nota4)/4
		escreva("O aluno " + aluno + " obteve a média " + media)

          //verifica se a média é >=7
		se(media>=7){
			escreva("\n" + " Parabénsvocê foi aprovado")
		}
		senao{
			escreva("\n" + "Infelizmente você foi reprovado")
		}

		
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 524; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */