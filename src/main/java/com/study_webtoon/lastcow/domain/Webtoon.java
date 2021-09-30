package com.study_webtoon.lastcow.domain;

import lombok.*;

import javax.persistence.*;
import java.time.LocalDateTime;

@Entity
@NoArgsConstructor(access = AccessLevel.PROTECTED)
@Builder
@AllArgsConstructor
@Getter
public class Webtoon {

    @Id @GeneratedValue
    @Column(name = "webtoon_id")
    private Long id;

    private String title;

    @Enumerated(EnumType.STRING)
    private Genre genre;

    private String day;

    private String writer;

    private String thumbnailImg;

    private LocalDateTime modifiedAt;

    private Long hitCount;

    private Float rate;

    private Long likeCount;

    private Boolean isAdult;

    private Boolean isCompleted;

    private Boolean isDeleted;

}
