package br.com.brunodelima.controller;

import br.com.brunodelima.dto.ReviewRequest;
import br.com.brunodelima.dto.ReviewResponse;
import br.com.brunodelima.service.OpenAiService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/review")
@RequiredArgsConstructor
@CrossOrigin(origins = "*")
public class ReviewController {

    private final OpenAiService openAiService;

    @PostMapping
    public ResponseEntity<ReviewResponse> review(@RequestBody ReviewRequest request) {
        String result = openAiService.reviewCode(request.getCode(), request.getLanguage());
        return ResponseEntity.ok(new ReviewResponse(result));
    }
}