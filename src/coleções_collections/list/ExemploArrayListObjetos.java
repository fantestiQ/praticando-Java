package coleções_collections.list;

import coleções_collections.domain.Aluno;
import coleções_collections.domain.ComparaAlunoPorNota;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ExemploArrayListObjetos {
    public static void main(String[] args) {
        exemploArrayListAlunos();
        exemploArrayListAlunosOrdenada();
        exemploArrayListAlunosOrdenadaPorNota();
    }

    private static void exemploArrayListAlunos() {
        System.out.println("***** Lista de Alunos *****");
        List<Aluno> alunos = new ArrayList<Aluno>();
        Aluno a = new Aluno("Isac", "Ciência da computação", 10);
        Aluno b = new Aluno("Matheus", "Analise e desenvolvimento de sistemas", 0);
        Aluno c = new Aluno("Lula", "Sistemas de informação", 7);

        alunos.add(a);
        alunos.add(b);
        alunos.add(c);
        System.out.println(alunos);

    }

    private static void exemploArrayListAlunosOrdenada() {
        System.out.println("\n***** Lista Ordenada ***** ");
        List<Aluno> alunos = new ArrayList<Aluno>();
        Aluno a = new Aluno("Isac", "Ciência da computação", 9);
        Aluno b = new Aluno("Matheus", "Analise e desenvolvimento de sistemas", 1);
        Aluno c = new Aluno("Lula", "Sistemas de informação", 6);

        alunos.add(a);
        alunos.add(b);
        alunos.add(c);
        Collections.sort(alunos);
        System.out.println(alunos);

    }
    private static void exemploArrayListAlunosOrdenadaPorNota() {
        System.out.println("\n***** Lista Ordenada Por Nota***** ");
        List<Aluno> alunos = new ArrayList<Aluno>();
        Aluno a = new Aluno("Isac", "Ciência da computação", 9);
        Aluno b = new Aluno("Matheus", "Analise e desenvolvimento de sistemas", 1);
        Aluno c = new Aluno("Lula", "Sistemas de informação", 6);

        ComparaAlunoPorNota comparaNota = new ComparaAlunoPorNota();

        alunos.add(a);
        alunos.add(b);
        alunos.add(c);
        Collections.sort(alunos, comparaNota.reversed());
        System.out.println(alunos);

    }


}
