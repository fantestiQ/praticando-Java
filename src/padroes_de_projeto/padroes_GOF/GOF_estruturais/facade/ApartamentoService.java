package padroes_de_projeto.padroes_GOF.GOF_estruturais.facade;

public class ApartamentoService implements IApartamentoService{

    private void procurarPorEndereco(){}

    private void procurarPorContato(){}

    private void procurarValorTotal(){}

    @Override
    public void alugarApartamento() {
        procurarPorEndereco();
        procurarPorContato();
        procurarValorTotal();
    }
}
