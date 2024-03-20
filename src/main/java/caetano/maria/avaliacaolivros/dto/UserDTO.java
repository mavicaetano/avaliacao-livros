package caetano.maria.avaliacaolivros.dto;

import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;
import lombok.AllArgsConstructor;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;

import java.io.Serial;
import java.io.Serializable;

@Getter
@Setter
@EqualsAndHashCode
@AllArgsConstructor
public class UserDTO implements Serializable {

    @Serial
    private static final long serialVersionUID = 1L;

    @NotBlank(message = "O nome não deve estar em branco.")
    private String name;

    @NotBlank(message = "Informe o seu e-mail.")
    @Email(message = "E-mail inválido.")
    private String email;

    @NotBlank(message = "Digite sua senha.")
    private String password;
}
