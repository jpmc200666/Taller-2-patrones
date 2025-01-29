public class AdaptadorPostgreSQL extends AdaptadorBaseDatos{
    
    @Override
    public void conectar() {
        System.out.println("Conectando a PostgreSQL...");
        // Lógica específica de conexión a PostgreSQL
    }

    @Override
    public void ejecutarConsulta(String consulta) {
        System.out.println("Ejecutando en PostgreSQL: " + consulta);
        // Lógica específica para ejecutar una consulta en PostgreSQL
    }

    @Override
    public void cerrarConexion() {
        System.out.println("Cerrando conexión PostgreSQL");
        // Lógica específica para cerrar la conexión a PostgreSQL
    }
}
