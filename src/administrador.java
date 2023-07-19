import java.io.*;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
public class administrador extends Usuario implements Autenticar {

    protected int NIVEL_PRIVILEGIO = 1;
    private String otorgarPrivilegiosDeAdministrador="contraseña";
    private String asistencia;
    private static int totalAsistencias;

    public  administrador(String nombre, String matricula,String cargo, String contraseñaDeValidacion){
       /*do {
            System.out.println("ingrese una contraseña de acceso valida");
        }while (super.permitirAccesoSuperUsuario(contraseñaDeValidacion) != false);

        super.setNombre(nombre);
        super.setMatricula(matricula);
        super.setCargo(cargo);*/

    }
    public administrador(){}

    public String getNombre(){return super.getNombre();}
    public String getMatricula(){return super.getMatricula();}
    public String getCargo(){return super.getCargo();}
    public boolean permitirAccesoUsuario(String otorgarPrivilegiosDeADministrador ){
        if(otorgarPrivilegiosDeAdministrador.equals(this.otorgarPrivilegiosDeAdministrador)) {return true;}
        else return false;
    }
    public void setAsistencia(String asistencia ){
        this.asistencia=asistencia;
    }
    public boolean controlASistencias(){
        if (asistencia == "n"){
            totalAsistencias++;
            return true;
        }else return false;
    }
    /*
    metodo en construccion
    public void generarReportes(String saludo, String cuerpo){
        String rutaArchivo = "C:\\carpeta\\archivo.txt"; // Especificar la ruta completa del archivo
        try {
            FileWriter archivo = new FileWriter(new File(rutaArchivo));
            archivo.write(saludo + "\n");
            archivo.write(cuerpo);
            archivo.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }*/

    public void EliminarEstudiante(Estudiante nombreEstudiante){}
    public void ModificarEstudiantes(Estudiante nombreEstudiante){}
    public void registrarEstudiantes(Estudiante nombreEstudiante){}


    @Override
    public void setClave(String clave) {

    }

    @Override
    public boolean IniciarSesion(String clave) {
        return false;
    }
}
