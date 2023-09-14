import java.util.Scanner;
public class exercicio8 {
    public static void main(String[] args) {
        double cachorro = 54.2;
        double cachorro2 = 20;
        double conta = cachorro - cachorro2;
        System.out.println("Média de cachorros no Brasil: " + cachorro);
        System.out.println("Média de cachorros na rua no Brasil: " + cachorro2);
        System.out.println("Média de cachorros tem uma casa no Brasil: " + conta);

        Scanner scanner = new Scanner(System.in);
        System.out.println("Escreva quantos cachorros tem em sua residência e quantos tem em seu bairro: ");
        System.out.println("Em sua casa:");
        int casa= scanner.nextInt();
        System.out.println("Em seu bairro:");
        int bairro= scanner.nextInt();
        int total = casa+bairro;
        System.out.println("A soma dos cachorros é de :" + total);

    }}