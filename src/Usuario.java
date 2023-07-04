import java.util.Date;

public class Usuario {

    private String Nombre;
    private String Matricula;
    private Date fechaNacimiento;
    private String Cargo;


    protected String nombreUsuario;
    protected String contrasena;
    protected int nivelPrivilegios;

    public Usuario(String nombre,String matricula,Date fechaNac,String cargo){
        this.Nombre = nombre;
        this.Matricula = matricula;
        this.fechaNacimiento=fechaNac;
        this.Cargo = cargo;
    }

    public Usuario(String nombre,String matricula,String cargo){
        this.Nombre = nombre;
        this.Matricula=matricula;
        this.Cargo = cargo;
    }
    public Usuario(){}

    public void setNombre(String nombre){ this.Nombre = nombre;}
    public void setMatricula(String matricula) { this.Matricula = matricula;}
    public void setFechaNacimiento(Date fechaNac) {this.fechaNacimiento=fechaNac;}
    public void setCargo(String cargo){  this.Cargo = cargo;}
    public void setNombreUsuario(String nombreusuario) {this.nombreUsuario = nombreusuario;}
    public void setContrasena(String contrasena){this.contrasena =contrasena;}
    public void setNivelPrivilegios(int privilegios){this.nivelPrivilegios = nivelPrivilegios;}

    public String getNombre(){return Nombre;}
    public String getMatricula(){return Matricula;}
    public Date getFechaNacimiento() {return fechaNacimiento;}
    public String getCargo(){return Cargo;}
    public String getNombreUsuario(){return nombreUsuario;}
    public String getContrasena(){return contrasena;}
    public int getNivelPrivilegios(){return nivelPrivilegios;}


    public String toString(){
        String datos = "";
        datos += "Nombre: " + getNombre() + "\n";
        datos += "Matricula: "+ getMatricula() + "\n";
        datos += "Fecha de nacimiento:" + getFechaNacimiento() + "\n";
        datos += "Cargo:" + getCargo() + "\n";
        return datos;
    }

    public String getDatosUsuario(){
        String datos = "";
        datos += "Nombre: " + getNombre() + "\n";
        datos += "Matricula: "+ getMatricula() + "\n";
        datos += "Cargo:" + getCargo() + "\n";
        return datos;

    }
    //
}
