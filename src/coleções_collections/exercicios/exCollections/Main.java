package coleções_collections.exercicios.exCollections;

import coleções_collections.exercicios.exCollections.domain.Cliente;
import coleções_collections.exercicios.exCollections.domain.Produto;

import java.util.Scanner;

// Crud em mémoria
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int inicializador = 0;
        System.out.println("""
        ***** Simulador de vendas *****
        Insira seu nome e o valor inicial para começar:
        """);

        System.out.println(" \nInsira seu nome: ");
        String nomeInicial = scanner.nextLine();
        System.out.println(" \nInsira o saldo inicial: ");
        Double saldoInicial = scanner.nextDouble();

        Cliente cliente = new Cliente(nomeInicial, saldoInicial);

        while (inicializador != 1){
            System.out.printf("""
                    ***** Simulador de vendas *****
                    
                    Nome: %s
                    Saldo Atual: %.2f
                    
                    6 - finalizar carrinho
                    5 - Inserir Saldo
                    4 - Consultar Carrinho
                    3 - Inserir produto no carrinho
                    2 - Remover produto do carrinho
                    1 - Sair
                    """, cliente.getName(), cliente.getSaldo());
            inicializador = scanner.nextInt();
            switch (inicializador){
                case 2:
                    scanner.nextLine();
                    System.out.println("""
                            \n***** Inserindo no carrinho *****
                            
                            Removendo do carrinho:
                            """);
                        cliente.consultaCarrinho();

                    System.out.println("Informe o produto que deve ser removido do carrinho:");
                        String produtoASerRemovido = scanner.nextLine();
                        cliente.removerDoCarrinho(produtoASerRemovido);
                    break;
                case 3:
                    scanner.nextLine();
                    System.out.println("""
                            \n***** Simulador de vendas *****
                            
                            Informe o produto que deve será adicionado ao carrinho:
                            """);
                    String nomeProduto = scanner.nextLine();
                    System.out.println("\nInforme o valor desse produto:");
                    Double valorProduto = scanner.nextDouble();

                    Produto produto = new Produto(nomeProduto, valorProduto);
                    cliente.adicionarCarrinho(produto);
                    break;
                case 4:
                    scanner.nextLine();
                    System.out.println("""
                            \n***** Simulador de vendas *****
                            
                            Consultando carrinho:
                            """);
                    cliente.consultaCarrinho();
                    break;
                case 5:
                    scanner.nextLine();
                    System.out.println("""
                            \n***** Simulador de vendas *****
                            
                            Informe o saldo a ser inserido:
                            """);
                    Double deposito = scanner.nextDouble();
                    cliente.adicionarSaldo(deposito);
                    break;
                case 6:
                    scanner.nextLine();
                    cliente.finalizarCarrinho();
                    break;
                default:
                    scanner.nextLine();
                    System.out.println("Insira uma opção válida!");
                    break;
            }



        }
    }
}
