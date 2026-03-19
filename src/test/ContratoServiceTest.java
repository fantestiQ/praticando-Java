package test;

import domainTest.ContrtatoService;
import domainTest.service.IContratoService;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class ContratoServiceTest {

    @Test
    public void salvarContratoTest(){
        IContratoService service = new ContrtatoService();
        String retorno = service.salvar();
        Assertions.assertEquals("Sucesso", retorno);
    }


}
