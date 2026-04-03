package generics.crud;

import java.util.Collection;

public interface IGenericCrud<T extends IPersistencia> {
    public Boolean cadastrar(T entity);

    public void excluir(Long codigo);

    public void alterar (T entity);

    public T consultar(Long codigo);

    public Collection<T> buscarTodos();
}
