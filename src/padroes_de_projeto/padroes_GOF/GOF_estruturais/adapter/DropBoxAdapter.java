package padroes_de_projeto.padroes_GOF.GOF_estruturais.adapter;

import java.io.File;

public class DropBoxAdapter implements Persistencia{
    private DropBox dropBox;

    public DropBoxAdapter(DropBox dropBox) {
        this.dropBox = dropBox;
    }

    @Override
    public void gravar(File file) {
        dropBox.upload(new DropBoxFile(file.getAbsolutePath()));
    }

    @Override
    public File ler(String id) {
        DropBoxFile file = dropBox.download(id);
        return new File(file.getLocalPath());
    }
}
