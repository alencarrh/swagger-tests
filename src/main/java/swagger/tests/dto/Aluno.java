package swagger.tests.dto;


import lombok.Builder;
import lombok.Getter;

@Getter
@Builder
public class Aluno {

    private final Integer idAluno;
    private final String nome;
    private final String matricula;
    private final String sexo;

}
