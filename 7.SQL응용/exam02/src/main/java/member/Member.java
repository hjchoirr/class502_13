package member;

import lombok.*;

import java.time.LocalDateTime;
/*
@EqualsAndHashCode
@Getter @Setter @ToString
*/
@Data
@NoArgsConstructor(access = AccessLevel.PUBLIC) //기본생성자
@AllArgsConstructor
public class Member {
    private String userId;
    private String userNm;
    private String email;
    private LocalDateTime regDt;
}
