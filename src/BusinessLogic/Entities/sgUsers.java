package BusinessLogic.Entities;

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

