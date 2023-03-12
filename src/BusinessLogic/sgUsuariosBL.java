package BusinessLogic;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import BusinessLogic.Entities.sgUsers;
import DataAccess.sgUsuariosDAC;
import Framework.AppException;


public class sgUsuariosBL {

    public List<sgUsers> sgGetAllUsuarios() throws AppException {
        try {

            sgUsuariosDAC sgUsuariosDAC = new sgUsuariosDAC();
            List<sgUsers> sgUsers = new ArrayList<sgUsers>();

            ResultSet rs = sgUsuariosDAC.sgGetAllUsuarios();

            while (rs.next()) {
                sgUsers us = new sgUsers(rs.getString("USUARIO"), rs.getString("CONTRASENA"));
                sgUsers.add(us);
            }
            return sgUsers;
        } catch (SQLException e) {
            throw new AppException(e, getClass(), "getAllUsers");
        }
    }
}
