package padroes_de_projeto.padroes_criacao.abstract_factory;

public class CompanyCarFactory extends Factory{
    @Override
    Car retrieverCar(String requestedGrade) {
        return switch (requestedGrade) {
            case "A" -> new Tesla(1000, "full", "blue");
            case "B" -> new Audi(800, "full", "blue");
            default -> {
                System.out.println("A requisição infelizmente não é valida.");
                yield null;
            }
        };
    }
}
