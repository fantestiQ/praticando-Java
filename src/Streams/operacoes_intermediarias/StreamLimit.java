package Streams.operacoes_intermediarias;

import Streams.domain.Pessoa;

import java.util.List;
import java.util.stream.Stream;

public class StreamLimit {
    public static void main(String[] args) {
        List<Pessoa> pessoas = new Pessoa().popularPessoa();

        Stream<Pessoa> stream = pessoas.stream()
                .distinct()
                .limit(2);

        stream.forEach(System.out::println);

    }
}
