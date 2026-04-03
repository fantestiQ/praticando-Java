package padroes_de_projeto.padroes_GOF.observer;

public class TV implements Observer {
    @Override
    public void update(Subject subject) {
        if (subject instanceof  Journalist){
            Journalist journalist = (Journalist) subject;
            System.out.println("Notificando mensagem pela TV :" + journalist.toString());
        }
    }
}
