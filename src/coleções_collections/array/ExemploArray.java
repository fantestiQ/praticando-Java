package coleções_collections.array;

public class ExemploArray {
    public static void main(String[] args) {
        declaracaoArray();    
        tamanhoArray();
        percorrendoArray1();
        percorrendoArray2();
        arrayBidimensional();

    }

    private static void arrayBidimensional() {
        System.out.println("**** arrayBidimensional ****");

        int[][]  array1 = {{20, 14, 10, 12, 45},{ 6, 3, 2309, 1209}};
        int[][]  array2 = {{12, 908, 1, 2, 43},{2}, { 68, 13, 2469, 109}};

        System.out.println("Valores no array1 passados na linha são");
        outputArray(array1);



        System.out.println("Valores no array2 passados na linha são");
        outputArray(array2);

    }

    private static void outputArray(int[][] array) {

        for (int linha = 0 ; linha < array.length; linha++){

            System.out.println("linha:"+ linha);
            for (int coluna = 0; coluna < array[linha].length; coluna++) {
                System.out.printf("%d ", array[linha][coluna]);
            }
            System.out.println("\n");
        }
    }

    private static void percorrendoArray2() {
        System.out.println("**** percorrendoArray2 ****");

        int[] arrayNum = {20, 14, 10, 12, 45, 6, 3, 2309, 1209};
        for (int i = 0; i < arrayNum.length; i++) {
            System.out.println(arrayNum[i]);
        }
    }

    private static void percorrendoArray1() {
        System.out.println("**** percorrendoUmArray ****");

        int[] arrayNum = {20, 14, 10, 12, 45, 6, 3, 2309, 1209};
        int total = 0 ;
        for (int i : arrayNum){
            total += i;
            System.out.println(total);
        }

    }

    private static void tamanhoArray() {
        System.out.println("**** declaracaoArray ****");
        int[] arrayUm = {20, 14, 10, 12, 45, 6, 3, 2309, 1209};
        int[] arrayDois = {60, 12, 80, 92, 43, 566, 93};

        if (arrayDois.length>8){
            System.out.println("Tamanho do ArrayDois - Maior que 8");
        }else System.out.println("Tamanho do ArrayDois - Menor que 8");

        System.out.println("Tamanho do ArrayUm - " + arrayUm.length);


    }

    private static void declaracaoArray() {
        System.out.println("**** declaracaoArray ****");

        int[] a  = new int [4];// < Criando instância para uso de array

        //outra forma:
        int[] b;
         b = new int[10];

         //Declarando vários arrays
         int[] r = new int[14], s = new int[10];

         //inicializando array com valores:
        int[] iniciandoValores = {20, 14, 10, 12, 45, 6, 3};

        // DECLARA UM ARRAY DE INTEIROS
        int[] meuArray;

        //Aloca na memória para 10 inteiros
        meuArray = new int[10];

        //Inicializa elementos e recebe valores:
        meuArray[0] = 100;
        meuArray[1] = 12;
        meuArray[2] = 32;
        meuArray[3] = 9;
        meuArray[4] = 95;
        meuArray[5] = 43;
        meuArray[6] = 78;
        meuArray[7] = 33;
        meuArray[8] = 76;
        meuArray[9] = 52;

        System.out.println(meuArray[9]);
        System.out.println(meuArray[2]);

    }

}
