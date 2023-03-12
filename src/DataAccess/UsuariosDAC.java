package DataAccess;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import Framework.AppConfiguration;
import Framework.AppException;

public class UsuariosDAC extends SQLiteDataHelper {

        public UsuariosDAC() {
            super(AppConfiguration.getDBPathConnection());
        }
    
        public static ResultSet getAllUsuarios() {
            String sql = "SELECT USUARIO, CONTRASENA FROM USUARIOS_REGISTRADOS WHERE USUARIO = ?";
            try (ResultSet rs = getResultSet(sql)) {
                return getResultSet(sql);
            } catch (SQLException e) {
                System.out.println(e.getMessage());
            }
            return null;
        }
    
    }
