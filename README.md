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

---

# Histórias de Usuário

### Épico 1: Gestão e Configuração (Funcionalidades do Agente)

Este épico cobre as tarefas de gerenciamento do sistema, como o cadastro de veículos e usuários, que são realizadas pelos agentes.

**US01: Gerenciar Automóveis**

* **Como um** Agente,  
* **Eu quero** poder criar, visualizar, editar e remover automóveis no sistema,  
* **Para que** o portfólio de veículos disponíveis para aluguel esteja sempre atualizado.

**US02: Gerenciar Usuários Clientes**

* **Como um** Agente,  
* **Eu quero** poder consultar e gerenciar os dados cadastrais dos usuários Clientes,  
* **Para que** a base de clientes esteja organizada e seja possível dar suporte quando necessário.

### Épico 2: Jornada do Cliente

Este épico descreve a jornada completa do cliente, desde o seu primeiro acesso até a gestão de seus pedidos de aluguel.

**US03: Cadastrar-se no Sistema**

* **Como um** novo Cliente,  
* **Eu quero** poder me cadastrar na plataforma fornecendo meus dados pessoais, profissionais e de rendimento,  
* **Para que** eu possa ser um usuário verificado e apto a solicitar um aluguel.

**US04: Realizar Login no Sistema**

* **Como um** Usuário (Cliente ou Agente),  
* **Eu quero** fazer login no sistema usando meu usuário e senha,  
* **Para que** eu possa acessar as funcionalidades correspondentes ao meu perfil.

**US05: Introduzir Pedido de Aluguel**

* **Como um** Cliente,  
* **Eu quero** poder escolher um automóvel e submeter um novo pedido de aluguel,  
* **Para que** minha solicitação seja enviada para análise financeira de um agente.

**US06: Consultar Meus Pedidos**

* **Como um** Cliente,  
* **Eu quero** visualizar a lista de todos os meus pedidos com seus respectivos status (ex: "Em análise", "Aprovado", "Cancelado"),  
* **Para que** eu possa acompanhar o andamento das minhas solicitações.

**US07: Modificar Pedido de Aluguel**

* **Como um** Cliente,  
* **Eu quero** poder modificar os dados de um pedido que ainda não foi aprovado,  
* **Para que** eu possa corrigir ou atualizar informações.

**US08: Cancelar Pedido de Aluguel**

* **Como um** Cliente,  
* **Eu quero** poder cancelar um pedido de aluguel que fiz,  
* **Para que** eu possa desistir da solicitação caso mude de ideia.

### Épico 3: Análise de Pedidos (Funcionalidades do Agente)

Este épico foca no fluxo de trabalho do Agente ao receber, analisar e decidir sobre os pedidos de aluguel.

**US09: Avaliar Pedido de Aluguel**

* **Como um** Agente,  
* **Eu quero** poder visualizar os detalhes de um pedido e os dados financeiros do cliente,  
* **Para que** eu possa fazer a análise e emitir um parecer (positivo ou negativo).

**US10: Executar Contrato**

* **Como um** Agente,  
* **Eu quero** poder, a partir de um pedido com parecer positivo, executar o contrato de aluguel,  
* **Para que** o processo seja formalizado e o veículo seja liberado para o cliente.

**US11: Associar Contrato de Crédito**

* **Como um** Agente (especificamente de um Banco),  
* **Eu quero** poder associar um contrato de crédito ao aluguel,  
* **Para que** o cliente possa financiar o veículo através do banco.

### Épico 4: Processos e Notificações (Funcionalidades do Sistema)

Este épico descreve ações realizadas pelo próprio sistema para automatizar tarefas e manter os usuários informados.

**US12: Notificar Cliente sobre Status do Pedido**

* **Como o** Sistema,  
* **Eu quero** enviar uma notificação por e-mail para o cliente sempre que o status do seu pedido for alterado,  
* **Para que** o cliente seja informado proativamente sobre o andamento da sua solicitação.

**US13: Alocar Pedido para um Agente**

* **Como o** Sistema,  
* **Eu quero** atribuir automaticamente um novo pedido de aluguel a um agente disponível,  
* **Para que** o processo de análise comece o mais rápido possível e a carga de trabalho seja distribuída.

---

# Diagrama de Casos de Uso

<img width="500" alt="Diagrama Casos de Uso Aluguel" src="https://github.com/user-attachments/assets/2c321e3e-ea67-4ff5-8eb1-937c55afa366" />

---

# Diagrama de Classes

<img width="800" alt="Diagrama Classes Aluguel de Carros" src="https://github.com/user-attachments/assets/04d36228-a0bd-40b4-b1dc-16f082bd7370" />

---

# Diagrama de Pacotes

<img width="800" alt="Diagrama Pacotes Aluguel de Carros" src="https://github.com/user-attachments/assets/1d9361c6-32c6-497d-8aa5-eb805b344478" />

---

# Diagrama de Componentes do Sistema

<img width="800" alt="Component Diagram000" src="https://github.com/user-attachments/assets/a0c2b2d8-9b3f-48dc-956c-d71cc395fd69" />

---

# Diagrama de Implantação do Sistema

<img width="2481" height="1169" alt="Diagrama de Implantação Aluguel drawio" src="https://github.com/user-attachments/assets/29a5897a-f8e0-491e-9af8-2892527814ac" />
