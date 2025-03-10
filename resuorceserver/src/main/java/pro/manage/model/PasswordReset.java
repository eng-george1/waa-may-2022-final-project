package pro.manage.model;

import lombok.*;

@Setter
@Getter
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class PasswordReset {
    private String password;
    private String token;
}
