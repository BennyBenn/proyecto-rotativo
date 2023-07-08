import java.util.Scanner;
import java.text.SimpleDateFormat;
import java.util.Date;
public class Evaluacion {
    private Scanner sc = new Scanner(System.in);
    SimpleDateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy");
    public void evaluar(String opcion, Estudiante modificacion){
        switch (opcion){
            case "1":
                System.out.println("Ingrese el nuevo nombre: ");
                String nombre = sc.nextLine();
                modificacion.setNombre(nombre);
                break;
            case "2":
                System.out.println("Ingrese la nueva matricula: ");
                String matricula = sc.nextLine();
                modificacion.setMatricula(matricula);
                break;
            case "3":
                System.out.println("Ingrese la fecha de nacimiento: ");
                String fechaNacimiento = sc.nextLine();
                /*modificacion.setFechaNacimiento(fechaNacimiento);*/
                break;
            case "4":
                System.out.println("Ingrese la carrera: ");
                String carrera = sc.nextLine();
                modificacion.setCarrera(carrera);
                break;
            case "5":
                System.out.println("Ingrese el semestre: ");
                int semestre = sc.nextInt();
                modificacion.setSemestre(semestre);
                break;
            case "6":
                System.out.println("Ingrese el grupo: ");
                String grupo = sc.nextLine();
                modificacion.setGrupo(grupo);
                break;
            default:
                System.out.println("Ingrese una opcion vaida");
                break;
        }
    }
}
