package Streams.operacoes_intermediarias;

import Streams.domain.Pessoa;

import java.util.List;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class StreamsMap {
    public static void main(String[] args) {
        List<Pessoa> pessoas = new Pessoa().popularPessoa();
        Stream<Integer> pesssoaPorNacionalidade = pessoas.stream()
                .filter(p -> p.getNacionalidade().equals("Brasil"))
                .map(Pessoa::getIdade);

        IntStream intStream = pessoas.stream()
                .filter(p -> p.getNacionalidade().equals("Brasil"))
                .mapToInt(Pessoa::getIdade);

        intStream.forEach(System.out::println);
    }
}
