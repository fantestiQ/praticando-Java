package exception;

public class ClienteNaoEncontrado2Exception extends Exception{

    private Exception ex;

    public ClienteNaoEncontrado2Exception(String msg, Exception e) {
        super(msg);
        this.ex = e;
    }
}
