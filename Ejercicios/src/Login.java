import java.util.Scanner;

public class Login {
    public static void main(String[] args) {

        String usuario;
        int clave;

        Scanner datosUsuario = new Scanner(System.in);
        System.out.println("Ingrese usuario");
        usuario = datosUsuario.nextLine();
        System.out.println("Ingrese Contraseña");
        clave = datosUsuario.nextInt();

        if(usuario.equals("lamay") && clave==4698){
            System.out.println("Inicio de sesión correcto!");
        }
        else{

            System.out.println("Nombre de usuario incorrecto!");
        }

    }
}
