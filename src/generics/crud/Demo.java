package generics.crud;

import generics.crud.domain.Aluno;
import generics.crud.domain.Professor;

public class Demo {
    public static void main(String[] args) {
        Aluno aluno = new Aluno(1L, "Isac","Ciência da computação B");
        Aluno aluno2 = new Aluno(2L, "Lula","Ciência da computação A");
        aluno.cadastrar(aluno);
        aluno.cadastrar(aluno2);

        aluno.buscarTodos();

        Professor prof = new Professor(2L,"Thiago", "PI");

        prof.cadastrar(prof);
        prof.buscarTodos();



    }
}
