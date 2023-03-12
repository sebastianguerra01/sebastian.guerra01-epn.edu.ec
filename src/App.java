import java.util.List;
import java.util.ArrayList;
import BusinessLogic.sgUsuariosBL;

import BusinessLogic.Entities.sgUsers;
import utilitario.HandleInOutput;

public class App {

    public static String SGNOMBRE_COMPLETO = "Sebastian Tadeo Guerra Ceron";
    public static String SGCEDULA = "1756168058"; 
    public static String SGUSER;
    
    public static void main(String[] args) throws Exception {

        List<sgUsers> usuarios = new ArrayList<sgUsers>();

        sgLogin(usuarios);
    }

    public static void sgLogin(List<sgUsers> users)
    {
        int sgIntentos = 3;
        do
        {
            System.out.println("\n\n \t\t ........................ ");
            String u = HandleInOutput.getCaracteres  ("\t\t +  usuario: ");
            String c = u + HandleInOutput.getCaracteres  ("\t\t +  clave  : ");
            System.out.println("\t\t ........................ ");
            for (sgUsers sgU : users) 
                if( c.equals(users))
                    {
                    SGUSER = u.toUpperCase();
                    System.out.println("\n :: Bienvenido "+ SGUSER);
                    }
            System.out.println("\t\t * Nro de intentos: "+ --sgIntentos );
        } while (sgIntentos > 0);
        System.out.println("\n\n \t :(  Lo sentimos tu usuario y clave son incorrectos..! " );
    }
}
