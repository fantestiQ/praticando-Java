package streams.domain;

import java.util.List;
import java.util.Objects;

public class Pessoa{

    private String id;
    private String nome;
    private String nacionalidade;
    private Integer idade;

    public Pessoa(){}
    public Pessoa(Pessoa pessoa){
        this.id= pessoa.id;
        this.nome= pessoa.getNome();
        this.nacionalidade= pessoa.getNacionalidade();
        this.idade= pessoa.getIdade();

    }


    public Pessoa(String id, String nome,String nacionalidade, Integer idade){
        this.id=id;
        this.nome=nome;
        this.nacionalidade=nacionalidade;
        this.idade=idade;
    }

    public List<Pessoa> popularPessoa(){
        Pessoa pessoa1 = new Pessoa("P1","Isac","Brasil",20);
        Pessoa pessoa2 = new Pessoa("P2","Inacia","Brasil",28);
        Pessoa pessoa3 = new Pessoa("P3","Joseph","EUA",17);
        Pessoa pessoa4 = new Pessoa("P4","Polnareff","França",21);
        Pessoa pessoa5 = new Pessoa("P5","Michel","EUA",30);
        Pessoa pessoa6 = new Pessoa("P6","Chavinho","México",8);

        return List.of(pessoa1,pessoa2,pessoa3,pessoa4, pessoa5, pessoa6);
    }


    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getNacionalidade() {
        return nacionalidade;
    }

    public void setNacionalidade(String nacionalidade) {
        this.nacionalidade = nacionalidade;
    }

    public Integer getIdade() {
        return idade;
    }

    public void setIdade(Integer idade) {
        this.idade = idade;
    }

    @Override
    public String toString() {
        return "Pessoa{" +
                "id='" + id + '\'' +
                ", nome='" + nome + '\'' +
                ", nacionalidade='" + nacionalidade + '\'' +
                ", idade=" + idade +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        Pessoa pessoa = (Pessoa) o;
        return Objects.equals(id, pessoa.id) && Objects.equals(nome, pessoa.nome) && Objects.equals(nacionalidade, pessoa.nacionalidade) && Objects.equals(idade, pessoa.idade);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, nome, nacionalidade, idade);
    }
}

