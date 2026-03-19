package padroes_de_projeto.abstract_factory;

public class DemoFactory {
    public static void main(String[] args) {
        Cliente cliente1 = new Cliente("B", true);
        Factory factory = getFactory(cliente1);
        Car carrro1 = factory.create(cliente1.getGradeRequest());
        carrro1.startEngine();
    }

    private static Factory getFactory(Cliente cliente){
        if (cliente.hasCompanyContract()){
            return new CompanyCarFactory();
        }else  return new CompanyCarFactory();
    }
}
