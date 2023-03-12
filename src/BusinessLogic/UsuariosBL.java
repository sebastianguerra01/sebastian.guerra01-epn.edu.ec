package BusinessLogic;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import BusinessLogic.Entities.Users;
import DataAccess.UsuariosDAC;
import Framework.AppException;


public class UsuariosBL {

    public ArrayList<Users> getAllUsuarios() throws AppException {
        try {
            UsuariosDAC user = new UsuariosDAC();

            ArrayList<Users> users = new ArrayList<Users>();

            ResultSet rs = user.getAllUsuarios();

            while (rs.next()) {
                Users u = new Users(rs.getString("USUARIO"), rs.getString("CONTRASENA"));
                users.add(u);
            }
            return users;
        } catch (SQLException e) {
            throw new AppException(e, getClass());
        }
    }
}
