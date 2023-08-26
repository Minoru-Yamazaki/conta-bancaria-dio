package util.leitor;

import java.util.InputMismatchException;
import java.util.Scanner;

public interface Leitor {
    public abstract String executar(Scanner terminal) throws InputMismatchException;
}
