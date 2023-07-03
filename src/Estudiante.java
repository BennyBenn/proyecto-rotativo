import java.util.Date;

public class Estudiante extends Usuario implements Autenticar{
    private String Carrera;
    private int Semestre;
    private String Grupo;

    public Estudiante(String nombre, String matricula, Date fechanac,String carrera,int semestre,String grupo){

        super.setNombre(nombre);
        super.setMatricula(matricula);
        super.setFechaNacimiento(fechanac);
        super.setCargo("Estudiante");
        this.Carrera = carrera;
        this.Semestre = semestre;
        this.Grupo = grupo;

    }

    public Estudiante(String nombre, String matricula,String carrera,int semestre,String grupo){
        super.setNombre(nombre);
        super.setMatricula(matricula);
        super.setCargo("Estudiante");
        this.Carrera = carrera;
        this.Semestre = semestre;
        this.Grupo = grupo;
    }
    
    public void setCarrera(String carrera){this.Carrera = carrera;}
    public void setSemestre(int semestre){this.Semestre = semestre;}
    public void setGrupo(String grupo){this.Grupo=grupo;}
    
    
    public String getCarrera(){return Carrera;}
    public int getSemestre(){return Semestre;}
    public String getGrupo(){return Grupo;}
    
    public String toString(){
        String datos = "";
        datos += "Nombre: " + super.getNombre() + "\n";
        datos += "Matricula: "+ super.getMatricula() + "\n";
        datos += "Fecha de nacimiento:" + super.getFechaNacimiento() + "\n";
        datos += "Cargo:" + super.getCargo() + "\n";
        datos += "Carrera:" + getCarrera() + "\n";
        datos += "Semestre" + getSemestre() + "\n";
        datos += "Grupo" + getGrupo() + "\n";
        return datos;
    }

    public String getDatosAlumno(){
        String datos = "";
        datos += "Nombre: " + super.getNombre() + "\n";
        datos += "Matricula: "+ super.getMatricula() + "\n";
        datos += "Carrera:" + getCarrera() + "\n";
        datos += "Semestre" + getSemestre() + "\n";
        datos += "Grupo" + getGrupo() + "\n";
        return datos;
    }

    @Override
    public void setClave(String clave) {

    }

    @Override
    public boolean IniciarSesion(String clave) {
        return false;
    }
    //
}
