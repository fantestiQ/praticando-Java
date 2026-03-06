package Streams.operacoes_finais;

import Streams.domain.Pessoa;

import java.util.List;

public class CoutStream {
    public static void main(String[] args) {
        List<Pessoa> pessoas = new Pessoa().popularPessoa();

        System.out.println(pessoas.stream()
                .filter( p -> p.getNome().startsWith("M"))
                .count());
    }
}
