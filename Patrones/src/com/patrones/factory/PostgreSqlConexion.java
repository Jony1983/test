package com.patrones.factory;

/**
 * Created by Jony on 19/6/2017.
 */
public class PostgreSqlConexion extends Conexion{
    @Override
    public String descripcion() {
        return "Conexion PostgreSql";
    }
}
