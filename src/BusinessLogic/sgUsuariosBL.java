package BusinessLogic;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import BusinessLogic.Entities.sgUsers;
import DataAccess.sgUsuariosDAC;
import Framework.AppException;


public class sgUsuariosBL {

    public ArrayList<sgUsers> sgGetAllUsuarios() throws AppException {
        try {
            sgUsuariosDAC sgUser = new sgUsuariosDAC();

            ArrayList<sgUsers> sgUsers = new ArrayList<sgUsers>();

            ResultSet rs = sgUser.sgGetAllUsuarios();

            while (rs.next()) {
                sgUsers u = new sgUsers(rs.getString("USUARIO"), rs.getString("CONTRASENA"));
                sgUsers.add(u);
            }
            return sgUsers;
        } catch (SQLException e) {
            throw new AppException(e, getClass());
        }
    }
}
