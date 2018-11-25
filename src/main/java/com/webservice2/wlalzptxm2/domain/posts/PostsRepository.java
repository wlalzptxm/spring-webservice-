package com.webservice2.wlalzptxm2.domain.posts;


import org.springframework.data.jpa.repository.JpaRepository;
//보통 ibats/Mybatis를 통해 Dao라고 불리는 DB Layer접근자이다
//JPA에서는 Repository라고 부르며 인터페이스로 생성하게 된다
//생성 후 JpaRepository<Entity 클래스, PK 타입>을 상속하게 하면 기본적인 CRUD(생성,읽기,갱신,삭제 사용자인터페이스)메소드가 자동생성된다

public interface PostsRepository extends JpaRepository<Posts, Long> {
}
