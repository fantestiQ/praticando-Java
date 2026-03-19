package padroes_de_projeto.builder;

public class Burger {
    private String pao = "Sem pão";
    private String carne = "Sem carne";
    private String salada = "Sem salada";
    private String queijo = "Sem queijo";
    private String molho = "Sem molho";

    public void setPao(String pao) {
        this.pao = pao;
    }

    public void setCarne(String carne) {
        this.carne = carne;
    }

    public void setSalada(String salada) {
        this.salada = salada;
    }

    public void setQueijo(String queijo) {
        this.queijo = queijo;
    }

    public void setMolho(String molho) {
        this.molho = molho;
    }

    public void print(){
        System.out.println("""
                Burger finalizado!
                
                pão: %s
                carne: %s
                salada: %s
                queijo: %s
                molho: %s
                """.formatted( pao,carne,salada,queijo,molho));
    }
}
