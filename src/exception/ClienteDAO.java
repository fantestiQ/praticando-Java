package exception;

public class ClienteDAO {

    public static void consultarCliente(String cod) throws ClienteNaoEncontrado2Exception {
        try {
            ClienteService.consultarCliente(cod);
        } catch (ClienteNaoEncontradoException e) {
            throw new ClienteNaoEncontrado2Exception("Cliente não encontrado", e);
        }
    }
}
