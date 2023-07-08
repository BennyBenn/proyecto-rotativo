import java.util.List;
import java.util.ArrayList;
import java.util.Scanner;
public class Visualizacion extends Validacion implements Mostrar, Modificar, Eliminar{
    private Scanner sc = new Scanner(System.in);
    private String usuario;
    private String decision;
    private List<Estudiante> lista;
    private List<Estudiante> lista_modificacion;
    private List<Estudiante> copiaLista;


    public Visualizacion(List<Estudiante> lista){
        this.lista = lista;
        this.lista_modificacion = new ArrayList<>(lista);
    }

    public void Mostrardatos(){
        for (Estudiante elemento : lista){System.out.println(elemento);}
    }

    public void Mostrardatos(String usuario){
        this.usuario = usuario;
        for (Estudiante elemento : lista){
            if (elemento.getNombre().equals(usuario)){System.out.println(elemento);}
        }
    }

    public void Modificardatos() {
        for (Usuario elemento : lista_modificacion){System.out.println(elemento);}
    }

    public void Modificardatos(String usuario){
        this.usuario = usuario;
        for (Estudiante elemento : lista) {if (elemento.getNombre().equals(usuario)){
            System.out.println(elemento);
            do {
                Manejardatos(lista_modificacion, elemento);
                System.out.println("¿Desea continuar (S/N): ");
                decision = sc.nextLine();
            } while (decision.equals("S"));
        }
        }
    }

    public void Eliminardatos(String usuario){
        this.usuario = usuario;
        copiaLista = new ArrayList<>(lista_modificacion);
        for (Estudiante elemento : copiaLista) {if (elemento.getNombre().equals(usuario)) {
            Olvidardatos(lista_modificacion, elemento);}
        }
    }
}
