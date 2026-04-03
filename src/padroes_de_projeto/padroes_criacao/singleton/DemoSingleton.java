package padroes_de_projeto.padroes_criacao.singleton;

public class DemoSingleton {

    public static void main(String[] args) {
        Thread segundoThread = new Thread(()->{
            Sigleton sigleton = Sigleton.getSigleton("Teste demonstração 1");
            System.out.println(sigleton);
            System.out.println(sigleton.getValue() +"\n");
        });

        new Thread(()->{
            Sigleton sigleton1 = Sigleton.getSigleton("Teste demonstração 2");
            System.out.println(sigleton1);
            System.out.println(sigleton1.getValue());
        }).start();

        segundoThread.start();

    }
}
