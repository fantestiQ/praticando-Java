package coleções_collections.exercicios.exCollections.domain;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class Cliente {
    private String name;
    private Double saldo;
    private List<Produto> carrinho;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Double getSaldo() {
        return saldo;
    }

    public void setSaldo(Double saldo) {
        this.saldo = saldo;
    }

    public List<Produto> getCarrinho() {
        return carrinho;
    }

    public void setCarrinho(List<Produto> carrinho) {
        this.carrinho = carrinho;
    }

    public Cliente(String name, Double saldo) {
        this.name = name;
        this.saldo = saldo;
        this.carrinho =  new ArrayList<>();
    }

    public void consultaCarrinho(){
        System.out.println("Produtos:\n");
        for (Produto produtos : this.carrinho){
            System.out.println("Descrição: "+produtos.getDescricao() +" R$"+ produtos.getValor()+ "\n");
        }
    }

    public Double adicionarSaldo(Double valorDeposito){
        this.saldo += valorDeposito;
        return this.saldo;
    }
    public void removerDoCarrinho(String descricao){
       boolean removido = carrinho.removeIf(p -> p.getDescricao().equalsIgnoreCase(descricao));

       if (!removido){
           System.out.println("Produto não encontrado!");
       }
    }

    public void adicionarCarrinho(Produto produto){
        this.carrinho.add(produto);
    }

    public void finalizarCarrinho(){
        Double valorTotalProdutos = 0.0;
        for (Produto produtos : carrinho){
            valorTotalProdutos += produtos.getValor();
        }
        if (this.saldo< valorTotalProdutos){
            System.out.printf("""
                    Saldo insuficiente!
                    
                    Saldo atual: %.2f
                    Total dos produtos no carrinho: %.2f
                    """, this.saldo, valorTotalProdutos);
        }else {
            System.out.println("Pagamento realizado!");
        this.saldo = this.saldo - valorTotalProdutos;
        carrinho.clear();
        }
    }

}
