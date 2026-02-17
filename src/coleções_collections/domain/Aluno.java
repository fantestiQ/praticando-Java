package coleções_collections.domain;

import java.util.Objects;

public class Aluno implements Comparable<Aluno> {

    private String nome;
    private String curso;
    private  Integer nota;

    public Integer getNota() {
        return nota;
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        Aluno aluno = (Aluno) o;
        return Objects.equals(nome, aluno.nome) && Objects.equals(curso, aluno.curso) && Objects.equals(nota, aluno.nota);
    }

    @Override
    public int hashCode() {
        return Objects.hash(nome, curso, nota);
    }

    public void setNota(Integer nota) {
        this.nota = nota;
    }

    public Aluno(String nome, String curso, Integer nota) {
        this.nome = nome;
        this.curso = curso;
        this.nota = nota;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCurso() {
        return curso;
    }

    public void setCurso(String curso) {
        this.curso = curso;
    }

    @Override
    public String toString() {
        return "Aluno{" +
                "nome='" + nome + '\'' +
                ", nota='" + nota + '\'' +
                '}';
    }

    @Override
    public int compareTo(Aluno aluno) {
        return this.nome.compareTo(aluno.getNome());
    }
}
