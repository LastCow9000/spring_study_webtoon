package com.study_webtoon.lastcow.domain;

import lombok.*;

import javax.persistence.*;

@Entity
@NoArgsConstructor(access = AccessLevel.PROTECTED)
@Builder
@AllArgsConstructor
@Getter
public class ContentsImg {

    @Id @GeneratedValue
    @Column(name = "contents_img_id")
    private Long id;

    private Integer order;

    private String imgPath;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "episode_id")
    private Episode episode;

}
