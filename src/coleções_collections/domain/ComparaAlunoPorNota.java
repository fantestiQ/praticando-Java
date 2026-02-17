package coleções_collections.domain;

import java.util.Comparator;

public class ComparaAlunoPorNota implements Comparator<Aluno> {
    @Override
    public int compare(Aluno o1, Aluno o2) {
        return Integer.compare(o1.getNota(), o2.getNota());
    }
}
