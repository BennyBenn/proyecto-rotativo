import java.util.Date;

public class Usuario {

    private String Nombre;
    private String Matricula;
    private Date fechaNacimiento;
    private String Cargo;

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


    public String getNombre(){return Nombre;}
    public String getMatricula(){return Matricula;}
    public Date getFechaNacimiento() {return fechaNacimiento;}
    public String getCargo(){return Cargo;}
}
