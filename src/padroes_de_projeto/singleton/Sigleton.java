package padroes_de_projeto.singleton;

public class Sigleton {

    private static Sigleton sigleton;
    private String value;
    private Sigleton(String value){
        this.value = value;
    }

    public static synchronized Sigleton getSigleton(String value){
        if (sigleton == null){
            sigleton = new Sigleton(value);
        }
        return sigleton;
    }

    public String getValue() {
        return value;
    }
}
