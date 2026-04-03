package streams.operacoes_finais;

import streams.domain.Pessoa;

import java.util.List;

public class ForEachStream {
    public static void main(String[] args) {
        System.out.println("**** ForEach ****");
        List<Pessoa> pessoas = new Pessoa().popularPessoa();

        System.out.println("***** Usando forEach atráves de uma stream pela interface Itarator *****");

        pessoas.stream().forEach(p -> System.out.println(p.getNome()));

        System.out.println("***** Usando forEach diretamente na coleção pela interface Itarator *****");

        pessoas.forEach(p -> System.out.println(p.getNome()));

        System.out.println("***** Usando operações intermediarias junto das finais *****");

        pessoas.stream().filter( pessoa -> pessoa.getNacionalidade().equals("Brasil"))
                .forEach(pessoa -> System.out.println( "Nome: " +pessoa.getNome() + "\n" +
                                "Nacionalidade: "+ pessoa.getNacionalidade() + "\n"));

        System.out.println("**********");
        pessoas.stream().map(Pessoa::getIdade).forEach(System.out::println);
    }
}
