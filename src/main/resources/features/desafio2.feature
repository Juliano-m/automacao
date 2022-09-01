#language: pt

Funcionalidade: Janela de alerta

  Cenario: Abrindo e fechando janela de alerta
    Dado que acesse o site "https://demo.automationtesting.in/Alerts.html"
		Quando seleciono a opção "Alert with OK"
		E clico no botão "click the button to display an alert"
		E o alerta é apresentado
		Entao clicko no botão "OK"
		E o alerta é fechado
