Framework Avançado de Automação de Testes para UI Web
Visão Geral
Este repositório contém um framework de automação de testes robusto, escalável e de fácil manutenção, construído com Java, Selenium e Cucumber. O projeto foi arquitetado para ir além de um simples script de teste, aplicando princípios de engenharia de software e padrões de design para criar uma solução de nível profissional, pronta para ambientes de Integração Contínua (CI/CD).

O alvo da automação é um site de e-commerce, demonstrando a aplicação do framework em um cenário do mundo real.

Princípios de Arquitetura e Features Principais
A qualidade deste framework reside em sua arquitetura, que foi cuidadosamente planejada com foco em escalabilidade e manutenibilidade.

Behavior-Driven Development (BDD) com Cucumber: Os testes são escritos em Gherkin (.feature), uma linguagem natural que descreve o comportamento do sistema. Isso torna os testes compreensíveis por toda a equipe, desde desenvolvedores até analistas de negócio.

Page Object Model (POM): A interação com a UI é totalmente abstraída em classes de Page, garantindo a reutilização do código e isolando as implementações de teste das mudanças na interface do usuário.

Gerenciamento de WebDriver Thread-Safe para Execução Paralela: O framework foi refatorado para abandonar o uso de static WebDriver. A gestão do driver agora é feita com ThreadLocal, garantindo que cada thread de teste tenha sua própria instância isolada do navegador. Isso torna o framework pronto para execução paralela, uma prática essencial para acelerar o ciclo de feedback em pipelines de CI/CD.

Estratégia Avançada de Gerenciamento de Dados de Teste: Para garantir testes independentes e robustos, o framework utiliza uma abordagem híbrida:

Banco de Dados SQLite: Um banco de dados local é utilizado para criar e gerenciar usuários de teste, garantindo que os testes de registro e login não dependam de um estado pré-existente e possam ser executados repetidamente sem falhas.

Leitura de CSV e Geração de Dados com Faker: Dados de produtos são lidos de arquivos CSV e dados dinâmicos (como informações de usuário) são gerados em tempo de execução com a biblioteca Faker.

Princípios de Clean Code e Separação de Responsabilidades: O código foi refatorado para seguir as melhores práticas de Clean Code. A responsabilidade de validação (Asserts) foi movida das Page Objects para a camada de Step Definitions, garantindo que as Pages cuidem apenas da interação com a UI e os Steps orquestrem e verifiquem o fluxo de negócio.

Relatórios Executivos com Allure Report: A comunicação dos resultados é feita através do Allure, que gera dashboards HTML interativos e detalhados, incluindo screenshots de falhas, logs e métricas de execução.

Stack de Tecnologias
Linguagem: Java (JDK 21)

Automação Web: Selenium WebDriver

Framework de Testes BDD: Cucumber

Build e Dependências: Apache Maven

Relatórios: Allure Report

Gestão de Dados: SQLite, OpenCSV, JavaFaker

Logging: SLF4J & Log4j2

Runner de Teste: JUnit

Como Executar o Projeto
Pré-requisitos:

Java (JDK 21) instalado

Apache Maven instalado

Allure Commandline instalado

Executando os Testes:

Clone este repositório.

Abra um terminal na pasta raiz do projeto.

Execute o seguinte comando Maven para rodar todos os testes:

Bash

mvn clean test
Visualizando os Relatórios:

Após a execução dos testes, gere e sirva o relatório do Allure com o comando:

Bash

allure serve
Seu navegador abrirá automaticamente com o dashboard completo dos resultados.
