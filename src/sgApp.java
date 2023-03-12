import java.util.List;
import java.util.ArrayList;
import BusinessLogic.sgUsuariosBL;
import UserInterface.*;

import BusinessLogic.Entities.sgUsers;
import pkUtilitario.sgHandleInOutput;

public class sgApp {

    public static String SGNOMBRE_COMPLETO = "Sebastian Tadeo Guerra Ceron";
    public static String SGCEDULA = "1756168058"; 
    public static String SGUSER;
    
    public static void main(String[] args) throws Exception {

        sgLogin login = new sgLogin();
        login.setVisible(true); // muestra la ventana
        } 

}
