package padroes_de_projeto.padroes_GOF.template_method;

public class Bombeiro extends Trabalhador{

    @Override
    protected void trabalhar() {
        System.out.println("Trabalhando com bombeiro");
    }

    @Override
    protected void levantar() {
        System.out.println("O bombeiro levanta da cama as 7:30");
    }
}
