package com.webservice2.wlalzptxm2.domain.posts;

import lombok.AccessLevel;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@NoArgsConstructor(access = AccessLevel.PROTECTED)
//Entity 클래스를 플젝코드상에서 기본생성자로 생성하는것을 막고 JPA에서 Entity 클래스를 생성하는 것을 허용하기 위해 추가
@Getter
//클래스내에 모든 필드의 Getter메소드 자동생성
@Entity
//테이블과 링크될 클래스(실제 DB와 관련있는 어노테이션)

public class Posts extends BaseTimeEntity {
//Posts 객체의 데이터의 값을 컨트롤 하기 위해 BaseTimeEntity를 상속함

    @Id
    //해당 테이블의 PK 필드를 나타낸다
    @GeneratedValue
    //PK의 생성규칙을 의미한다
    //왠만하면 Entity의 PK는 Long타입의 Auto_increment로 하는것이 좋다(매우 유연함)
    //스프링부트 2.0과 1.5버전의 적용방법이 서로 다름에 유의한다
    private Long id;

    @Column(length = 500, nullable = false)
    //기본값 외에 추가로 변경이 필요한 옵션이있을경우, 여기다가 적용시킴
    //nullable은 처음보긴하는데 비어있으면 안된다는 의미인것 같음
    private String title;

    @Column(columnDefinition = "TEXT", nullable = false)
    //문장이 들어가기 때문에 TEXT로 바꾼모습
    private String content;

    private String author;

    @Builder
    //빌드는 생성자 대신(Setter와 같은)값을 초기화 동시 채워주는 역활을 하며, 딱히 타입지정이 필요없는 녀석으로 보임
    //빌더를 사용하여 어느필드에 어떤 값을 채울 것인가를 명확하게 함
    private Posts(String title, String content, String author){
        this.title = title;
        this.content = content;
        this.author = author;
    }
}

//각각 요소를 객체화하여 주키로 관리하는 핵심소스