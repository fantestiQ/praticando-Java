package test;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PrimeiroTesteTest {

    @Test
    public void primeiroTest(){
        String nome = "Isac";
    Assertions.assertNotEquals("Isac1",nome, ()-> "Os valores são iguais!");
    }
    @Test
    public void segundoTest(){
        String nome = "Isac";
        Assertions.assertEquals("Isac",nome, ()-> "Os valores não são iguais!");
    }

}