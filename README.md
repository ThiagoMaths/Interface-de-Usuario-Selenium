# Automação de Testes de Interface de Usuário com Selenium

Este projeto demonstra a criação de testes automatizados de interface de usuário (UI) utilizando Selenium WebDriver com JUnit para interagir com um site de e-commerce.

## Visão Geral

O objetivo principal deste projeto é fornecer um exemplo prático de como automatizar testes de UI em um ambiente web, utilizando Selenium e JUnit. Demonstra a interação com elementos da página e a validação de comportamentos.

## Tecnologias e Bibliotecas Principais

*   **Java:** Linguagem de programação utilizada para desenvolver os testes automatizados.
*   **Selenium WebDriver:** Ferramenta para automatizar a interação com navegadores web. Permite controlar o navegador e simular ações do usuário.
*   **JUnit:** Framework de teste para Java, utilizado para criar e executar os testes. Fornece as anotações e métodos para definir e executar casos de teste.
*   **SQLite:** Banco de dados leve utilizado para armazenar dados de teste localmente. Permite criar conjuntos de dados controlados para os testes.
*   **CSV (Comma-Separated Values):** Formato de arquivo utilizado para armazenar dados de teste em formato tabular. Facilita a criação e manutenção de conjuntos de dados para os testes.
*   **HubSelector (Se aplicável):** Se você utilizou alguma biblioteca específica para selecionar o Selenium Hub (para execução em grid), mencione aqui.  Ex: "Biblioteca X para seleção dinâmica de hubs Selenium, permitindo a execução dos testes em diferentes ambientes."  (Se não usou uma biblioteca específica, remova esta linha)

## Demonstração do Código

O código implementa o padrão Page Object (PO) para organizar os elementos da página e as ações que podem ser realizadas. A estrutura básica é:

*   **Classes Page Object:** Cada página do site (ex: `HomePage`, `LoginPage`) é representada por uma classe que contém:
    *   Os seletores dos elementos da página (ex: botões, campos de texto).
    *   Os métodos que interagem com esses elementos (ex: `clickLoginButton()`, `enterUsername()`).

*   **Classes de Teste:** As classes de teste utilizam JUnit para definir os casos de teste e interagir com as classes Page Object. Os testes validam se a interface do usuário se comporta como esperado.

## Considerações

*   Este projeto demonstra a automação de testes em um site existente. Não inclui acesso ou configuração do banco de dados do site.
*   O foco é na interação com a interface do usuário e na validação do comportamento do site.

## Próximos Passos e Melhorias Potenciais

*   **Aumentar a Cobertura de Testes:** Expandir o conjunto de testes para cobrir mais funcionalidades e cenários.
*   **Implementar Relatórios de Testes:** Adicionar um sistema de relatórios para visualizar os resultados dos testes.
*   **Integrar com um Sistema de CI/CD:** Automatizar a execução dos testes em um pipeline de integração contínua/entrega contínua.
