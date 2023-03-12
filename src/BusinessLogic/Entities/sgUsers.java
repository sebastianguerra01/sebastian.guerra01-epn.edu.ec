package BusinessLogic.Entities;

// Creamos la entidad que nos permite el contacto con la base de datos

public class sgUsers {
    String sgUsuarios;
    String sgContrasena;

    public sgUsers(String sgUsuarios, String sgContrasena) {
        this.sgUsuarios = sgUsuarios;
        this.sgContrasena = sgContrasena;
    }

    public String sgGetUsuarios() {
        return sgUsuarios;
    }

    public void sgSetUsuarios(String sgUsuarios) {
        this.sgUsuarios = sgUsuarios;
    }

    public String sgGetContrasenas() {
        return sgContrasena;
    }

    public void sgSetContrasenas(String sgContrasena) {
        this.sgContrasena = sgContrasena;
    }

}

