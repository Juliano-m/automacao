# Teste Automatizado com Selenium

No primeiro desafio, foi criado um script de teste para o site https://www.kabum.com.br/. Onde, ao buscar por um item em específico, sendo este retornado, adicionamos o mesmo ao carrinho de compras. Sendo este, adicionado com sucesso, verificamos se o valor/quantidade final do item adicionado é igual ao valor/quantidade do item selecionado inicialmente.


https://user-images.githubusercontent.com/71046387/186738485-ecd2b2a0-7bc5-41a8-a367-d94a05579f96.mp4


No segundo desafio, foi testado a validação de um alert no site https://demo.automationtesting.in/Alerts.html.

## Começando

As seguintes instruções fornecerão alguns parâmetros básicos para execução do projeto em sua máquina local.

### Pré-requisitos

Estes foram os principais itens utilizadas e suas respectivas versões: 

    Eclipse IDE for Java Developers - Version: 2022-06 (4.24.0)
    Java SE Development Kit - Version: 18.0.2.1
    ChromeDriver - Version: 104.0.5112.79
    Google Chrome - Version: 104.0.5112.102 (Versão oficial) 64 bits
    Java - Version: 11
    junit - Version: 5.6.2
    Selenium - Version: 3.141.59

### Instalação

Um guia passo a passo que lhe dirá como colocar o ambiente de desenvolvimento em funcionamento.

- Primeiro passo: Baixar os arquivos do projeto na sua máquina local.
- Segundo passo: Após abrir o Eclipse IDE, importar o projeto como projeto maven existente indicando o local do arquivo.
- Terceiro passo: Verificar no arquivo pom.xml se as dependências do JUnit e Selenium estão na mesma versão do projeto.
- Quarto passo: Verificar se a versão do ChromeDriver, que está dentro da pasta drivers na raiz do projeto, é correspondente a versão do navegador Google Chrome instalado na sua máquina.

## Rodando o Teste

- Primeiro: na pasta src/test/java, dentro do pacote temos dois arquivos. No arquivo Desafio1, pressione o botão direito e selecione Run As. 
- Segundo: selecione a opção JUnit Test para iniciar o teste.

![Run_As_Desafio1](https://user-images.githubusercontent.com/71046387/186770831-c78915c2-4537-4c78-9629-661419aab165.png)

- Por fim: Aguarde a abertura do navegador e a execução do teste.
- Para rodar o segundo cenário de teste, basta executar o teste no arquivo Desafio2.

## Observações

Este é um projeto básico, com muitas possíveis melhorias, como por exemplo adicionar o padrão Page Object ao projeto.
 






