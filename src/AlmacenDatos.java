import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.List;
import java.util.Scanner;
import java.util.Date;


public class AlmacenDatos {

    private Scanner sc = new Scanner(System.in);
    SimpleDateFormat formateador = new SimpleDateFormat("dd-MMM-yyyy");

    private List<Estudiante> listaEstudiante;
    private List<administrador> listaAdministrador;
    private List<SuperUsuario> listaSuperUsuario;

    public String getDatos_Estudiante(Estudiante estudiante) throws Exception{
        for (Estudiante prueba : listaEstudiante)
            if(prueba.getMatricula().equals(estudiante.getMatricula()))
                return prueba.getDatosAlumno();
        return "Estudiante no existente";
    }

    public void modificarDatos_Estudiante(Estudiante estudiante,int indiceModificar) throws Exception{
        //indice modificar es que dato del estudiante se va a modificar
        // sea 1) NOmbre, 2)Matricula, 3)Fecha nacimiento, 4)Cargo, 5)Carrera, 6)Semestre, 7) GRupo
        for (Estudiante prueba : listaEstudiante)
            if(prueba.getMatricula().equals(estudiante.getMatricula()))
                switch (indiceModificar){
                    case 1:
                        //System.out.println("El nombre actual es: " + prueba.getNombre());
                        System.out.println("Ingrese el nuevo nombre: ");
                        String nombreNuevo = sc.nextLine();
                        prueba.setNombre(nombreNuevo);
                        break;
                    case 2:
                        //System.out.println("El nombre actual es: " + prueba.getNombre());
                        System.out.println("Ingrese la nueva matricula");
                        String matriculaNueva = sc.nextLine();
                        prueba.setMatricula(matriculaNueva);
                        break;
                    case 3:
                        try {
                            //System.out.println("El nombre actual es: " + prueba.getNombre());
                            System.out.println("Ingrese la nueva fecha de nacimiento\n dd-mm-YYYY");
                            String fechaNueva = sc.nextLine();
                            Date fechaNuevaa = formateador.parse(fechaNueva);
                            prueba.setFechaNacimiento(fechaNuevaa);
                        }catch (ParseException e){
                            e.printStackTrace();
                        }
                        break;
                    case 4:
                        //System.out.println("El nombre actual es: " + prueba.getNombre());
                        System.out.println("Ingrese el nuevo cargo");
                        String cargoNuevo = sc.nextLine();
                        prueba.setCargo(cargoNuevo);
                        break;
                    case 5://carrera
                        //System.out.println("El nombre actual es: " + prueba.getNombre());
                        System.out.println("Ingrese la nueva matricula");
                        String carreraNueva = sc.nextLine();
                        prueba.setCarrera(carreraNueva);
                        break;
                    case 6://semestre
                        //System.out.println("El nombre actual es: " + prueba.getNombre());
                        System.out.println("Ingrese la nueva matricula");
                        int semestreNueva = sc.nextInt();
                        prueba.setSemestre(semestreNueva);
                        break;
                    case 7://grupo
                        //System.out.println("El nombre actual es: " + prueba.getNombre());
                        System.out.println("Ingrese la nueva matricula");
                        String grupoNuevo = sc.nextLine();
                        prueba.setGrupo(grupoNuevo);
                        break;

                    default:
                        System.out.println("Ningun cambio realizado");
                        break;
                }

    }





}
