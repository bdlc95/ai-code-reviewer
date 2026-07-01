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

Estrutura
src/
 ├── controller/
 ├── service/
 ├── dto/
 ├── exception/
 └── config/
Funcionalidades
Recebimento de código via endpoint REST
Integração com Gemini API
Análise baseada em:
SOLID
Clean Code
Boas práticas
Legibilidade
Retorno estruturado para o front-end
Tratamento global de exceções
Endpoint Principal
Review de código
POST /ai/review
Request
{
  "code": "public class Example { ... }"
}
Response
{
  "review": "Seu código apresenta boa organização, porém..."
}
Como Executar
Clonar repositório
git clone https://github.com/bdlc95/ai-code-reviewer.git
Entrar no projeto
cd ai-code-reviewer
Configurar variáveis de ambiente

Adicione sua chave da API Gemini no arquivo:

application.properties

Exemplo:

gemini.api.key=SUA_CHAVE_AQUI
Rodar aplicação
./mvnw spring-boot:run

A API estará disponível em:

http://localhost:8080
Melhorias Futuras
Histórico de análises
Autenticação com JWT
Persistência com banco de dados
Suporte para múltiplas linguagens
Score de qualidade do código

Autor: Bruno de Lima
## Arquitetura

O projeto segue arquitetura em camadas:

```text
Controller → Service → External API
