import java.util.Scanner;
import java.text.SimpleDateFormat;
import java.util.Date;
public class Evaluacion_general {
    private Scanner sc = new Scanner(System.in);
    SimpleDateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy");
    public void evaluar(String opcion, Usuario modificacion){
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
                //¿cómo convertir una variable de tipo String en Date?
                /*modificacion.setFechaNacimiento(fechaNacimiento);*/
                break;
            case "4":
                System.out.println("Ingrese el cargo: ");
                String cargo = sc.nextLine();
                modificacion.setCargo(cargo);
                break;
            default:
                System.out.println("Ingrese una opcion vaida");
                break;
        }
    }
}
