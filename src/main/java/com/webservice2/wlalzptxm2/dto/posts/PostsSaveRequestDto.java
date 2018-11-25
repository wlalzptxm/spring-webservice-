package com.webservice2.wlalzptxm2.dto.posts;

import com.webservice2.wlalzptxm2.domain.posts.Posts;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
//앞서 말했던것과 같이 WebRestController에서 saveposts메소드의 RequestBody는 post형식으로 응답받을수 있으며 기본셍성자와 set메소드로 값이 할당됨으로 예외적으로 추가되었다
@Setter
//이것은 자동으로 생성자를 필드에 부여하는 어노테이션
@NoArgsConstructor
//PostsSaveRequestDto가 Posts 코어클래스와 닮아있는점은 DB Layer의 역활을 하는 Posts가 하는 역활을 그대로 수행하고
//그것을 View Layer에서 똑같이 수행하기 때문이다.
public class PostsSaveRequestDto {

    private String title;
    private String content;
    private String author;


    //WebRestController에서 보내진 데이터들은 여기에 보관됨
    //여기서 Posts라는건 Posts의 데이터형식(빌더)를 가지고 쓰는 정도인것같음
    public Posts toEntity(){
        return Posts.builder()
                .title(title)
                .content(content)
                .author(author)
                .build();
    }
}
