public class Consultas {


    public String consultarUsuario_Datos(Usuario usuarioConsultar){
        return usuarioConsultar.getDatosUsuario();
    }

    public String consultarUsuario_DatosDetallados(Usuario usuarioConsultar){
        return usuarioConsultar.toString();
    }

    public String consultarEstudiante_Datos(Estudiante estudianteConsultar){
        return estudianteConsultar.getDatosAlumno();
    }

    public String consultarEstudiante_DatosDetallados(Estudiante estudianteConsultar){
        return estudianteConsultar.toString();
    }



}
