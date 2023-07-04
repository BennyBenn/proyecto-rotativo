import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Scanner;
public class Visualizacion extends Usuario{
    private Scanner sc = new Scanner(System.in);
    private String usuario;
    private String usuarioAcceso;
    private String contrasena;
    private List<Estudiante> lista;
    private List<Estudiante> lista_modificacion;
    private List<Usuario> listaUsuario;
    private int posicion;
    private String respuesta;
    private Estudiante modificacion;

    public Visualizacion(List<Estudiante> lista){
        this.lista = lista;
        this.lista_modificacion = new ArrayList<>(lista);

    }
    public void setLista(List lista){
        this.lista = lista;
    }

    public List getLista(){
        return lista;
    }

    public void setListaModificada(List listaModificada){
        this.lista_modificacion = listaModificada;
    }

    public List getListaModificada(){
        return lista_modificacion;
    }
    public void mostrarDatos(){
        System.out.println("Los datos son los siguientes: \n");
        for(Estudiante elemento: lista){
            System.out.println(elemento);
        }

    }

    public void mostrarDatos(String usuario){
        this.usuario = usuario;
        for(Estudiante elemento: lista){
            if (elemento.getNombre() == usuario){
                System.out.println(elemento);
            }
        }
    }

    public void modificarDatos(){
        System.out.println("Los datos son los siguientes: \n");
        for (Usuario elemento: lista_modificacion) {
            System.out.println(elemento);
        }
    }

    public void modificarDatos(String usuario, List<Usuario> listaUsuario, String usuarioAcceso, String contrasena){
        super.setNombreUsuario(usuarioAcceso);
        super.setContrasena(contrasena);
        this.listaUsuario = listaUsuario;
        this.usuario = usuario;

        for (Usuario acceso: listaUsuario){
            if(acceso.getNombreUsuario() == usuarioAcceso){
                if (acceso.getContrasena() == contrasena){
                    if (acceso.nivelPrivilegios > 1) {
                        System.out.println("Acceso habilitado");
                        for(Estudiante elemento: lista_modificacion){
                            if (elemento.getNombre() == usuario){
                                System.out.println("El usuario a modificar es: \n" + elemento);
                                do {
                                    posicion = lista_modificacion.indexOf(elemento);
                                    modificacion = new Estudiante(elemento.getNombre(), elemento.getMatricula(), elemento.getCarrera(), elemento.getSemestre(), elemento.getGrupo());
                                    System.out.println("1. Nombre\n2. Matricula\n3. Fecha de Nacimiento\n4. Carrera\n5. Semestre\n6. Grupo");
                                    System.out.println("Ingrese la opción que desee: ");
                                    String opcion = sc.nextLine();
                                    switch (opcion){
                                        case "1":
                                            System.out.println("Ingrese el nuevo nombre: \n");
                                            String nombre = sc.nextLine();
                                            modificacion.setNombre(nombre);
                                            break;
                                        case "2":
                                            System.out.println("Ingrese la nueva matricula: \n");
                                            String matricula = sc.nextLine();
                                            modificacion.setMatricula(matricula);
                                            break;
                                        case "3":
                                            System.out.println("Ingrese la fecha de nacimiento: \n");
                                            break;
                                        case "4":
                                            System.out.println("Ingrese la carrera: \n");
                                            String carrera = sc.nextLine();
                                            modificacion.setCarrera(carrera);
                                            break;
                                        case "5":
                                            System.out.println("Ingrese el semestre: \n");
                                            int semestre = sc.nextInt();
                                            modificacion.setSemestre(semestre);
                                            break;
                                        case "6":
                                            System.out.println("Ingrese el grupo: \n");
                                            String grupo = sc.nextLine();
                                            modificacion.setGrupo(grupo);
                                            break;
                                        default:
                                            System.out.println("Ingrese una opcion vaida");
                                            break;
                                    }
                                    System.out.println("¿Desea continuar (S/N): \n");
                                    respuesta = sc.nextLine();
                                }while(respuesta == "S");
                                lista_modificacion.remove(posicion);
                                lista_modificacion.add(posicion, modificacion);
                            }
                        }
                    } else{System.out.println("Acceso denegado");}
                }else{System.out.println("Contraseña no válida");}
            } else{System.out.println("Usuario no encontrado");}
        }
    }

    public void eliminarDatos(String usuario, List<Usuario> listaUsuario, String usuarioAcceso, String contrasena){
        super.setNombreUsuario(usuarioAcceso);
        super.setContrasena(contrasena);
        this.listaUsuario = listaUsuario;
        this.usuario = usuario;
        for (Usuario acceso: listaUsuario){
            if(acceso.getNombreUsuario() == usuarioAcceso){
                if(acceso.getContrasena() == contrasena){
                    if(acceso.nivelPrivilegios > 1){
                        System.out.println("Acceso habilitado");
                        List<Estudiante> copiaLista = new ArrayList<>(lista_modificacion);
                        for(Estudiante elemento: copiaLista){
                            if (elemento.getNombre() == usuario){
                                System.out.println("¿Está seguro de eliminar el registro " + elemento.getNombre() + "? (S/N): ");
                                respuesta = sc.nextLine();
                                if (respuesta.equals("S")){
                                    lista_modificacion.remove(posicion);
                                }
                                else {
                                    System.out.println("Solicitud cancelada");
                                }
                            } posicion++;
                        }
                    } else {System.out.println("Acceso denegado");}
                }else{System.out.println("Contraseña inválida");}
            } else{System.out.println("Usuario no encontrado");}
        }
    }
}
