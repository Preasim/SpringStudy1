package com.example.firstproject.entity;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.ToString;

import javax.persistence.*;

@Entity // DB가 해당 객체를 인식 가능 (해당 클래스로 테이블을 만든다)
@AllArgsConstructor
@ToString
@NoArgsConstructor
@Getter
public class Article {
    @Id // 대표값을 지정! like a 주민등록번호
    @GeneratedValue(strategy = GenerationType.IDENTITY) // DB가 id를 자동 생성하는 어노테이션
    private Long id;
    @Column
    private String title;
    @Column
    private String content;

}
