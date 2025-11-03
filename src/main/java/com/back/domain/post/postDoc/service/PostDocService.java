package com.back.domain.post.postDoc.service;

import com.back.domain.post.postDoc.document.PostDoc;
import com.back.domain.post.postDoc.repository.PostDocRepository;
import jakarta.validation.constraints.NotBlank;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class PostDocService {
    private final PostDocRepository postDocRepository;

    public PostDoc write(@NotBlank String title, @NotBlank String content) {
        PostDoc postDoc = PostDoc.builder()
                .title(title)
                .content(content)
                .build();
        return postDocRepository.save(postDoc);
    }

    public void truncate() {
        postDocRepository.deleteAll();
    }
}
