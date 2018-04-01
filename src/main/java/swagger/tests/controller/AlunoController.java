package swagger.tests.controller;

import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiParam;
import io.swagger.annotations.ApiResponse;
import io.swagger.annotations.ApiResponses;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import swagger.tests.dto.Aluno;
import swagger.tests.dto.request.aluno.CadastrarAlunoRequest;
import swagger.tests.dto.response.aluno.CadastrarAlunoResponse;
import swagger.tests.service.AlunoService;

import java.util.List;


@RestController
@RequestMapping("/aluno")
public class AlunoController {

    @Autowired
    private AlunoService alunoService;

    @ApiOperation(
            value = "Busca um aluno na base de dados.",
            notes = "Busca pelo id do aluno."
    )
    @ApiResponses(value = {
            @ApiResponse(code = 200, message = "Dados do aluno."),
            @ApiResponse(code = 400, message = "Parametros inválidos."),
            @ApiResponse(code = 404, message = "Aluno não encontrado.")
    })
    @GetMapping("/{id}")
    public Aluno consultar(@ApiParam(value = "ID do aluno", required = true) @PathVariable("id") Integer id) {
        return alunoService.consultar(id);
    }

    @ApiOperation(
            value = "Lista todos os alunos existentes no banco.",
            notes = "Retorna uma lista vazia caso não existe nenhum aluno."
    )
    @ApiResponses(value = {})
    @GetMapping("/todos")
    public List<Aluno> listar() {
        return alunoService.listar();
    }

    @ApiOperation(
            value = "Cadastra um aluno.",
            notes = "Retorna o id do aluno se conseguir efetuar o cadastro."
    )
    @ApiResponses(value = {
            @ApiResponse(code = 201, message = "Aluno cadastrado."),
            @ApiResponse(code = 400, message = "Parametros inválidos.")
    })
    @PutMapping
    public CadastrarAlunoResponse cadastrar(@RequestBody CadastrarAlunoRequest cadastrarAlunoRequest) {
        return alunoService.cadastrar(cadastrarAlunoRequest);
    }
}
