package swagger.tests.service.validator;


import swagger.tests.dto.request.aluno.CadastrarAlunoRequest;
import swagger.tests.exception.status.BadRequestException;

import static java.util.Objects.isNull;
import static org.apache.commons.lang3.StringUtils.isEmpty;

public class AlunoServiceValidator {

    public static void validarRequestCadastrar(CadastrarAlunoRequest request) {
        if (isNull(request)) {
            throw new BadRequestException("Request não pode ser nulo.");
        }

        if (isEmpty(request.getNome()) || isEmpty(request.getMatricula()) || isEmpty(request.getSexo())) {
            throw new BadRequestException("Parâmetros inválidos.");
        }
    }

    public static void validarRequestConsultar(Integer id) {
        if (isNull(id) || id < 0) {
            throw new BadRequestException("id não pode ser nulo ou menor que 0.");
        }
    }
}
