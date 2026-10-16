import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {

        ArrayList<ProveedorIdentidad> proveedores = new ArrayList<>();

        proveedores.add(new AuthGoogle());
        proveedores.add(new AuthGitHub());
        proveedores.add(new AuthApple());

        String[] tokens = {
                "GOOGLE123",
                "TOKEN_INCORRECTO",
                "APPLE123"
        };

        for (int i = 0; i < proveedores.size(); i++) {

            ProveedorIdentidad proveedor = proveedores.get(i);

            boolean acceso = proveedor.validarToken(tokens[i]);

            System.out.println("Proveedor: " + proveedor.nombreProveedor);

            if (acceso) {
                System.out.println("Acceso autorizado");
            } else {
                System.out.println("Acceso denegado");
            }

            System.out.println("----------------------");
        }

    }

}
