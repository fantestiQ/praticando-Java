package padroes_de_projeto.padroes_GOF.template_method;

public abstract class Trabalhador {

    public void executarRotina(){
        iniciarRotina();
        levantar();
        irAoTrabalho();
        trabalhar();
        voltarParaCasa();
    }

    protected abstract void trabalhar();

    private void voltarParaCasa() {
        System.out.println("Voltando para casa");
    }

    private void irAoTrabalho() {
        System.out.println("Indo trabalhar");
    }

    private void iniciarRotina(){
        System.out.println("Iniciando Rotina");
    }
    protected void levantar(){
        System.out.println("Levantando da cama.");
    }
}
