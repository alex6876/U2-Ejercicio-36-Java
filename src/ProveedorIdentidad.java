
public abstract class ProveedorIdentidad {

    protected String nombreProveedor;

    public ProveedorIdentidad(String nombreProveedor) {
        this.nombreProveedor = nombreProveedor;
    }

    public abstract boolean validarToken(String tokenAcceso);

}
