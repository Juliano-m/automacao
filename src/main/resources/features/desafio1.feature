#language: pt

Funcionalidade: Adionando um produto ao carrinho
  
  Cenario: Produto adicionado mantem seu valor inicial
   	Dado acesso ao site "https://www.kabum.com.br"
		Quando realizo a busca por um item em especifico
		E o item eh retornado
		E adiciono o mesmo ao meu carrinho de compras
		Entao o item eh adicionado com sucesso
		E seu valor e quantidade correspondem ao valor mostrado na janela de exibicao anterior

 