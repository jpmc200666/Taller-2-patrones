public abstract class AdaptadorBaseDatos {

    public abstract void conectar();

    public abstract void ejecutarConsulta(String consulta);

    public abstract void cerrarConexion();  
}
