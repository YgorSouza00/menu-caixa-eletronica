import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String nome;
        String tipoC;
        double saldoC = 1000;

        System.out.print("Insira seu Nome: ");
        nome = sc.nextLine();
        System.out.print("Insira seu Tipo de conta: ");
        tipoC = sc.nextLine();
        System.out.println("**********************************************************\n" +
                "Dados iniciais do cliente:\n" +
                "\n" +
                "Nome:"  + nome +
                "\nTipo de conta:" + tipoC +
                "\nSaldo inicial: R$" + saldoC +
                "\n**********************************************************");

        int opcao = 0;
        while (opcao != 4) {
            System.out.println("OPÇAO\n" +
                    "1- Consultar saldos\n" +
                    "2- Depositar\n" +
                    "3- transferir valor\n" +
                    "4- Sair\n" +
                    "\n" +
                    "Digite a opcao desejada:\n");

            opcao = sc.nextInt();

            switch (opcao) {
                case 1:
                    System.out.println("Seu saldo é:" + saldoC);
                    break;
                case 2:
                    System.out.println("Digite o valor a Depositar:");
                    double valoradd = sc.nextDouble();
                    saldoC += valoradd;
                    System.out.println("Saldo atual é: " + saldoC);
                    break;
                case 3:
                    System.out.println("Digite o valor a trasferir:");
                    double valorT = sc.nextDouble();
                    if (saldoC >= valorT) {
                        saldoC -= valorT;
                        System.out.println("Saldo atual é: " + saldoC);
                    } else {
                        System.out.println("Saldo insuficiente.");
                    }
                    break;
                default:
                    System.out.println("opcao invalida");
            }
        }
    }
}