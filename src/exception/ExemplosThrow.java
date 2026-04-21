package exception;

import com.sun.jdi.DoubleValue;

public class ExemplosThrow {

    public static void main(String[] args) throws LimiteSaldoException {
        saque(460.00);
        saqueSemThrows(300.00);

    }

    public static void saque(Double value) throws LimiteSaldoException{
        if (value > 400){
            throw new LimiteSaldoException("Saque ultrapassa o limite!");
        }
        else System.out.println("Valor retirado da conta: " + value);
    }
    public static void saqueSemThrows(Double value){
        if (value > 400){
            throw new IllegalArgumentException("Saque ultrapassa o limite!");
        }
        else System.out.println("Valor retirado da conta: " + value);
    }
}
