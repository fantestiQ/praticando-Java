package streams.operacoes_intermediarias;

import streams.domain.Pessoa;

import java.util.Comparator;
import java.util.List;
import java.util.stream.Stream;

public class StreamSorted {
    public static void main(String[] args) {
        List<Pessoa> pessoas = new Pessoa().popularPessoa();

        Stream<Pessoa> stream = pessoas.stream()
                .filter(p -> p.getNacionalidade().equals("Brasil"))
                .sorted(Comparator.comparing(Pessoa::getNome));

        Stream<Pessoa> streamIdade = pessoas.stream()
                .filter(p -> p.getNacionalidade().equals("Brasil"))
                .sorted(Comparator.comparing(Pessoa::getIdade));

        System.out.println("Ordenado por nome");
        stream.forEach(System.out::println);

        System.out.println("\nOrdenado por idade");
        streamIdade.forEach(System.out::println);

        Stream<Pessoa> stream1 = pessoas.stream()
                .filter(pessoa -> pessoa.getNacionalidade().equals("Brasil"))
                .sorted((p1,p2)-> Integer.compare(p2.getIdade(), p1.getIdade()));

        System.out.println("\nOrdenado por idade usando Integer.compare");
        stream1.forEach(System.out::println);

//        Stream<Pessoa> streamEqualsAndHash = pessoas.stream()
//                .filter(pessoa -> pessoa.getNacionalidade().equals("Brasil"))
//                .sorted();
//
//        System.out.println("\nOrdenado por Equals and HashCode");
//        streamEqualsAndHash.forEach(System.out::println);
    }
}
