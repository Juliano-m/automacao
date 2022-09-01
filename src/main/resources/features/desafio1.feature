#language: pt

Funcionalidade: Adionando um produto ao carrinho
  
  Cenario: Produto adicionado mantem seu valor inicial
   	Dado acesso ao site "https://www.kabum.com.br"
		Quando realizo a busca por um item em específico
		E o item é retornado
		E adiciono o mesmo ao meu carrinho de compras
		Entao o item é adicionado com sucesso
		E seu valor/quantidade correspondem ao esperado de acordo 
		com o mostrado na janela de exibição anterior

 