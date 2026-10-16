
public class AuthGoogle extends ProveedorIdentidad {

    public AuthGoogle() {
        super("Google");
    }

    @Override
    public boolean validarToken(String tokenAcceso) {

        if (tokenAcceso == null || tokenAcceso.isEmpty()) {
            return false;
        }

        System.out.println("Verificando token con Google...");

        return tokenAcceso.equals("GOOGLE123");
    }

}

