package Streams.operacoes_finais;

import Streams.domain.Pessoa;

import java.util.List;

public class AllMatchStream {


    public static void main(String[] args) {
        List<Pessoa> pessoas = new Pessoa().popularPessoa();

        System.out.println(pessoas.stream()
                .allMatch(pessoa -> pessoa.getNacionalidade().equals("México")));


        if (pessoas.stream()
                .allMatch(pessoa -> pessoa.getNacionalidade().equals("México"))){
            System.out.println("Todos são do México");
        }else System.out.println("Nem todos são do México");
    }
    }
