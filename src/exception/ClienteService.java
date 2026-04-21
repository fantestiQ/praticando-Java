package exception;

public class ClienteService {

    public static void consultarCliente(String cod) throws ClienteNaoEncontradoException {
        //Simula consulta no banco
         boolean clienteCadastrado = false;

         if (!clienteCadastrado){
             throw new ClienteNaoEncontradoException("Cliente não encontrado!");
         }
    }
}
