package generics.crud.domain;

import generics.crud.GenericCrud;
import generics.crud.IGenericCrud;
import generics.crud.IPersistencia;

import java.util.Map;

public class Professor extends GenericCrud<Professor> implements IPersistencia {
    private Long id;
    private String nome;
    private String aula;

    public Professor(Long id, String nome, String aula) {
        this.id = id;
        this.nome = nome;
        this.aula = aula;
    }

    @Override
    public String toString() {
        return "Professor{" +
                "id=" + id +
                ", nome='" + nome + '\'' +
                ", aula='" + aula + '\'' +
                '}';
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setAula(String aula) {
        this.aula = aula;
    }

    @Override
    public Class<Professor> getClassType() {
        return Professor.class;
    }

    @Override
    public void atualizarDados(Professor entity, Professor entityCadastrado) {
        entityCadastrado.setAula(entity.aula);
        entityCadastrado.setNome(entity.nome);
    }

    @Override
    public Long retornaCod() {
        return this.id;
    }
}
