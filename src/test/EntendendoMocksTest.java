package test;

import domainTest.dao.ClienteDAO;
import domainTest.dao.ClienteDaoMock;
import domainTest.dao.IClienteDAO;
import domainTest.service.ClienteService;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class EntendendoMocksTest {

    @Test
    public void salvarTeste(){
       IClienteDAO mock = new ClienteDaoMock();
       ClienteService service = new ClienteService(mock);
       String retorno = service.salvar();

       Assertions.assertEquals("Sucesso", retorno);
    }
    @Test
    public void salvarTesteFalhe(){
        IClienteDAO dao = new ClienteDAO();
        ClienteService service = new ClienteService(dao);

        Throwable exception = Assertions.assertThrows(UnsupportedOperationException.class,() ->{
        String retorno = service.salvar(); }
        );
    }
}