import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) {
        Scanner terminal = new Scanner(System.in);

        System.out.println("Por favor, digite o número da Agência");
        Integer numero = terminal.nextInt();
        terminal.nextLine();

        System.out.println("Por favor, digite a Agência");
        String agencia = terminal.nextLine();

        System.out.println("Por favor, Seu nome");
        String cliente = terminal.nextLine();

        System.out.println("Por favor, o saldo inicial");
        Double saldo = terminal.nextDouble();


        imprimirMensagemContaCriada(cliente, agencia, numero.toString(), saldo.toString());
    }

    private static void imprimirMensagemContaCriada(String cliente, String agencia, String numero, String saldo) {
        String mensagem = "Olá ".concat(cliente)
                .concat(" obrigado por criar uma conta em nosso banco, sua agência é ").concat(agencia)
                .concat(" conta ").concat(numero).concat(" e seu saldo ")
                .concat(saldo).concat(" já está disponível para saque.");

        System.out.println(mensagem);
    }
}