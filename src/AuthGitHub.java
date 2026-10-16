
public class AuthGitHub extends ProveedorIdentidad {

    public AuthGitHub() {
        super("GitHub");
    }

    @Override
    public boolean validarToken(String tokenAcceso) {

        if (tokenAcceso == null || tokenAcceso.isEmpty()) {
            return false;
        }

        System.out.println("Verificando token con GitHub...");

        return tokenAcceso.equals("GITHUB123");
    }

}
