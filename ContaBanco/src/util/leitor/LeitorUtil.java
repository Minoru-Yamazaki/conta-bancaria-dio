package util.leitor;

import java.util.InputMismatchException;
import java.util.Scanner;

public class LeitorUtil {

    public static String lerTerminal(String mensagem, TipoEntrada tipo) {
        Scanner terminal = new Scanner(System.in);
        Leitor leitor = LeitorSingleton.getInstance(tipo);

        while (true){
            try {
                System.out.println(mensagem);
                return leitor.executar(terminal);
            }catch (InputMismatchException e){
                System.out.println("Valor digitado inválido! Digite novamente");
                terminal = new Scanner(System.in);
            }
        }
    }
}
