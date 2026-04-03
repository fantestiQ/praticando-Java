package streams.operacoes_finais;

import streams.domain.Pessoa;

import java.util.Comparator;
import java.util.List;
import java.util.Optional;

public class OptionalStream {
    public static void main(String[] args) {
        System.out.println("**** Optional **** ");
        List<Pessoa> pessoas = new Pessoa().popularPessoa();

        Optional<Pessoa> optionalMaxPessoa = pessoas.stream().max(Comparator.comparing(Pessoa::getIdade));

        if (optionalMaxPessoa.isPresent()){
            System.out.println(optionalMaxPessoa.get());
        }

        Optional<Pessoa> optionalMinPessoa = pessoas.stream().min(Comparator.comparing(Pessoa::getIdade));

        optionalMinPessoa.ifPresent(System.out::println);

    }
}
