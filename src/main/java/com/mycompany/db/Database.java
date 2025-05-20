
package com.mycompany.db;

import com.zaxxer.hikari.HikariConfig;
import com.zaxxer.hikari.HikariDataSource;
import java.sql.Connection;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

public class Database {
    protected Connection conexion;
    private static HikariDataSource dataSource;

    // Método para inicializar el pool (llamado desde main)
    public static void inicializarPool() {
        try {
            HikariConfig config = new HikariConfig();
            config.setJdbcUrl("jdbc:mysql://turntable.proxy.rlwy.net:42923/ppi"
                + "?useSSL=false"
                + "&serverTimezone=UTC"
                + "&allowPublicKeyRetrieval=true");
            config.setUsername("root");
            config.setPassword("VqZnfVhDrwiMsXjJvvUGJhKqwvFjZlbq");
            
            config.setMaximumPoolSize(10);
            config.setConnectionTimeout(30000);
            
            dataSource = new HikariDataSource(config);
            Logger.getLogger(Database.class.getName()).log(Level.INFO, "Pool de conexiones inicializado");
            
        } catch (Exception e) {
            Logger.getLogger(Database.class.getName()).log(Level.SEVERE, "Error al inicializar pool", e);
        }
    }

    // Métodos originales que usan tus DAOs
    public void Conectar() throws ClassNotFoundException, SQLException {
        if (conexion == null || conexion.isClosed()) {
            conexion = dataSource.getConnection();
        }
    }

    public void Cerrar() throws SQLException {
        if (conexion != null && !conexion.isClosed()) {
            conexion.close(); // La conexión vuelve al pool
        }
    }

    // Método para cerrar el pool
    public static void cerrarPool() {
        if (dataSource != null && !dataSource.isClosed()) {
            dataSource.close();
            Logger.getLogger(Database.class.getName()).log(Level.INFO, "Pool de conexiones cerrado");
        }
    }
}




























/*
package com.mycompany.db;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import com.zaxxer.hikari.HikariConfig;
import com.zaxxer.hikari.HikariDataSource;

public class Database {

    private static HikariDataSource dataSource;

    static {
        HikariConfig config = new HikariConfig();
        config.setJdbcUrl("jdbc:mysql://turntable.proxy.rlwy.net:42923/ppi");
        config.setUsername("root");
        config.setPassword("VqZnfVhDrwiMsXjJvvUGJhKqwvFjZlbq");
        config.addDataSourceProperty("cachePrepStmts", "true");
        config.addDataSourceProperty("prepStmtCacheSize", "250");
        config.addDataSourceProperty("prepStmtCacheSqlLimit", "2048");
        dataSource = new HikariDataSource(config);
    }

    protected Connection conexion;

    private final String JDBC_DRIVER = "com.mysql.cj.jdbc.Driver";
    private final String DB_URL = "jdbc:mysql://turntable.proxy.rlwy.net:42923/ppi";

    private final String USER = "root";
    private final String PASS = "VqZnfVhDrwiMsXjJvvUGJhKqwvFjZlbq";

    public void Conectar() throws ClassNotFoundException {
        try {

            Class.forName(JDBC_DRIVER);
            System.out.println("Conectando");
            conexion = DriverManager.getConnection(DB_URL + "?useSSL=false&serverTimezone=UTC", USER, PASS);
        } catch (SQLException ex) {
            System.out.println("No se pudo conectar");
            Logger.getLogger(Database.class.getName()).log(Level.SEVERE, null, ex);
        }

    }

    public void Cerrar() throws SQLException {
        if (conexion != null) {
            if (conexion.isClosed()) {
                conexion.close();
            }
        }
    }
}

*/