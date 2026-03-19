package test;

import coleções_collections.exercicios.exCollections.domain.Transacao;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.util.List;

public class ExercicioTransacaoTest {

    Transacao transacao1 = new Transacao(
            "CLI-001",
            "Eletrônicos",
            "Smartphone Samsung S24",
            new BigDecimal("4500.00"),
            LocalDate.now()
    );
    Transacao transacao2 = new Transacao(
            "CLI-002",
            "Alimentação",
            "Supermercado Extra",
            new BigDecimal("250.50"),
            LocalDate.of(2024, 5, 20)
    );

    List<Transacao> list = List.of(transacao1,transacao2);

    @Test
    public void testCriacaoTransacao(){
        String idCliente = "CLI-003";
        String categoria = "Alimentação";
        String nomeProduto = "Sorvete Kibom";
        BigDecimal valor = new BigDecimal("35.50");
        LocalDate data = LocalDate.of(2025, 12, 25);

        Transacao testeTransacao = new Transacao(idCliente,categoria, nomeProduto, valor, data);
        Assertions.assertAll(()->{
            Assertions.assertEquals(idCliente, testeTransacao.getIdCliente());
            Assertions.assertEquals(categoria, testeTransacao.getCategoriaProduto());
            Assertions.assertEquals(nomeProduto, testeTransacao.getNomeProduto());
            Assertions.assertEquals(valor, testeTransacao.getValor());
            Assertions.assertEquals(data, testeTransacao.getDataCompra());
        });
    }
    @Test
    public void testCriacaoTransacaoValorNegativo(){

        BigDecimal valor = new BigDecimal("-10");
        Assertions.assertThrows(IllegalArgumentException.class, () -> {
            new Transacao("CLI-001", "Alimentação", "Pão", valor, LocalDate.now());
        });

        // Estava pesquisando e na verdade esse teste está testando o Java já que estamamos fazendo o teste de BigDecimal com , ao invés de ponto
        // , ao invés de testar a classe
        // A ideia testar se a CLASSE reage a certos comportamentos e zais. Então alterei para validar se a classe aceita Valor negativo
    }


    @Test
    public void testCriacaoTransacaoValoresNull(){
        String idCliente = null;
        String categoria = null;
        String nomeProduto = null;
        BigDecimal valor = new BigDecimal("00");
        LocalDate data = LocalDate.of(-1, 1, 1);
        // Ele permite os valores String como Null, porém a data tem duas restrições como mês de 1-12, dia até 1 -28/31
        // ano aparentemente nn possui nenhuma restrição

        Transacao testeTransacao = new Transacao(idCliente,categoria, nomeProduto, valor, data);
        Assertions.assertAll(()->{
            Assertions.assertEquals(idCliente, testeTransacao.getIdCliente());
            Assertions.assertEquals(categoria, testeTransacao.getCategoriaProduto());
            Assertions.assertEquals(nomeProduto, testeTransacao.getNomeProduto());
            Assertions.assertEquals(valor, testeTransacao.getValor());
            Assertions.assertEquals(data, testeTransacao.getDataCompra());
        });
    }
}
