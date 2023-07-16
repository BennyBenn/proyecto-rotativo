import java.util.List;
import java.util.ArrayList;
import java.util.Scanner;
public class Modificaciones_Sebastian extends Consultas{
    private List<Usuario> registro = new ArrayList<>();
    private String opcion;
    private Usuario buscado;
    private Scanner sc = new Scanner(System.in);
    public Usuario sesion(String usuario, String contrasena, List<Usuario> registro){
        for(Usuario usuarios : registro){
            if(usuarios.getNombreUsuario().equals(usuario) && usuarios.getContrasena().equals(contrasena)){
                System.out.println("Acceso permitido"); return usuarios;}
        }System.out.println("Acceso denegado"); return null;
    }
//Interfaz para super usuario
    public void interfazSuper(Usuario usuario, Visualizacion_general prueba, String opcion){
        switch (opcion){
            case "1":
                String elemento1 = sc.nextLine();
                Usuario buscar = buscar(elemento1, registro);
                consultarUsuario_Datos(buscar);
                break;
            case "2":
                String cond1 = sc.nextLine();
                String cond2 = sc.nextLine();
                String cond3 = sc.nextLine();
                String par1 = sc.nextLine();
                String par2 = sc.nextLine();
                int par3 = sc.nextInt();
                Usuario elementos = new Usuario(cond1, cond2, cond3);
                elementos.nombreUsuario = par1;
                elementos.contrasena = par2;
                elementos.nivelPrivilegios = par3;
                System.out.println(elementos);
                registro.add(elementos);
                break;
            case "3":
                String elemento2 = sc.nextLine();
                prueba.Modificardatos(elemento2);
                break;
            case "4":
                String elemento3 = sc.nextLine();
                prueba.Eliminardatos(elemento3);
                break;
            default:
                System.out.println("Ingrese una opcion valida");
                break;
        }
    }

    //Interfaz para Administrador
    public void interfazAdmin(Usuario usuario, Visualizacion_general prueba, String opcion){
        switch (opcion){
            case "1":
                String elemento1 = sc.nextLine();
                Usuario buscar = buscar(elemento1, registro);
                consultarUsuario_Datos(buscar);
                break;
            case "2":
                String cond1 = sc.nextLine();
                String cond2 = sc.nextLine();
                String cond3 = sc.nextLine();
                String par1 = sc.nextLine();
                String par2 = sc.nextLine();
                int par3 = sc.nextInt();
                Usuario elementos = new Usuario(cond1, cond2, cond3);
                elementos.nombreUsuario = par1;
                elementos.contrasena = par2;
                elementos.nivelPrivilegios = par3;
                System.out.println(elementos);
                registro.add(elementos);
                break;
            default:
                System.out.println("Ingrese una opcion valida");
                break;
        }
    }
    //Interfaz para estudiante
    public void interfazEstudiante(Usuario usuario, Visualizacion_general prueba){
        consultarUsuario_Datos(usuario);}

    public Usuario buscar(String usuario, List<Usuario> registro){
        for(Usuario usuarios : registro){
            if(usuarios.getNombre().equals(usuario)){return usuarios;}
        }return null;
    }

    public static void main(String[] args){
        String condicional;
        Scanner sc = new Scanner(System.in);
        //Decidí englobar todos los datos en un solo registro para todos los usuarios
        //Los usuarios se clasificarian por su nivel de privilegio
        List<Usuario> registro = new ArrayList<>();
        Visualizacion_general prueba = new Visualizacion_general(registro);
        Modificaciones_Sebastian instancia = new Modificaciones_Sebastian();

        Usuario Pedro = new Usuario("Pedro", "ID21010", "Director");
        Pedro.nombreUsuario = "Loca";
        Pedro.contrasena = "123";
        Pedro.nivelPrivilegios = 3;
        registro.add(Pedro);

        System.out.println("Ingrese su usuario: ");
        String usuario_1 = sc.nextLine();
        System.out.println("Ingrese su contraseña: ");
        String contrasena_1 = sc.nextLine();
        Usuario resultado = instancia.sesion(usuario_1, contrasena_1, registro);

        if(resultado.nivelPrivilegios == 3){
            do {
                System.out.println("Bienvenido " + resultado.getNombre());
                System.out.println("1. Consultar\n2. Crear\n3. Modificar\n4. Eliminar");
                System.out.println("Ingrese una opcion: ");
                String opcion = sc.nextLine();
                instancia.interfazSuper(resultado, prueba, opcion);
                System.out.println("¿Desea continuar? (S/N): ");
                condicional = sc.nextLine();
            }while(condicional.equals("S"));
        }else if(resultado.nivelPrivilegios==2){
            do {
                System.out.println("Bienvenido " + resultado.getNombre());
                System.out.println("1. Consultar\n2. Crear");
                System.out.println("Ingrese una opcion: ");
                String opcion = sc.nextLine();
                instancia.interfazAdmin(resultado, prueba, opcion);
                System.out.println("¿Desea continuar? (S/N): ");
                condicional = sc.nextLine();
            }while(condicional.equals("S"));
        }else{
            do {
                System.out.println("Bienvenido " + resultado.getNombre());
                instancia.interfazEstudiante(resultado, prueba);
                System.out.println("¿Desea continuar? (S/N): ");
                condicional = sc.nextLine();
            }while(condicional.equals("S"));
        }
    }
}
