package com.lttttte.webtest03.domain;

import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.io.Serializable;
import java.time.LocalDateTime;

@Getter
@NoArgsConstructor
@Entity
@Table
public class Board implements Serializable {

    @Id
    @Column
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idx;

    @Column
    private String title;
    @Column
    private String subTitle;
    @Column
    private String content;
    @Column
    @Enumerated(EnumType.STRING)
    private BoardType boardType;
    @Column
    private LocalDateTime createdDate;
    @Column
    private LocalDateTime updateDate;

    @Builder
    public Board(String title, String subTitle, String content, BoardType boardType, LocalDateTime createdDate, LocalDateTime updateDate) {
        this.title = title;
        this.subTitle = subTitle;
        this.content = content;
        this.boardType = boardType;
        this.createdDate = createdDate;
        this.updateDate = updateDate;
    }
}
