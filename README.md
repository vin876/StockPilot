# StockPilot — AI-Powered Business Management

Sistema de gestão comercial com foco em Inteligência Artificial, desenvolvido para pequenos e médios negócios, como adegas, distribuidoras, mercados e mercearias.

O projeto tem como principal diferencial a construção de um agente de IA capaz de consultar dados operacionais, identificar oportunidades de melhoria, detectar lacunas nos processos e apoiar decisões de negócio por meio de informações estruturadas e recomendações fundamentadas.

Status: Em desenvolvimento.

Objetivo

Desenvolver uma plataforma que centralize informações comerciais e utilize IA para reduzir atividades manuais, otimizar processos operacionais e facilitar a tomada de decisões.

A proposta é transformar dados de vendas, estoque, compras e financeiro em informações úteis, permitindo que o responsável pelo negócio obtenha análises por meio de linguagem natural.

Agente de Inteligência Artificial

O StockPilot contará com um agente de IA integrado ao sistema, utilizando um LLM do Google Gemini, por meio de uma camada de orquestração desenvolvida em Python.

Capacidades planejadas

Análise de estoque: identificar produtos abaixo do estoque mínimo e possíveis necessidades de reposição.

Análise de vendas: identificar produtos com maior e menor giro, tendências e oportunidades comerciais.

Identificação de lacunas operacionais: detectar inconsistências, ausência de informações e possíveis gargalos nos processos.

Análise financeira: consultar receitas, custos e despesas para apoiar o acompanhamento do negócio.

Recomendação de compras: auxiliar na reposição de produtos e comparação de fornecedores.

Assistente conversacional: permitir consultas em linguagem natural, apresentando explicações baseadas nos dados disponíveis.

Arquitetura de IA planejada

O agente será estruturado em torno de ferramentas especializadas, disponibilizadas de maneira controlada:

Inventory Analysis Tool — consultas e análises de estoque.

Sales Analysis Tool — análise de vendas e desempenho de produtos.

Financial Analysis Tool — consultas financeiras.

Purchasing Assistant Tool — apoio à reposição e comparação de fornecedores.

O modelo poderá selecionar as ferramentas necessárias conforme a solicitação, receber seus resultados e construir uma resposta contextualizada.

O agente terá caráter consultivo: não realizará alterações diretamente no banco de dados. Operações sensíveis dependerão das regras do backend e de aprovação humana.


# Tecnologias:

Aplicação:
Java 21

Desenvolvimento do backend
Spring Boot
APIs REST e regras de negócio

Python
Serviço de IA e orquestração do agente

Google Gemini
LLM para interpretação e geração de respostas

PostgreSQL
Banco de dados relacional

Spring Data JPA
Persistência e acesso aos dados

Maven
Gerenciamento de dependências e build

Git e GitHub
Versionamento e documentação

Docker
Preparação do ambiente de execução

Arquitetura

A aplicação utiliza uma arquitetura de monólito modular em Java, integrada a um serviço independente de IA em Python.

Backend Java: responsável pelas regras de negócio, autenticação, permissões e disponibilização de dados.

Serviço Python: responsável pela integração com o LLM, orquestração do agente e execução de ferramentas autorizadas.

PostgreSQL: armazenamento dos dados comerciais e operacionais.

A comunicação entre os serviços será realizada por APIs, mantendo a camada de IA separada das regras centrais do sistema.

Diferenciais técnicos

Integração de LLM com ferramentas externas (Tool Calling).

Agente orientado a dados reais do negócio.

Separação entre raciocínio do modelo e execução das regras de negócio.

Controle de permissões e isolamento de dados por empresa e filial.

Respostas fundamentadas em informações consultadas no sistema.

Validação de resultados e tratamento de dados insuficientes.

Aprovação humana para operações que alterem registros.

Impacto esperado

O projeto busca reduzir o tempo gasto em consultas e análises manuais, facilitar a identificação de problemas operacionais e transformar informações dispersas em recomendações úteis para o negócio.

A efetividade será avaliada por meio de testes em um ambiente comercial real, comparando o tempo de execução das tarefas antes e depois da implementação.
