package coleções_collections.exercicios.exCollections.domain;

public class Produto {
    private String descricao;
    private Double valor;

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public Double getValor() {
        return valor;
    }

    public void setValor(Double valor) {
        this.valor = valor;
    }

    public Produto(String descricao, Double valor) {
        this.descricao = descricao;
        this.valor = valor;
    }
}
