package coleções_collections.exercicios.exCollections;

import coleções_collections.exercicios.exCollections.domain.Transacao;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.util.*;
import java.util.stream.Collectors;

public class ExercicioMap {
    public static void main(String[] args) {
        List<Transacao> lista = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);
        int i =0;
        while (i!=6){
            System.out.println("""
               
                    1- Criar Transação
                    2- Analisar gasto por Cliente
                    3- Analisar produtos comprados por Cliente
                    4- Top Categorias
                    5- Histórico de transações
                    6- Sair
                    """);
            i = scanner.nextInt();

            switch (i){
                case 1: lista.add(criaTransacao());
                break;
                case 2: gastoPorCliente(lista);
                break;
                case 3: produtosCompradosPorCliente(lista);
                break;
                case 4: topCategorias(lista);
                break;
                case 5: historicoCronologico(lista);
                break;
                case 6:
                    break;
                default:
                    System.out.println("Informe um valor válido");
            }
        }

    }
    public static void gastoPorCliente(List<Transacao> lista){
        Map<String, BigDecimal> mapGastoCliente = lista.stream().collect(Collectors.groupingBy(
                Transacao::getIdCliente,
                Collectors.reducing(BigDecimal.ZERO, Transacao::getValor, BigDecimal::add)
        ));

        mapGastoCliente.entrySet().forEach(e -> {
            System.out.println(e.getKey());
            System.out.println(e.getValue());
        });
    }

    public static void produtosCompradosPorCliente(List<Transacao> list){
        Map<String, Set<String>> produtoPorCliente = list.stream().collect(Collectors.groupingBy(Transacao::getIdCliente,
                Collectors.mapping(Transacao::getNomeProduto, Collectors.toSet())
                ));

        produtoPorCliente.forEach((s, strings) -> System.out.println("Cliente:"+ s +" | Produto:"+ strings));
    }

    public static void topCategorias(List<Transacao>list){
        Map<String, Long> topCategorias = list.stream().collect(Collectors.groupingBy(Transacao::getCategoriaProduto,
                Collectors.counting()
                ));

        topCategorias.forEach((s,n)->System.out.println("Categoria:"+ s +" | Número de vendas:"+ n)) ;
    }

    public static void historicoCronologico(List<Transacao> list){
        Map<LocalDate, List<Transacao>> historico = list.stream().collect(Collectors.groupingBy(Transacao::getDataCompra));

        historico.forEach((d,t)-> System.out.println("Data:"+ d +" | Transações:"+ t +"\n"));
    }

    public static Transacao criaTransacao(){
        Scanner s = new Scanner(System.in);
        System.out.println("Informe o identificador do cliente: [nome]");
        String idCliente = s.nextLine();

        System.out.println("Informe categoria do produto: ");
        String categoriaProduto = s.nextLine();

        System.out.println("Informe nome do produto: ");
        String nomeProduto = s.nextLine();

        System.out.println("Informe valor do produto: ");
        String valor = s.nextLine();

        System.out.println("Informe a data da transação: [ex: \"2018-07-22\"] ");
        String data = s.nextLine();
        LocalDate dataCompra = LocalDate.parse(data);

        Transacao transacao = new Transacao(idCliente, categoriaProduto, nomeProduto,  new BigDecimal(valor), dataCompra);
        return transacao;
    }

}
