public class App {
    public static void main(String[] args) throws Exception {
        
        // Hospital A usando MySQL
        AdaptadorBaseDatos adaptadorMySQL = new AdaptadorMySQL();
        adaptadorMySQL.conectar();
    
        GestorReservas gestorReservasA = new GestorReservas(adaptadorMySQL);
        gestorReservasA.crearReserva("Juan Pérez", "Dra. Maria", "2025-01-29 14:00");
        adaptadorMySQL.cerrarConexion();

    }
}
