package util.leitor;

import java.util.InputMismatchException;
import java.util.Scanner;

public class LeitorDouble implements Leitor{
    @Override
    public String executar(Scanner terminal) throws InputMismatchException {
        Double saldo = terminal.nextDouble();
        return saldo.toString();
    }
}
