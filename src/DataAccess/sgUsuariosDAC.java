package DataAccess;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import Framework.AppConfiguration;
import Framework.AppException;

public class sgUsuariosDAC extends SQLiteDataHelper {

        public sgUsuariosDAC() {
            super(AppConfiguration.getDBPathConnection());
        }
    
        public static ResultSet sgGetAllUsuarios() {
            String sql = "SELECT * FROM USUARIOS_REGISTRADOS ";
            try (ResultSet rs = getResultSet(sql)) {
                return getResultSet(sql);
            } catch (SQLException e) {
                System.out.println(e.getMessage());
            }
            return null;
        }
    
    }
