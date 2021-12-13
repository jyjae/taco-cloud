package tacos;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;


/*
* 복합키 설정 방법
* 1. 식별자 클래스의 변수명과 엔티티에서 사용되는 변수명이 동일
* 2. 디폴트 생성자가 존재 (위의 코드는 Lombok의 @NoArgsConstructor어노테이션 추가로 자동 생성)
* 3. 식별자 클래스의 접근 지정자는 public
* 4. Serializable을 상속
* 5. equals, hashCode 구현 (위의 코드는 Lombok의 @Data어노테이션 추가로 자동 생성)
* */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class IngredientId implements Serializable {
    private String id;
    private String name;
}
