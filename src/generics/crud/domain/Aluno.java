package generics.crud.domain;

import generics.crud.GenericCrud;
import generics.crud.IPersistencia;

import java.util.Map;

public class Aluno extends GenericCrud<Aluno> implements IPersistencia{
    private Long id;
    private String nome;
    private String curso;

    public Aluno(Long id, String nome, String curso) {
        this.id = id;
        this.nome = nome;
        this.curso = curso;
    }

    @Override
    public String toString() {
        return "Aluno{" +
                "id=" + id +
                ", nome='" + nome + '\'' +
                ", curso='" + curso + '\'' +
                '}';
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setCurso(String curso) {
        this.curso = curso;
    }

    @Override
    public Long retornaCod() {
        return this.id;
    }

    @Override
    public Class<Aluno> getClassType() {
        return Aluno.class;
    }

    @Override
    public void atualizarDados(Aluno entity, Aluno entityCadastrado) {
        entityCadastrado.setCurso(entity.curso);
        entityCadastrado.setNome(entity.nome);
    }


}
