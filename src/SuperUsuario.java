public class SuperUsuario extends Usuario implements Autenticar {
    private String otorgarPrivilegiosDeSuperUsuarios="supercontraseña";
    private String otorgarPrivilegiosDeAdministrador="contraseña";
    public SuperUsuario(String nombre,String matricula,String cargo){
        super.setNombre(nombre);
        super.setMatricula(matricula);
        super.setCargo(cargo);

    }
    public SuperUsuario(){}
    public boolean permitirAccesoAdministrador(String otorgarPrivilegiosDeAdministrador ){
        if(otorgarPrivilegiosDeAdministrador.equals(this.otorgarPrivilegiosDeAdministrador)) {return true;}
        else return false;
    }
    public boolean permitirAccesoSuperUsuario(String otorgarPrivilegiosDeSuperUsuarios ){
        if(otorgarPrivilegiosDeSuperUsuarios.equals(this.otorgarPrivilegiosDeSuperUsuarios)) {return true;}
        else return false;
    }
    public void eliminarAdministradores(administrador nombreAdmoinistrador){}
    public void modificarAdministradores(administrador nombreAdmoinistrador){}
    public void registrarAdministradores(administrador nombreAdmoinistrador){}
    public void eliminarEstudiante(Estudiante nombreEstudiante){}
    public void registarEstudiante(Estudiante nombreEstudiante){}
    public void modificarEstudiantes(Estudiante nombreEstudiante){}


    @Override
    public void setClave(String clave) {

    }

    @Override
    public boolean IniciarSesion(String clave) {
        return false;
    }
}
