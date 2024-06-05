package tests;

import global.exceptions.ValidationException;
import member.controllers.RequestJoin;
import member.services.JoinService;
import member.validators.JoinValidator;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

@DisplayName("회원가입기능테스트")
public class JoinServiceTest {
     private JoinService joinService;


     @BeforeEach
     void init() {
          joinService = new JoinService(new JoinValidator());
     }
     RequestJoin getData() {
          return RequestJoin.builder()
                  .email("test" + System.currentTimeMillis() + "@test.org")
                  .password("12345678")
                  .confirmPassword("12345678")
                  .userName("사용자")
                  .termsAgree(true)
                  .build();
     }

     @Test
     @DisplayName("회원가입성공시 예외가 발생하지 않음")
     void successTest() {
          assertDoesNotThrow(()-> {
               joinService.process(getData());
          });
     }
     @Test
     @DisplayName("필수항목체크(이메일, 비번, 비번확인, 회원명)-검증 실패시 ValidationException 발생")
     void requiredFieldTest() {
          // 이메일 필수 체크
          assertThrows(ValidationException.class, () -> {
              RequestJoin form = getData();
              //null체크
              form.setEmail(null);
              joinService.process(form);

               //공백체크
               form.setEmail("  ");
               joinService.process(form);
          });
          assertThrows(ValidationException.class, () -> {
               RequestJoin form = getData();
               form.setUserName(null);

               form.setPassword(null);
               joinService.process(form);

               form.setPassword("  ");
               joinService.process(form);
          });
     }
}
