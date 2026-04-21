package generics.crud;

import generics.crud.domain.Professor;

public class ProfessorDAO extends GenericCrud<Professor>{
    public ProfessorDAO(Professor entity) {

    }

    @Override
    public Class<Professor> getClassType() {
        return Professor.class;
    }

    @Override
    public void atualizarDados(Professor entity, Professor entityCadastrado) {

    }
}
