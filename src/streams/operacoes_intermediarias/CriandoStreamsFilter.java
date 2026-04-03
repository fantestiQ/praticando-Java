package streams.operacoes_intermediarias;

import streams.domain.Pessoa;

import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.stream.Stream;

public class CriandoStreamsFilter {
    public static void main(String[] args) {
       Stream<String> stream = List.of("Isac", "Santos", "Silva").stream();

       Stream<String> setStream =Set.of("Isac", "Santos", "Silva").stream();

       Map<Integer, String> map=Map.of(1,"Isac", 2, "Inacia", 3, " Akamaru");

       Stream<Integer> mapIntegerStream = map.keySet().stream();
       Stream<String> mapStringStream = map.values().stream();

       List<Pessoa> pessoas = new Pessoa().popularPessoa();
       Stream<Pessoa> pesssoaPorNacionalidade = pessoas.stream().filter(
               p -> p.getNacionalidade().equals("Brasil"));

       pesssoaPorNacionalidade.forEach(System.out::println);
    }
}
