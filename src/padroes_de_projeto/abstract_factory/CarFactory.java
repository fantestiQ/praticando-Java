package padroes_de_projeto.abstract_factory;

public class CarFactory extends Factory{

    @Override
    Car retrieverCar(String requestedGrade) {
        return switch (requestedGrade) {
            case "A" -> new Volkswagem(100, "full", "blue");
            case "B" -> new Toyota(900, "full", "blue");
            default -> {
                System.out.println("A requisição infelizmente não é valida.");
                yield null;
            }
        };
    }
}
