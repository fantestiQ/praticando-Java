package padroes_de_projeto.padroes_GOF.GOF_estruturais.facade;

public class Demo {

    public static void main(String[] args) {
        IApartamentoService ap = new ApartamentoService();
        ap.alugarApartamento();
    }

}
