package padroes_de_projeto.padroes_criacao.abstract_factory;

public abstract class Factory {
    public Car create(String requestedGrade){
        Car car = retrieverCar(requestedGrade);
        return prepareCar(car);
    }
    private Car prepareCar(Car car){
        car.clean();
        car.fuelCar();
        car.mechanicCheck();
        return car;
    }
    abstract Car retrieverCar(String requestedGrade);
}
