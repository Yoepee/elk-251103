package com.back.domain.post.postDoc.document;

import jakarta.persistence.Id;
import lombok.Builder;
import lombok.Getter;
import lombok.Setter;
import org.springframework.data.elasticsearch.annotations.Document;

@Document(indexName = "app1_posts")
@Getter
@Setter
@Builder
public class PostDoc {
    @Id
    private Long id;
    private String title;
    private String content;
}
