package util.leitor;

import java.util.HashMap;
import java.util.Map;

public final class LeitorSingleton {

    private static LeitorSingleton instance;
    private Map<TipoEntrada, Leitor> leitorMap = new HashMap<>();

    private LeitorSingleton() {
        leitorMap.put(TipoEntrada.INT, new LeitorInt());
        leitorMap.put(TipoEntrada.STRING, new LeitorString());
        leitorMap.put(TipoEntrada.DOUBLE, new LeitorDouble());
    }

    public static Leitor getInstance(TipoEntrada tipo) {
        if (instance == null) {
            instance = new LeitorSingleton();
        }
        return instance.leitorMap.get(tipo);
    }
}
