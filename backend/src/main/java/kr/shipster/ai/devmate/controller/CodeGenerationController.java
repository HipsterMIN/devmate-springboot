package kr.shipster.ai.devmate.controller;

import kr.shipster.ai.devmate.model.PromptRequest;
import kr.shipster.ai.devmate.service.LLMService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/generate")
public class CodeGenerationController {

    @Autowired
    private LLMService llmService;

    @PostMapping
    public String generate(@RequestBody PromptRequest request) {
        return llmService.generateCode(request.getDescription());
    }
}