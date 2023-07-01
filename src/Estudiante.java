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



}
