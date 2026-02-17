package coleções_collections.set;

import coleções_collections.domain.Aluno;

import java.util.HashSet;
import java.util.Set;

public class ExemploSet {
    public static void main(String[] args) {
        Set<Aluno> queue = new HashSet<>();
        Aluno al1 = new Aluno("isac","Ciência da Computação",10);
        Aluno al2 = new Aluno("inacia","Sistemas de informação",9);
        Aluno al3 = new Aluno("<3","Ciência da Computação",11);

        queue.add(al3);
        queue.add(al1);
        queue.add(al2);

        System.out.println(queue);

    }
}
