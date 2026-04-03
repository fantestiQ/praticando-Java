package generics.crud;

import generics.crud.domain.Professor;

public class ProfessorDAO extends GenericCrud<Professor>{
    @Override
    public Class<Professor> getClassType() {
        return Professor.class;
    }

    @Override
    public void atualizarDados(Professor entity, Professor entityCadastrado) {

    }
}
