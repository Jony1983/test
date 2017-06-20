package com.patrones.factory;

import java.util.Scanner;

/**
 * Created by Jony on 20/6/2017.
 */
public class Contabilidad {
    public static void main(String[] args) {


        Scanner scr = new Scanner(System.in);
        Fabrica miFabrica;
        Conexion miConexion;

        System.out.println("Ingrese tipo de BD: ");
        String a = scr.nextLine();

        miFabrica = new Fabrica(a);

        //mi conexion es una clase abstracta que no se puede instanciar, pero si a su
        // herencia por lo tanto el metodo creaConexion devuelve un objeto de una clase que hereda
        // de Conexion, genial!

        miConexion = miFabrica.creaConexion();

        String salida = "Esta conectado con: " + miConexion.descripcion();
        System.out.println(salida);
    }
}
