package padroes_de_projeto.padroes_criacao.builder;

public abstract class  BurgerBuilder {

    Burger burger = new Burger();
    abstract void buildPao();
    abstract void buildCarne();
    abstract void buildSalada();
    abstract void buildQueijo();
    abstract void buildMolho();

    Burger build(){
        return burger;
    }


}
