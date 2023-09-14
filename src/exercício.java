import java.util.Scanner;
public class exercício {
    public static void main(String[] args) {
        float valor1 = 8;
        float valor2 = 9;
        float valor3 = 7;
        float valor4 = 4;
        float valor5 = 5;
        float valor6 = 6;

        float soma1 = valor1 + valor2 + valor3;
        float soma2 = valor4 + valor5 + valor6;
        float media1 = soma1 / 3;
        float media2 = soma2 / 3;
        float soma3 = media1 + media2;
        float media3 = soma3 / 2;

        System.out.println("valor da media 7,8,9 é " + media1);
        System.out.println("valor da media 4,5,6 é " + media2);
        System.out.println("soma das medias " + soma3);
        System.out.println("valor da meedia geral é " + media3);
    }}
