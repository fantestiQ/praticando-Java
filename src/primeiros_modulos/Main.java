package primeiros_modulos;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Cliente cliente = new Cliente();
        cliente.cadastrarEndereco("Rua 1");
        cliente.setId(1);

        System.out.println(cliente.getId());
        System.out.println(cliente.getEndereco());
    }
}