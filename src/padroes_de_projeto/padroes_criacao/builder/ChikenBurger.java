package padroes_de_projeto.padroes_criacao.builder;

public class ChikenBurger extends BurgerBuilder{
    @Override
    void buildPao() {
        burger.setPao("Gergelim");
    }

    @Override
    void buildCarne() {
        burger.setCarne("Frango empanado crocante");
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
        burger.setMolho("Maionese verde");
    }
}
