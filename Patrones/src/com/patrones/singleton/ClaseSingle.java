package com.patrones.singleton;

/**
 * Sirve para obligar a crear una sola instancia de clase desde dentro y que ese objeto tenga los mismos atributo static
 * y metodos static
 */
public final class ClaseSingle {
    public final static ClaseSingle clase= new ClaseSingle();
    public final static String nombre = "Fulanito";

    private ClaseSingle(){
        System.out.println(nombre);
    }


    public static ClaseSingle getClaseSingle(){

        return clase;
    }






}
