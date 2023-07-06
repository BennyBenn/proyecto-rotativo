//Main del proyecto
//Solo se usara para inicializar el proyecto, mas no para crear metodos o atributos

import java.util.ArrayList;
import java.util.List;
import java.io.File;
import java.io.FileWrite;
import java.io.IOExceptiom;
public class Main {
    public static void main(String[] args) {
        //Pruebas para la clase Visualizacion
        /*List<Estudiante> lista = new ArrayList<>();
        lista.add (new Estudiante("Alejandro", "ID21156", "SOFT", 4, "302"));
        lista.add (new Estudiante("Rodolfo", "ID21119", "SOFT", 4, "302"));

        Usuario Joaquin = new Usuario("Joaquin", "ID21111", "STMS");
        List<Usuario> accesos = new ArrayList<>();
        Joaquin.nombreUsuario = "chaparro";
        Joaquin.contrasena = "1010";
        Joaquin.nivelPrivilegios = 3;
        accesos.add(Joaquin);

        Visualizacion prueba = new Visualizacion(lista);
        prueba.modificarDatos("Rodolfo", accesos, "chaparro", "1010");
        prueba.mostrarDatos();
        prueba.eliminarDatos("Rodolfo", accesos, "chaparro", "1010");*/
        administrador ad1=new administrador("","","","");
       ad1.generarreportes("hola","como estan");
    }
}