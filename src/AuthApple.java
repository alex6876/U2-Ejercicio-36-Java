
public class AuthApple extends ProveedorIdentidad {

    public AuthApple() {
        super("Apple");
    }

    @Override
    public boolean validarToken(String tokenAcceso) {

        if (tokenAcceso == null || tokenAcceso.isEmpty()) {
            return false;
        }

        System.out.println("Verificando token con Apple...");

        return tokenAcceso.equals("APPLE123");
    }

}
