package padroes_de_projeto.padroes_criacao.builder;

public class Demo {

    public static void main(String[] args) {
        BurgerRestaurant restaurant = new BurgerRestaurant();
        restaurant.setBuilder(new ChesseBurgerBuilder());
        buildBurger(restaurant);

        restaurant.setBuilder(new ChikenBurger());
        buildBurger(restaurant);


    }
    private static void buildBurger(BurgerRestaurant burgerRestaurant){
        Burger burger = burgerRestaurant.buildBurger();
        burger.print();
    }
}
