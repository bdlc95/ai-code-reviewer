# AI Code Reviewer - Backend

Back-end do projeto **AI Code Reviewer**, uma aplicação Full Stack com Inteligência Artificial para análise automática de código-fonte baseada em princípios de **SOLID** e **Clean Code**.

## Sobre o Projeto

Este projeto foi desenvolvido com o objetivo de demonstrar habilidades em desenvolvimento Back-end com Java + Spring Boot, integração com APIs externas e arquitetura em camadas.

A aplicação expõe uma API REST que recebe trechos de código enviados pelo front-end, envia esse conteúdo para a API Gemini (Google AI) e retorna uma análise detalhada com sugestões de melhoria.

## Tecnologias Utilizadas

- Java 21
- Spring Boot
- Spring Web
- Maven
- OpenAI API (OpenAI)
- DTO Pattern
- Exception Handling
- REST API

## Arquitetura

O projeto segue arquitetura em camadas:

```text
Controller → Service → External API
