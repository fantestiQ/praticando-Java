package streams.operacoes_finais;

import streams.domain.Pessoa;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.stream.Collectors;

public class CollectStream {
    public static void main(String[] args) {
    List<Pessoa> pessoas = new Pessoa().popularPessoa();
    List<Pessoa> pessoasComM = pessoas.stream()
                .filter(p-> p.getNome().startsWith("M"))
                .collect(Collectors.toList());

    pessoasComM.forEach(System.out::println);

    System.out.println("**** Convertendo para Set ****");
    Set<Pessoa> pessoasSet = pessoas.stream()
                .filter(p-> p.getNome().startsWith("M"))
                .collect(Collectors.toSet());

    System.out.println("**** Convertendo para ArrayList ~Classe concreta~ ****");
    ArrayList<Pessoa> pessoasArrList = pessoas.stream()
                .filter(p-> p.getNome().startsWith("M"))
                .collect(Collectors.toCollection(ArrayList::new));



    System.out.println("**** Convertendo para Map ****");
        Map<String, Pessoa> pessoasMap = pessoas.stream()
                .collect(Collectors.toMap(Pessoa::getId, Pessoa::new));
    pessoasMap.forEach((k,p) ->
            System.out.println("Key:"+ k + " | Pessoa:"+p));

    System.out.println("**** Usando GroupingBy ****");
        Map<String, List<Pessoa>> pessoasGroupingBy = pessoas.stream()
                .collect(Collectors.groupingBy(Pessoa::getNacionalidade));
        pessoasGroupingBy.forEach((k,p)-> System.out.println("Nacionalidade:"+ k+ " | Pessoas: "+p));


    }
}


