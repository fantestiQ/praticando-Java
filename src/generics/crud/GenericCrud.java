package generics.crud;

import generics.crud.domain.Aluno;

import java.util.Collection;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public abstract class GenericCrud<T extends IPersistencia> implements IGenericCrud<T>{

    private  Map<Class, Map<Long, T>> map;

    public GenericCrud(){
        this.map = new HashMap<>();
        Map<Long, T> mapaInterno = this.map.get(getClassType());
        if (mapaInterno == null){
            mapaInterno = new HashMap<>();
            this.map.put(getClassType(),mapaInterno);
        }
    }

    public abstract Class<T> getClassType();

    public  abstract  void atualizarDados(T entity, T entityCadastrado);

    @Override
    public Boolean cadastrar(T entity) {
        Map<Long, T> mapInterno = this.map.get(getClassType());
        if (mapInterno.containsKey(entity.retornaCod())){
            return null;
        }
        mapInterno.put(entity.retornaCod(), entity);
        return true;
    }

    @Override
    public void excluir(Long codigo) {
        Map<Long, T> mapInterno = this.map.get(getClassType());
        T entityCadastrada = mapInterno.get(codigo);

        if (entityCadastrada != null){
            this.map.remove(codigo,entityCadastrada);
        }
    }

    @Override
    public void alterar(T entity) {
        Map<Long, T> mapInterno = this.map.get(getClassType());
        T entityCadastrada = mapInterno.get(entity.retornaCod());

        if (entityCadastrada != null){
            atualizarDados(entity, entityCadastrada);
        }
    }

    @Override
    public T consultar(Long codigo) {
        Map<Long, T> mapInterno = this.map.get(getClassType());
        return  mapInterno.get(codigo);

    }

    @Override
    public Collection<T> buscarTodos() {
        Map<Long, T> mapInterno = this.map.get(getClassType());

        return mapInterno.values();

    }
}
