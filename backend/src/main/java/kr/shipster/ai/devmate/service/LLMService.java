package kr.shipster.ai.devmate.service;

import kr.shipster.ai.devmate.client.OllamaClient;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class LLMService {

    @Autowired
    private OllamaClient ollamaClient;

    public String generateCode(String description) {
        String prompt = "다음 설명에 맞는 자바 코드를 생성해줘:\n" + description;
        return ollamaClient.call(prompt);
    }
}