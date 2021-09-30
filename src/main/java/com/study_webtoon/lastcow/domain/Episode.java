package com.study_webtoon.lastcow.domain;

import lombok.*;

import javax.persistence.*;
import java.time.LocalDateTime;

@Entity
@NoArgsConstructor(access = AccessLevel.PROTECTED)
@Builder
@AllArgsConstructor
@Getter
public class Episode {

    @Id @GeneratedValue
    @Column(name = "episode_id")
    private Long id;

    private Integer episodeNumber;

    private String title;

    private Float rate;

    private LocalDateTime uploadAt;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "webtoon_id")
    private Webtoon webtoon;

}
