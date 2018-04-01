package swagger.tests.entity.transformation;

import swagger.tests.dto.Aluno;
import swagger.tests.entity.AlunoEntity;

import java.util.List;
import java.util.stream.Collectors;

import static java.util.Objects.isNull;

public class AlunoEntityTranformation {


    public static AlunoEntity transform(Aluno from) {
        if (isNull(from)) {
            return null;
        }

        return AlunoEntity.builder()
                .idAluno(from.getIdAluno())
                .matricula(from.getMatricula())
                .nome(from.getNome())
                .sexo(from.getSexo())
                .build();

    }


    public static List<AlunoEntity> transformToList(List<Aluno> list) {
        if (isNull(list)) {
            return null;
        }
        return list.stream().map(AlunoEntityTranformation::transform).collect(Collectors.toList());
    }


}
