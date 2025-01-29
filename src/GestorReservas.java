public class GestorReservas {

    private AdaptadorBaseDatos adaptadorBaseDatos;
    private ConexionBaseDatosSingleton conexion;

    public GestorReservas (AdaptadorBaseDatos adaptadorBaseDatos){
        this.adaptadorBaseDatos = adaptadorBaseDatos;
        this.conexion = ConexionBaseDatosSingleton.obtenerConexion();
    }

    public void crearReserva(String nombrePaciente, String nombreDoctor, String fechaHora) {
        String consulta = String.format(
            "INSERT INTO reservas (nombre_paciente, nombre_doctor, fecha_hora) VALUES ('%s', '%s', '%s')",
            nombrePaciente, nombreDoctor, fechaHora
        );
        adaptadorBaseDatos.ejecutarConsulta(consulta);
    }

    public void obtenerReserva(int idReserva) {
        String consulta = String.format("SELECT * FROM reservas WHERE id = %d", idReserva);
        adaptadorBaseDatos.ejecutarConsulta(consulta);
    }
}
