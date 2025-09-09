# Nome do projeto
Sistema de Aluguel de Carros.

## Integrantes
* Henrique Lima Volponi
* João Vitor Ferreira Jacinto
* Pedro Henrique Novais Baranda

## Orientadores
* João Pedro Oliveira Batisteli

## Instruções de utilização
Assim que a primeira versão do sistema estiver disponível, deverá complementar com as instruções de utilização. Descreva como instalar eventuais dependências e como executar a aplicação.

# Histórias de Usuário

Épico 1: Gestão de Pedidos e Contratos

Este épico descreve como clientes e agentes interagem com os pedidos e contratos de aluguel de automóveis.

US01: Cadastro de Cliente
Como um Cliente,
Eu quero realizar meu cadastro no sistema com meus dados pessoais, profissionais e financeiros,
Para que eu possa acessar as funcionalidades de aluguel de automóveis.

US02: Criar Pedido de Aluguel
Como um Cliente,
Eu quero criar um pedido de aluguel de automóvel,
Para que eu possa iniciar o processo de contratação.

US03: Editar Pedido de Aluguel
Como um Cliente,
Eu quero editar informações de um pedido já criado,
Para que eu possa corrigir ou atualizar dados antes da análise pelos agentes.

US04: Consultar Status do Pedido
Como um Cliente,
Eu quero consultar o status dos meus pedidos,
Para que eu saiba se foram aprovados, rejeitados ou executados.

US05: Cancelar Pedido de Aluguel
Como um Cliente,
Eu quero cancelar um pedido em aberto,
Para que eu não dê continuidade a um contrato que não desejo mais.

US06: Avaliar Pedido Financeiramente
Como um Agente (Banco ou Empresa),
Eu quero avaliar o pedido do cliente do ponto de vista financeiro,
Para que eu possa aprovar ou rejeitar a solicitação.

US07: Modificar Pedido
Como um Agente,
Eu quero modificar informações de um pedido,
Para que ele esteja em conformidade com os critérios de aprovação.

US08: Executar Contrato de Aluguel
Como um Agente,
Eu quero formalizar um contrato após aprovação,
Para que a locação do automóvel seja oficializada.

Épico 2: Gestão de Dados

Este épico descreve como o sistema gerencia informações de clientes e automóveis.

US09: Armazenar Dados de Identificação do Cliente
Como o Sistema,
Eu quero registrar RG, CPF, nome, endereço, profissão, empregadores e rendimentos do cliente,
Para que os agentes tenham dados confiáveis para análise de crédito.

US10: Cadastrar Automóvel
Como o Sistema,
Eu quero registrar matrícula, ano, marca, modelo e placa dos automóveis,
Para que os veículos disponíveis estejam devidamente identificados.

US11: Associar Contrato de Crédito
Como o Sistema,
Eu quero vincular o contrato de aluguel a um contrato de crédito concedido por um banco,
Para que seja possível garantir o controle financeiro do processo.

Épico 3: Infraestrutura e Acesso

Este épico descreve como usuários acessam o sistema e como ele é estruturado.

US12: Realizar Login no Sistema
Como um Usuário (Cliente, Agente ou Administrador),
Eu quero realizar login no sistema com meu usuário e senha,
Para que eu possa acessar as funcionalidades do meu perfil.

US13: Acessar o Sistema via Internet
Como um Usuário,
Eu quero acessar o sistema através da internet,
Para que eu possa utilizá-lo de forma remota.

US14: Gerenciar Subsistemas
Como um Administrador,
Eu quero que o sistema seja dividido em subsistema de pedidos/contratos e subsistema de páginas web,
Para que a manutenção e a escalabilidade sejam facilitadas.
