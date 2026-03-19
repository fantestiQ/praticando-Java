package domainTest.service;

import domainTest.dao.ClienteDAO;
import domainTest.dao.IClienteDAO;

public class ClienteService {
    private IClienteDAO clienteDAO;

    public ClienteService(IClienteDAO clienteDAO){
        this.clienteDAO = clienteDAO;

        //this.clienteDAO = new ClienteDao();
        //this.clienteDAO = new ClienteDaoMock();
    }


    public String salvar(){
        clienteDAO.salvar();
        return "Sucesso";
    }
}
