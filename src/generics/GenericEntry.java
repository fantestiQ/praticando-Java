package generics;

public class GenericEntry<T, E> {
    private T data;
    private E value;

    public GenericEntry(T data){
        this.data =  data;
    }

    public T getData() {
        return data;
    }

    public E getValue() {
        return value;
    }
}
