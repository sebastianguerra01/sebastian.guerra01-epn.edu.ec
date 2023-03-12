/*  Copyright (C) 2K23, 
 *  
 *  Version 1.0
 */
package DataAccess;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

/**
 * <b> SQLiteDataHelper, </b> permite la gestion y el acceso a los datos a una base de datos SQLite3
 */
public abstract class sgSQLiteDataHelper {
    private static String DBPathConnection = "jdbc:sqlite:data\\Usuarios.db";
    private static Connection conn = null;
    public sgSQLiteDataHelper(String  dbPathConnection){
        // Definir la cadena de conneccion : jdbc:sqlite:data\\TinderPet.db
        if (!dbPathConnection.isEmpty())
            sgSQLiteDataHelper.DBPathConnection = "jdbc:sqlite:data\\Usuarios.db";
    }
    /**
     * getDBConnection, obtiene el cadena de coneccion a la base de datos
     * @return
     */
    protected String getDBConnection() {
        return DBPathConnection;
    }

    /**
     * <b>connSQLITE</b>, permite crear una sola instancia-Singeton para la coneccion a la base de datos
     * @return retorna coneccion a la base de datos definida en el contructor
     * @throws SQLException
     */
    protected static Connection getConnection() throws SQLException{
        if(conn == null)
            conn = DriverManager.getConnection(DBPathConnection);
        return conn;
    }

    protected static ResultSet getResultSet(String sql) throws SQLException     
    {
        Connection conn = null;
        Statement  stmt = null;
        ResultSet  rs   = null;
       // try {
            conn = getConnection();             
            stmt = conn.createStatement();     
            rs   = stmt.executeQuery(sql);     
        return rs;
    }
}

