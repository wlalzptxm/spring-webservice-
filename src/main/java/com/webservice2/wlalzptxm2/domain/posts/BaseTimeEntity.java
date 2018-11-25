package com.webservice2.wlalzptxm2.domain.posts;

import lombok.Getter;
import org.springframework.data.annotation.CreatedDate;
import org.springframework.data.annotation.LastModifiedBy;
import org.springframework.data.jpa.domain.support.AuditingEntityListener;

import javax.persistence.EntityListeners;
import javax.persistence.MappedSuperclass;
import java.time.LocalDateTime;

//객체의 생성시간과 수정시간은 중요한 정보이기 때문에 이를 위한 객체의 생성과 마지막 수정시간에 대한 정보를 알수 있는 메소드와 어노테이션으 추가한다
@Getter
@MappedSuperclass
//JPA Entity 클래스들이 BaseTimeEntity을 상속할경우 필드들 역시 컬럼으로 인식하도록 만든다
@EntityListeners(AuditingEntityListener.class)
//BaseTimeEntity 클래스에 Auditing 기능을 포함시킴

public class BaseTimeEntity {

    @CreatedDate
    //객체가 생성되어 저장되때 시간이 자동 저장됨
    private LocalDateTime createdDate;

    @LastModifiedBy
    //조회한 객체의 값을 변경할때 시간이 자동 저장됨
    private LocalDateTime modifiedDate;
}
