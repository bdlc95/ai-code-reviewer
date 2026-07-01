Frontend: https://github.com/bdlc95/ai-code-reviewer-front
# AI Code Reviewer - Backend

![Java](https://img.shields.io/badge/Java-21-orange)
![Spring Boot](https://img.shields.io/badge/Spring_Boot-3.5-green)
![OpenAI](https://img.shields.io/badge/OpenAI-API-black)
![Maven](https://img.shields.io/badge/Maven-Build-red)
![Status](https://img.shields.io/badge/Status-Concluído-brightgreen)

Back-end do projeto **AI Code Reviewer**, uma aplicação Full Stack com Inteligência Artificial para análise automatizada de código-fonte baseada em princípios de **SOLID**, **Clean Code** e boas práticas de desenvolvimento.

---

## Sobre o Projeto

Este projeto foi desenvolvido para demonstrar habilidades em desenvolvimento Back-end com Java + Spring Boot, integração com APIs de Inteligência Artificial e construção de aplicações com arquitetura escalável.

A aplicação expõe uma API REST responsável por receber trechos de código enviados pelo front-end, consumir a **OpenAI API** para análise inteligente e retornar feedback detalhado com sugestões de melhoria.

---

## Tecnologias Utilizadas

- Java 21
- Spring Boot
- Spring Web
- Maven
- OpenAI API
- DTO Pattern
- REST API
- Global Exception Handling

---

## Arquitetura

O projeto segue arquitetura em camadas:

```text
Controller → Service → OpenAI API
```

### Estrutura

```text
src/
 ├── controller/
 ├── service/
 ├── dto/
 ├── exception/
 └── config/
```

---

## Funcionalidades

- Recebimento de código via endpoint REST
- Integração com OpenAI API
- Análise automatizada baseada em:
  - SOLID
  - Clean Code
  - Boas práticas
  - Legibilidade
  - Manutenibilidade
- Retorno estruturado para o front-end
- Tratamento global de exceções

---

## Endpoint Principal

### Review de código

```http
POST /ai/review
```

### Request

```json
{
  "code": "public class Example { ... }"
}
```

### Response

```json
{
  "review": "Seu código apresenta boa estrutura, porém..."
}
```

---

## Como Executar

### Clonar repositório

```bash
git clone https://github.com/bdlc95/ai-code-reviewer.git
```

### Entrar no projeto

```bash
cd ai-code-reviewer
```

### Configurar variáveis de ambiente

No arquivo:

```properties
application.properties
```

Adicione sua chave da OpenAI:

```properties
openai.api.key=SUA_CHAVE_AQUI
```

### Rodar aplicação

```bash
./mvnw spring-boot:run
```

API disponível em:

```text
http://localhost:8080
```

---

## Autor

**Bruno de Lima**
