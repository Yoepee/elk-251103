package com.back.domain.post.postDoc.controller;

import com.back.domain.post.postDoc.document.PostDoc;
import com.back.domain.post.postDoc.service.PostDocService;
import jakarta.validation.Valid;
import jakarta.validation.constraints.NotBlank;
import lombok.RequiredArgsConstructor;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RequestMapping("/api/v1/post")
@RestController
@RequiredArgsConstructor
@Validated
public class ApiV1PostDocController {
    private final PostDocService postDocService;

    @PostMapping("/write")
    public PostDoc write(
            @RequestBody @Valid PostDocWriteRequest writeRequest
    ) {
        return postDocService.write(writeRequest.title, writeRequest.content);
    }

    record PostDocWriteRequest(
            @NotBlank String title,
            @NotBlank String content
    ) {}

    @GetMapping("/search")
    public List<PostDoc> search(@RequestParam("keyword") String keyword) {
        return postDocService.searchByKeyword(keyword);
    }
}
