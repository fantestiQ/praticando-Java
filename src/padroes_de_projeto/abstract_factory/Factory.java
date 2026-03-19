package padroes_de_projeto.abstract_factory;

public abstract class Factory {
    public Car create(String requestedGrade){
        Car car = retrieverCar(requestedGrade);
        car = prepareCar(car);
        return car;
    }
    private Car prepareCar(Car car){
        car.clean();
        car.fuelCar();
        car.mechanicCheck();
        return car;
    }
    abstract Car retrieverCar(String requestedGrade);
}
