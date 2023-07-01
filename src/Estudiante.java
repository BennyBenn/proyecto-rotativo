import java.util.Date;

public class Estudiante extends Usuario{
    private String Carrera;
    private int Semestre;
    private String Grupo;

    public Estudiante(String nombre, String matricula, Date fechanac,String cargo,String carrera,int semestre,String grupo){
        super.setNombre(nombre);
        super.setMatricula(matricula);
        super.setFechaNacimiento(fechanac);
        super.setCargo(cargo);
        this.Carrera = carrera;
        this.Semestre = semestre;
        this.Grupo = grupo;
    }

    public Estudiante(String nombre, String matricula, String cargo,String carrera,int semestre,String grupo){
        super.setNombre(nombre);
        super.setMatricula(matricula);
        super.setCargo(cargo);
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
    
}
