package com.patrones.factory;

import java.util.Scanner;

/**
 * Created by Jony on 19/6/2017.
 */
public class Fabrica {


    protected String tipo;


    public Fabrica(String t) {
    tipo=t;

    }

    public Conexion creaConexion(){
        if(tipo.equalsIgnoreCase("Oracle")){
            return new OracleConexion();

        }else if(tipo.equalsIgnoreCase("Mysql")){
            return new MySqlServerConexion();
        }else if(tipo.equalsIgnoreCase("PostgreSql")) {
            return new PostgreSqlConexion();
        }else if(tipo.equalsIgnoreCase("sql")) {
            return new SqlServerConexion();
        }else {
            return new PostgreSqlConexion();
        }

    }









        }
