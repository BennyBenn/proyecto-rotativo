import java.util.List;
import java.util.ArrayList;
import java.util.Scanner;
public class Visualizacion_general extends Validacion_general implements Mostrar, Modificar, Eliminar{
    private Scanner sc = new Scanner(System.in);
    private String usuario;
    private String decision;
    private List<Usuario> lista;
    private List<Usuario> lista_modificacion;
    private List<Usuario> copiaLista;


    public Visualizacion_general(List<Usuario> lista){
        this.lista = lista;
        this.lista_modificacion = new ArrayList<>(lista);
    }


    public void Mostrardatos(){
        for (Usuario elemento : lista){System.out.println(elemento);}
    }

    public void Mostrardatos(String usuario){
        this.usuario = usuario;
        for (Usuario elemento : lista){
            if (elemento.getNombre().equals(usuario)){System.out.println(elemento);}
        }
    }

    public void Modificardatos(){}

    public void Modificardatos(String usuario){
        this.usuario = usuario;
        for (Usuario elemento : lista) {if (elemento.getNombre().equals(usuario)){
            System.out.println(elemento);
            do {
                Manejardatos(lista_modificacion, elemento);
                System.out.println("¿Desea continuar (S/N): ");
                decision = sc.nextLine();
            } while (decision.equals("S"));
        }
        }
    }

    public void Eliminardatos(){}
    public void Eliminardatos(String usuario){
        this.usuario = usuario;
        copiaLista = new ArrayList<>(lista_modificacion);
        for (Usuario elemento : copiaLista) {if (elemento.getNombre().equals(usuario)) {
            Olvidardatos(lista_modificacion, elemento);}
        }
    }
}