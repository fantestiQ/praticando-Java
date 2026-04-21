package exception;

import javax.swing.*;

public class AppCliente {

    public static void main(String[] args){
        String opcao = JOptionPane.showInputDialog(null,
                "Digite o código do cliente",
                "",
                JOptionPane.INFORMATION_MESSAGE);


        try {
            ClienteDAO.consultarCliente(opcao);
        } catch (ClienteNaoEncontrado2Exception e) {
            System.out.println(e.getMessage());
        }
//        try {ClienteService.consultarCliente(opcao);}
//        catch (ClienteNaoEncontradoException e){
//            JOptionPane.showMessageDialog(null, e.getMessage());
//        }
    }
}
