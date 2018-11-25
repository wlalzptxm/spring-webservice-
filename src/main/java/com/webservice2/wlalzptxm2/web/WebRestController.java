package com.webservice2.wlalzptxm2.web;

import com.webservice2.wlalzptxm2.domain.posts.PostsRepository;
import com.webservice2.wlalzptxm2.dto.posts.PostsSaveRequestDto;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class WebRestController {

    //postsRepository 인터페이스 즉, CRUD메소드를 사용하겠다는 명시
    private PostsRepository postsRepository;

    // localhost8080:/hello에 보내는 메소드
    @GetMapping("/hello")
    public String hello() {
        return "Hello world";
    }

    //이거는 메시지 받는 역활만 수행 - 받아서 PostsSaveRequestDto의 toEntity에 보냄
    //받는 메시지를 dto의 PostsSaveRequestDto에 넣어 보관하겠다는 뜻같음
    @PostMapping("/posts")
    public void savePosts(@RequestBody PostsSaveRequestDto dto){
        //RequestBody는 post형식으로 응답받을수 있으며 기본셍성자와 set메소드로 값이 할당됨으로
        //PostsSaveRequestDto 메소드에 @Setter 어노테이션이 추가된다
        postsRepository.save(dto.toEntity());
        //dto의 toEntity에 저장하게됨 받은 메시지
    }
}
