package padroes_de_projeto.builder;

public class BurgerRestaurant {

    private BurgerBuilder burgerBuilder;

    public void setBuilder(BurgerBuilder burgerBuilder){
        this.burgerBuilder = burgerBuilder;
    }

    public Burger buildBurger(){
        burgerBuilder.buildPao();
        burgerBuilder.buildSalada();
        burgerBuilder.buildCarne();
        burgerBuilder.buildQueijo();
        burgerBuilder.buildMolho();
        return burgerBuilder.build();
    }
}
