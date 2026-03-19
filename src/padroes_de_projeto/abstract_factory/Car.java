package padroes_de_projeto.abstract_factory;

public abstract class Car {
    private int horsePower;
    private String fuelSource;
    private String color;


    public Car(int horsePower, String fuelSource, String color){
        this.horsePower = horsePower;
        this.fuelSource = fuelSource;
        this.color = color;
    }
    public void startEngine(){
        System.out.println("O motor foi iniciado, e está pronto para utilizar  "+ horsePower + " cavalos de potência");
    }

    public void clean(){
        System.out.println("O carro foi limpo, e a cor " + color.toLowerCase() +" dele brilha!");
    }
    public void mechanicCheck(){
        System.out.println("O carro foi verificado pelo mecânico e está tudo OK!");
    }
    public void fuelCar(){
        System.out.println("Carro está sendo abastecido: " + fuelSource.toLowerCase());
    }
}
