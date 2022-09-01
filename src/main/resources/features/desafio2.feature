#language: pt

Funcionalidade: Janela de alerta

  Cenario: Abrindo e fechando janela de alerta
    Dado que acesse o site "https://demo.automationtesting.in/Alerts.html"
		Quando seleciono a opcao "Alert with OK"
		E clico no botao "click the button to display an alert"
		E o alerta eh apresentado
		Entao clico em "OK"
		E o alerta eh fechado
