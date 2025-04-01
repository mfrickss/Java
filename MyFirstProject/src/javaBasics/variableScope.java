package javaBasics;

public class variableScope {

    static int x =  3; //CLASS -> PODE SER USADA DENTRO DA CLASSE TODA E DOS METODOS ABAIXO

    public static void main(String[] args){

        int x = 1; //LOCAL -> VARIAVEL LOCAL, NÃO PODE SER ACESSADA NOS METODOS. TEM PRIORIDADE!
        System.out.println(x);
        doSomething();
    }
    static void doSomething(){
        int x = 2; //LOCAL
        System.out.println(x);
    }
}
