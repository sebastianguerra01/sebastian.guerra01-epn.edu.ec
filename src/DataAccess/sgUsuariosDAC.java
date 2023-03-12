package DataAccess;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import Framework.AppConfiguration;
import Framework.AppException;

public class sgUsuariosDAC extends sgSQLiteDataHelper {

        public sgUsuariosDAC() {
            super(AppConfiguration.getDBPathConnection());
        }
    
        public ResultSet sgGetAllUsuarios() throws AppException{
            try
            {
                String sql = "SELECT * FROM USUARIOS_REGISTRADOS ";

                return getResultSet(sql);
            } catch (SQLException e) 
            {
                System.out.println(e.getMessage());
            }
            return null;
        }

        public ResultSet getUserComper(String User) throws AppException { 
            try {
                String sql = "SELECT USUARIOS"
                            +"FROM USUARIOS_REGISTRADOS"
                            +"WHERE USUARIOS LIKE ? ";    
                Connection conn = getConnection();
                PreparedStatement pstmt  = conn.prepareStatement(sql);
                pstmt.setString(1, "%" + User.trim() + "%");
                return pstmt.executeQuery();
            } 
            catch (SQLException e) {
                throw new AppException(e, getClass());
            }
        }
    
    }
