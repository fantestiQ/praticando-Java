package primeiros_modulos;

public class Cliente {

    private int id;
    private String nome;
    private String endereco;

    public void cadastrarEndereco(String endereco){
        setEndereco(endereco);
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }




}
