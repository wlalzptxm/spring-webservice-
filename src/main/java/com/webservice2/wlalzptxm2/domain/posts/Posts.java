package com.webservice2.wlalzptxm2.domain.posts;

import lombok.AccessLevel;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@NoArgsConstructor(access = AccessLevel.PROTECTED)
//Entity 클래스를 플젝코드상에서 기본생성자로 생성하는것을 막고 JPA에서 Entity 클래스를 생성하는 것을 허용하기 위해 추가
@Getter
//클래스내에 모든 필드의 Getter메소드 자동생성
@Entity
//테이블과 링크될 클래스(실제 DB와 관련있는 어노테이션)

public class Posts {

    @Id
    //해당 테이블의 PK 필드를 나타낸다
    @GeneratedValue
    //
    private Long id;



}
