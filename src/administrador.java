public class administrador extends SuperUsuario {

    private String otorgarPrivilegiosDeAdministrador="contraseña";

    public  administrador(String nombre, String matricula,String cargo, String contraseñaDeValidacion){
        do {
            System.out.println("ingrese una contraseña de acceso valida");
        }while (super.permitirAccesoSuperUsuario(contraseñaDeValidacion) != false);

        super.setNombre(nombre);
        super.setMatricula(matricula);
        super.setCargo(cargo);

    }
    public administrador(){}

    public String getNombre(){return super.getNombre();}
    public String getMatricula(){return super.getMatricula();}
    public String getCargo(){return super.getCargo();}
    public boolean permitirAccesoUsuario(String otorgarPrivilegiosDeADministrador ){
        if(otorgarPrivilegiosDeAdministrador.equals(this.otorgarPrivilegiosDeAdministrador)) {return true;}
        else return false;
    }

    public void EliminarEstudiante(Estudiante nombreEstudiante){}
    public void ModificarEstudiantes(Estudiante nombreEstudiante){}
    public void registrarEstudiantes(Estudiante nombreEstudiante){}

}
