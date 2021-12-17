# language: pt

Funcionalidade: Acessar o site da Tricentis e preencher todos as abas e encaminhar com sucesso.

  Cenario: Peencher campos das abas do sistema Tricentis
	Dado que acesso o sistema
	Quando selecionar no menu automobile
	E preencho o formulario Enter Vehicle Data
	E preencho o formulario Enter Insurant Data
	E preencho o formulario Enter Product Data
	E preencho o formulario Select Price Option
	E preencho o formulario Send Quote
	Entao verifica a mensagem de sucesso