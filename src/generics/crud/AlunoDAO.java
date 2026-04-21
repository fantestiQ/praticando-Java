package generics.crud;

import generics.crud.domain.Aluno;

import java.util.HashMap;
import java.util.Map;

public class AlunoDAO extends GenericCrud<Aluno> implements IAlunoDAO{

    public AlunoDAO(Aluno aluno) {

    }

    @Override
    public Class<Aluno> getClassType() {
        return Aluno.class;
    }

    @Override
    public void atualizarDados(Aluno entity, Aluno entityCadastrado) {

    }
}
