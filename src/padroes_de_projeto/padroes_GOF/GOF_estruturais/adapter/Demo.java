package padroes_de_projeto.padroes_GOF.GOF_estruturais.adapter;

import java.io.File;

public class Demo {
    public static void main(String[] args) {
        String file = "teste";
        DropBox drop = new DropBox();
        Persistencia adapter = new DropBoxAdapter(drop);
        adapter.gravar(new File(file));
    }
}
