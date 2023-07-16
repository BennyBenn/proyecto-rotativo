import java.util.List;
import java.util.Scanner;
public class Validacion_general extends Evaluacion_general{
    private int posicion;
    private Usuario modificacion;
    private String respuesta;
    private Scanner sc = new Scanner(System.in);

    public void Manejardatos(List<Usuario> lista_modificacion, Usuario elemento){
        posicion = lista_modificacion.indexOf(elemento);
        modificacion = new Usuario(elemento.getNombre(), elemento.getMatricula(), elemento.getCargo());

        System.out.println("1. Nombre\n2. Matricula\n3. Fecha de Nacimiento\n4. Cargo");
        System.out.println("Ingrese la opción que desee: ");
        String opcion = sc.nextLine();

        evaluar(opcion, modificacion);

        lista_modificacion.remove(posicion);
        lista_modificacion.add(posicion, modificacion);
    }

    public void Olvidardatos(List<Usuario> lista_modificacion, Usuario elemento){
        posicion = lista_modificacion.indexOf(elemento);

        System.out.println("¿Está seguro de eliminar el registro " + elemento.getNombre() + "? (S/N): ");
        respuesta = sc.nextLine();

        if (respuesta.equals("S")){lista_modificacion.remove(posicion);}
        else {System.out.println("Solicitud cancelada");}
    }
}