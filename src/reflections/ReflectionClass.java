package reflections;

@ReflectionTeste("Teste")
public class ReflectionClass extends SuperReflection implements IReflection {

    @ReflectionTeste("codigo")
    private Long codigo;

    @ReflectionTeste("name")
    private String name;

    @ReflectionTeste("saldo")
    private  Double saldo;

    public ReflectionClass() {
    }

    public ReflectionClass(Long codigo) {
        this.codigo = codigo;
    }

    public Long getCodigo() {
        return codigo;
    }

    public void setCodigo(Long codigo) {
        this.codigo = codigo;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Double getSaldo() {
        return saldo;
    }

    public void setSaldo(Double saldo) {
        this.saldo = saldo;
    }

    @Override
    public String toString() {
        return "ReflectionClass{" +
                "codigo=" + codigo +
                ", name='" + name + '\'' +
                ", saldo=" + saldo +
                '}';
    }
}
