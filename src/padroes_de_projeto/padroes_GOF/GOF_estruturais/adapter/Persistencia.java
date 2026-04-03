package padroes_de_projeto.padroes_GOF.GOF_estruturais.adapter;

import java.io.File;

public interface Persistencia {

    public void gravar(File file);

    public File ler(String path);
}
