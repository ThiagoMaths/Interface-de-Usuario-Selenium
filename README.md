# Framework Avançado de Automação de Testes para UI Web

## Visão Geral

Este repositório contém um framework de automação de testes robusto, escalável e de fácil manutenção, construído com **Java**, **Selenium** e **Cucumber**. O projeto foi arquitetado para ir além de um simples script de teste, aplicando princípios de engenharia de software e padrões de design para criar uma solução de nível profissional, pronta para ambientes de Integração Contínua (**CI/CD**).

O alvo da automação é um site de e-commerce, demonstrando a aplicação do framework em um cenário do mundo real.

## Princípios de Arquitetura e Features Principais

A qualidade deste framework reside em sua arquitetura, que foi cuidadosamente planejada com foco em escalabilidade e manutenibilidade.

* **Behavior-Driven Development (BDD) com Cucumber:** Os testes são escritos em Gherkin (`.feature`), uma linguagem natural que descreve o comportamento do sistema.

* **Page Object Model (POM):** A interação com a UI é totalmente abstraída em classes de Page, garantindo a reutilização do código.

* **Gerenciamento de WebDriver Thread-Safe para Execução Paralela:** O framework utiliza `ThreadLocal` para gerenciar as instâncias do WebDriver, garantindo que cada thread de teste tenha sua própria instância isolada. Isso torna o framework **pronto para execução paralela**.

* **Estratégia Avançada de Gerenciamento de Dados de Teste:** Utiliza uma abordagem híbrida com **SQLite** para criação de usuários e **CSV/Faker** para outros dados de teste.

* **Princípios de Clean Code:** O código foi refatorado para seguir as melhores práticas de Clean Code, com uma clara **separação de responsabilidades** (Asserts nos Step Definitions, não nas Pages).

* **Relatórios Executivos com Allure Report:** A comunicação dos resultados é feita através do **Allure**, que gera dashboards HTML interativos e detalhados.

## Stack de Tecnologias

* **Linguagem:** Java (JDK 21)
* **Automação Web:** Selenium WebDriver
* **Framework de Testes BDD:** Cucumber
* **Build e Dependências:** Apache Maven
* **Relatórios:** Allure Report
* **Gestão de Dados:** SQLite, OpenCSV, JavaFaker
* **Logging:** SLF4J & Log4j2
* **Runner de Teste:** JUnit

## Como Executar o Projeto

**Pré-requisitos:**
* Java (JDK 21) instalado
* Apache Maven instalado
* Allure Commandline instalado

**Executando os Testes:**

1.  Clone este repositório.
2.  Abra um terminal na pasta raiz do projeto.
3.  Execute o seguinte comando Maven para rodar todos os testes:

    ```bash
    mvn clean test
    ```

**Visualizando os Relatórios:**

1.  Após a execução dos testes, gere e sirva o relatório do Allure com o comando:

    ```bash
    allure serve
    ```
2.  Seu navegador abrirá automaticamente com o dashboard completo dos resultados.
