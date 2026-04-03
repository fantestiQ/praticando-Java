package padroes_de_projeto.padroes_GOF.template_method;

public class Policial extends Trabalhador{
    @Override
    protected void trabalhar() {
        System.out.println("Trabalhando como Policial");
    }
}
