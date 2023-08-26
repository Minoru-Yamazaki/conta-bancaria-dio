package util.leitor;

import java.util.InputMismatchException;
import java.util.Scanner;

public class LeitorString implements Leitor{
    @Override
    public String executar(Scanner terminal) throws InputMismatchException {
        return terminal.nextLine();
    }
}
