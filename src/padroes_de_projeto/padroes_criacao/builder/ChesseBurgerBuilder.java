package padroes_de_projeto.padroes_criacao.builder;

public class ChesseBurgerBuilder extends BurgerBuilder{
    @Override
    void buildPao() {
        burger.setPao("Brioche");
    }

    @Override
    void buildCarne() {
    burger.setCarne("100% bovina grelhada");
    }

    @Override
    void buildSalada() {
    burger.setSalada("saladinha");
    }

    @Override
    void buildQueijo() {
    burger.setQueijo("Cheedar");
    }

    @Override
    void buildMolho() {
    burger.setMolho("Maionese e Katchup");
    }
}
