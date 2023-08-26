package util.leitor;

import java.util.InputMismatchException;
import java.util.Scanner;

public class LeitorInt implements Leitor {
    @Override
    public String executar(Scanner terminal) throws InputMismatchException {
        Integer numero = terminal.nextInt();
        return numero.toString();
    }
}


