import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

public class AdaptadorMySQL extends AdaptadorBaseDatos {

    private Connection conexion;

    @Override
    public void conectar() {
        try {
            // Carga del driver JDBC
            Class.forName("com.mysql.cj.jdbc.Driver");

            // URL, usuario y contraseña para la conexión
            String url = "jdbc:mysql://localhost:3306/hospital_a"; // Cambia 'hospital' por tu base de datos
            String usuario = "root"; // Cambia 'root' por tu usuario
            String contrasena = "admin"; // Cambia 'tu_contrasena' por tu contraseña

            // Establece la conexión
            conexion = DriverManager.getConnection(url, usuario, contrasena);
            System.out.println("Conexión a MySQL exitosa.");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    @Override
    public void ejecutarConsulta(String consulta) {
        try {
            Statement statement = conexion.createStatement();
            statement.executeUpdate(consulta);
            System.out.println("Consulta ejecutada: " + consulta);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    @Override
    public void cerrarConexion() {
        try {
            if (conexion != null && !conexion.isClosed()) {
                conexion.close();
                System.out.println("Conexión MySQL cerrada.");
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}