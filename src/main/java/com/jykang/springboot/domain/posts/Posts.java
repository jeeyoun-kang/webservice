package com.jykang.springboot.domain.posts;

import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Getter //getter 메소드 자동생성
@NoArgsConstructor //기본생성자자동추가
@Entity
public class Posts {
    @Id //PK
    @GeneratedValue(strategy = GenerationType.IDENTITY) //PK 생성규칙
    private Long id;

    @Column(length = 500, nullable = false)
    private String title;

    @Column(columnDefinition = "TEXT", nullable = false) //text타입
    private String content;

    private String author;

    @Builder //해당 클래스의 빌더 패턴 클래스 생성
    public Posts(String title, String content, String author){
        this.title = title;
        this.content = content;
        this.author = author;
    }

    public void update(String title,String content){
        this.title=title;
        this.content=content;

    }
}
