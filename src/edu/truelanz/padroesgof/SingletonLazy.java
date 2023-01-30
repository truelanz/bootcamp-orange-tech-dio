package edu.truelanz.padroesgof;

/**
 * Padrão SingletonLazy "Preguiçoso".
 * Instancia com uma condicional só quando ela for invocada;
 */

public class SingletonLazy {

    private static SingletonLazy instancia;

    private SingletonLazy() {
        super();
    }

    public static SingletonLazy getInstancia() {
        if(instancia == null) {
            instancia = new SingletonLazy();
        }
        return instancia;
    }
    
}
