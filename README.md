# AppVarejoSeguros

O fluxo do app está disponível no link para acesso ao Miro (https://miro.com/app/board/o9J_laVzHT0=/).
Além do fluxo existe uma descrição de cada tela e suas funções.

Os JSON de transição de informações irão seguir o modelo abaixo:

 //OBTER OFERTAS VAREJO REQUEST
 {
   "vendedor":{
      "cpfCnpjVendedor":"38271870874",
      "idloja":"1302",
      "numeroCelularVendedor":"11966100936"
   },
  "comprador":{
    "cpfCnpj":"29160032820",
    "numeroCelular":"11966100936",
    "endereco":{
        "cep":"04080012",
        "complemento":"",
        "numero":"55"
    	}
    }
}

//RETORNO OFERTAS VAREJO (LISTA DE ITENS)
{
	"ofertas":
	[
		{
			"familias":[
				{
					"nome":"sinistro",
					"Produtos":[
							{
								"id": "2",
								"idFamilia": "1",
								"nome": "Sinistro de Oculos",
								"descricao": "Teste de descricao",
								"ValorDisponivel": "1000",
								"saldo": "0",
								"inicioVigencia": "dd/MM/yyyy",
								"finalVigencia": "dd/MM/yyyy"
							}
					]
				},
				{
					"nome":"garantiaExtendida",
					"Produtos":[
							{
								"id": "1",
								"idFamilia": "3",
								"nome": "Garantia estendida linha branca",
								"descricao": "Teste de descrição",
								"Categorias":
								[
									{
										"nome":"Geladeira",
										"valorMinimoVenda": "300",
										"percentualCalculo":"0.10",
										"marcas":
										[
											{
												"nome":"Bastemp"
											},
											{
												"nome":"Eletrolux"
											}
										]
									},
									{
										"nome":"fogão",
										"limiteMinimoNotaFiscal": "500",
										"percentualCalculo":"0.30",
										"marcas":
										[
											{
												"nome":"Bastemp"
											},
											{
												"nome":"Eletrolux"
											}
										]
									},
								]	
							}
							{
								"id": "1",
								"idFamilia": "3",
								"nome": "Garantia estendida colções",
								"descricao": "Teste de descrição",
								"Categorias":
								[	
									{
										"nome":"Colhão",
										"valorMinimoVenda": "300",
										"percentualCalculo":"0.10",
										"marcas":
										[
											{
												"id":"1",
												"nome":"castor"
											},
											{
												"id":"1",
												"nome":"Ortobom"
											}]
									}
								]
							}
					]
				},
				{
					"nome":"SegurosServicos",
					"Produtos":[
						{
							"id": "2",
							"nome":"Plano Odonto",
							"Tipo":"Saúde",
							"Valor":"200",
							"idFamilia": "1"
						},
						{
							"id": "2",
							"nome":"Plano Pet",
							"Tipo":"Pet",
							"Valor":"500",
							"idFamilia": "1"
						},
						{
							"id": "2",
							"nome":"higienização de estofados",
							"Tipo":"Casa",
							"Valor":"100",
							"idFamilia": "2"
						}
					]
				},
			]
		}
	]
}

//EFETIVAÇÃO DE PAGAMENTO
{
	"preco": "175.99",
	"status":"pago",
     "pagamento":{
        "paymentResponse":
	     {
			"amount": 175.99,
			"cardholderName": "Eric aparecido da silva tunú",
			"itk": "231231213123123", 
			"atk": "231231213123XXX",
			"authorizationDateTime": "10/10/2020 00:00:00",
			"brand": "VISA",
			"orderId": "202000000000001",
			"authorizationCode": "23232323324334343",
			"installmentCount": 12,
			"pan": "XXXX-XXXX-XXXX-5656",
			"type": "CRÉDITO"
	    }
    },
	"produtos":[
		{
			"id":"10859",
			"quantidade": "1",
			"marca": "idMarca",
			"preco":"175.99",
			"imagemNF":"<imagem>",
			"imagemEvidencia":"<imagem>"
		}
	]
}
Ainda não está pronto o ambiente, mas a estrutura do dos json seguiram o modelo.
