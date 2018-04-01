package swagger.tests.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import swagger.tests.dto.Aluno;
import swagger.tests.dto.request.aluno.CadastrarAlunoRequest;
import swagger.tests.dto.response.aluno.CadastrarAlunoResponse;
import swagger.tests.entity.AlunoEntity;
import swagger.tests.exception.status.NotFoundException;
import swagger.tests.repository.AlunoRepository;
import swagger.tests.service.validator.AlunoServiceValidator;
import swagger.tests.transformation.AlunoTranformation;

import java.util.List;

@Service
public class AlunoService {

    @Autowired
    private AlunoRepository alunoRepository;


    public CadastrarAlunoResponse cadastrar(CadastrarAlunoRequest request) {
        AlunoServiceValidator.validarRequestCadastrar(request);

        AlunoEntity aluno = AlunoEntity.builder()
                                       .matricula(request.getMatricula())
                                       .nome(request.getNome())
                                       .sexo(request.getSexo())
                                       .build();

        aluno = alunoRepository.save(aluno);

        return CadastrarAlunoResponse.builder().idAluno(aluno.getIdAluno()).build();
    }

    public Aluno consultar(Integer id) {
        AlunoServiceValidator.validarRequestConsultar(id);
        AlunoEntity alunoEntity = alunoRepository.findById(id).orElseThrow(NotFoundException::new);
        return AlunoTranformation.transform(alunoEntity);
    }

    public List<Aluno> listar() {
        List<Aluno> alunos = AlunoTranformation.transformToList(alunoRepository.findAll());
        return alunos;
    }
}
