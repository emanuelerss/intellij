import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        System.out.println("Hello and welcome!");

        int varianteint = 10;

        System.out.println("variavel do tipo int:" + varianteint);

        byte variavelbyte = 10;
        System.out.println("variavel do tipo byte:" + variavelbyte);

        short variavelshort = 10;
        System.out.println("variavel do tipo short:" + variavelshort);

        long variavellong = 100000000l;
        System.out.println("variavel do tipo long:" + variavellong);

        boolean variavelboolean = true;
        System.out.println("variavel do tipo boolean:" + variavelboolean);

        char variantechar = 'z';
        System.out.println("variavel do tipo char:" + variantechar);

        float variantefloat = 3.14f;
        System.out.println("variavel do tipo float:" + variantefloat);

        double variantedouble = 3.14159265359;
        System.out.println("variavel do tipo double:" + variantedouble);

        int valor1;
        int valor2;
        valor1 = 10;
        valor2 = 20;
        int soma;
        soma = valor1 + valor2;
        System.out.println("a soma é:" + soma);


        Scanner scanner = new Scanner(System.in);

        int numero = scanner.nextInt();
        System.out.println("numero:"+ numero);



    }
}
