package swagger.tests.transformation;


import swagger.tests.dto.Aluno;
import swagger.tests.entity.AlunoEntity;

import java.util.List;
import java.util.stream.Collectors;

import static java.util.Objects.isNull;

public class AlunoTranformation {

    public static Aluno transform(AlunoEntity from) {
        if (isNull(from)) {
            return null;
        }
        return Aluno.builder()
                    .nome(from.getNome())
                    .idAluno(from.getIdAluno())
                    .matricula(from.getMatricula())
                    .sexo(from.getSexo())
                    .build();
    }

    public static List<Aluno> transformToList(List<AlunoEntity> list) {
        if (isNull(list)) {
            return null;
        }
        return list.stream().map(AlunoTranformation::transform).collect(Collectors.toList());
    }


}
