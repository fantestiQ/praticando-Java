package streams.operacoes_finais;

import streams.domain.Pessoa;

import java.util.List;

public class CoutStream {
    public static void main(String[] args) {
        List<Pessoa> pessoas = new Pessoa().popularPessoa();

        System.out.println(pessoas.stream()
                .filter( p -> p.getNome().startsWith("M"))
                .count());
    }
}
