package com.velialiyev.twitterclone.entity;

import lombok.*;

import javax.persistence.*;
@Entity
@Getter
@Setter
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class EventEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "user_id", referencedColumnName = "id")
    private UserEntity user;

    private String price;
    private String eventPath;
    private String picturePath;
    private String title;
    private String content;
    private String date;
    private Integer likeCounter;
}
