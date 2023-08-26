import util.leitor.LeitorUtil;
import util.leitor.TipoEntrada;

import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) {

        String numero = LeitorUtil.lerTerminal("Por favor, digite o número da Agência", TipoEntrada.INT);
        String agencia = LeitorUtil.lerTerminal("Por favor, digite a Agência", TipoEntrada.STRING);
        String cliente = LeitorUtil.lerTerminal("Por favor, Seu nome", TipoEntrada.STRING);
        String saldo = LeitorUtil.lerTerminal("Por favor, o saldo inicial (ex.: 12,5)", TipoEntrada.DOUBLE);

        imprimirMensagemContaCriada(cliente, agencia, numero, saldo);
    }

    private static void imprimirMensagemContaCriada(String cliente, String agencia, String numero, String saldo) {
        String mensagem = "Olá ".concat(cliente)
                .concat(" obrigado por criar uma conta em nosso banco, sua agência é ").concat(agencia)
                .concat(" conta ").concat(numero).concat(" e seu saldo ")
                .concat(saldo).concat(" já está disponível para saque.");

        System.out.println(mensagem);
    }
}