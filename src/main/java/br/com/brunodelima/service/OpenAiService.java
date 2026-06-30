package br.com.brunodelima.service;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestClient;

import java.util.List;
import java.util.Map;

@Service
public class OpenAiService {

    @Value("${openai.api.key}")
    private String apiKey;

    @Value("${openai.api.url}")
    private String apiUrl;

    public String reviewCode(String code, String language) {
        String prompt = buildPrompt(code, language);

        Map<String, Object> requestBody = Map.of(
                "model", "gpt-4o-mini",
                "messages", List.of(
                        Map.of("role", "system", "content",
                                "Você é um especialista em qualidade de código e arquitetura de software."),
                        Map.of("role", "user", "content", prompt)
                )
        );

        RestClient client = RestClient.create();

        Map response = client.post()
                .uri(apiUrl)
                .header("Content-Type", "application/json")
                .header("Authorization", "Bearer " + apiKey)
                .body(requestBody)
                .retrieve()
                .body(Map.class);

        return extractText(response);
    }

    private String buildPrompt(String code, String language) {
        return """
            Analise o código %s abaixo e forneça um code review detalhado em português, avaliando:
            
            1. Violações ou boas práticas dos princípios SOLID
            2. Clean Code: legibilidade, nomenclatura, responsabilidade única
            3. Possíveis bugs ou problemas de manutenibilidade
            4. Sugestões concretas de melhoria com exemplos
            
            Código:
            %s
            """.formatted(language, code);
    }

    @SuppressWarnings("unchecked")
    private String extractText(Map response) {
        List<Map> choices = (List<Map>) response.get("choices");
        Map message = (Map) choices.get(0).get("message");
        return (String) message.get("content");
    }
}