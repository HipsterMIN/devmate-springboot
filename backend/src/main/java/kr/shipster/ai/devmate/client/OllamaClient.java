package kr.shipster.ai.devmate.client;

import org.springframework.stereotype.Component;
import java.net.http.*;
import java.net.URI;
import java.util.Map;
import com.fasterxml.jackson.databind.ObjectMapper;

@Component
public class OllamaClient {

    private final HttpClient httpClient = HttpClient.newHttpClient();
    private final ObjectMapper mapper = new ObjectMapper();

    public String call(String prompt) {
        try {
            Map<String, String> body = Map.of("model", "qwen2", "prompt", prompt);
            String json = mapper.writeValueAsString(body);

            HttpRequest request = HttpRequest.newBuilder()
                .uri(URI.create("http://localhost:11434/api/generate"))
                .header("Content-Type", "application/json")
                .POST(HttpRequest.BodyPublishers.ofString(json))
                .build();

            HttpResponse<String> response = httpClient.send(request, HttpResponse.BodyHandlers.ofString());
            return response.body();
        } catch (Exception e) {
            return "오류: " + e.getMessage();
        }
    }
}