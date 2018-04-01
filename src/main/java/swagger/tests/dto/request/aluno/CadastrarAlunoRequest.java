package swagger.tests.dto.request.aluno;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Setter
@Getter
@NoArgsConstructor
@AllArgsConstructor
public class CadastrarAlunoRequest {

    private String nome;
    private String matricula;
    private String sexo;

}
