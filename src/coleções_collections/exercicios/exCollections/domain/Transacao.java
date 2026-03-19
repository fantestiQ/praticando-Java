package coleções_collections.exercicios.exCollections.domain;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.util.Objects;

public class Transacao {
    private String idCliente;
    private String categoriaProduto;
    private String nomeProduto;
    BigDecimal valor;
    LocalDate dataCompra;

    public String getIdCliente() {
        return idCliente;
    }

    public String getCategoriaProduto() {
        return categoriaProduto;
    }

    public String getNomeProduto() {
        return nomeProduto;
    }

    public BigDecimal getValor() {
        return valor;
    }

    public LocalDate getDataCompra() {
        return dataCompra;
    }



    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        Transacao transacao = (Transacao) o;
        return Objects.equals(idCliente, transacao.idCliente);
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(idCliente);
    }

    public Transacao(String idCliente, String categoriaProduto, String nomeProduto, BigDecimal valor, LocalDate dataCompra) {
        this.idCliente = idCliente;
        this.categoriaProduto = categoriaProduto;
        this.nomeProduto = nomeProduto;
        if (valor != null && valor.compareTo(BigDecimal.ZERO) < 0){
            throw new IllegalArgumentException("O valor da transação não pode ser negativo");
        }
        this.valor = valor;
        this.dataCompra = dataCompra;
    }


    @Override
    public String toString() {
        return "Transacao{" +
                "idCliente='" + idCliente + '\'' +
                ", categoriaProduto='" + categoriaProduto + '\'' +
                ", nomeProduto='" + nomeProduto + '\'' +
                ", valor=" + valor +
                ", dataCompra=" + dataCompra +
                '}';
    }
}
